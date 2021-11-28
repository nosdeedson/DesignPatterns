package singleton.threadSingleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	/** We can initialize here, but this will create an instance eventhough we don't nedd it */
//	private static  ChocolateBoiler uniqueInstance = new ChocolateBoiler;
	
	
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	/** this is one way, but this will spent a lot of computation*/
//	private static ChocolateBoiler uniqueInstance;
//	public static synchronized ChocolateBoiler getInstance() {
//		if(uniqueInstance == null) {
//			uniqueInstance = new ChocolateBoiler();
//		}
//		return uniqueInstance;
//	}
	
   private static ChocolateBoiler uniqueInstance;
   public static ChocolateBoiler getInstance() {
	   if ( uniqueInstance == null) {
		   synchronized (ChocolateBoiler.class) {
			if ( uniqueInstance == null) {
				uniqueInstance = new ChocolateBoiler();
			}
		}
	   }
	   return uniqueInstance;
   }
	
	public void fill() {
		if ( empty) {
			empty = false;
			boiled =false;
			System.out.println("I just being filled");			
		}
		else {
			System.out.println("I am alredy filled");
		}
		
	}
	
	public void drain() {
		if(!empty && boiled) {
			this.empty = true;
			System.out.println("I just being drainned");
		}else {
			System.out.println("I am empty");
		}
	}
	
	public void boil() {
		if(!empty && !boiled) {
			System.out.println("I am boilling");
			this.boiled = true;
		}else if (!empty && boiled) {
			System.out.println("I am boiled and wating to be drained");
		}else if( !empty && !boiled) {
			System.out.println("I am empty");
		}else {
			System.out.println("The system failed");
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}
	
	
}
