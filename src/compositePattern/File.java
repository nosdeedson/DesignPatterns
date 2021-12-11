package compositePattern;

public class File extends IDirectory {
	
	private String typeFile;
	
	
	public File(String name, String typeFile) {
		super(name);
		this.typeFile = typeFile;
	}


	@Override
	public void action() {
		System.out.println(this.typeFile);
	}
}
