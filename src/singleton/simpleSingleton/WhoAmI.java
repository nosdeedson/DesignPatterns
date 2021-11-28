package singleton.simpleSingleton;

public class WhoAmI {
	
	private String whoAmI;
	private int id;
	
	public static WhoAmI instance;	
	
	protected WhoAmI() {}

	protected WhoAmI(String whoAmI) {
		this.whoAmI = whoAmI;
		this.id = 1;
	}

	public static WhoAmI getInstance( String whoAmI) {
		if ( instance == null) {
			instance = new WhoAmI(whoAmI);
		}else {
			instance.whoAmI = whoAmI;
		}
		return instance;
	}
	
	
	@Override
	public String toString() {
		return "[whoAmI = " + whoAmI + " id= " + id + "]";
	}

	public String getWhoAmI() {
		return whoAmI;
	}
	
	public int getId() {
		return id;
	}
}
