package compositePattern;

public abstract class IDirectory {
	
	private String name;
	
	public IDirectory(String name) {
		this.name = name;
	}

	public void add(IDirectory diretory) {
		throw new UnsupportedOperationException("Operation not availible");
	};
	
	public void remove(int id) {
		throw new UnsupportedOperationException("Operation not availible");
	};
	
	public IDirectory getChild(int id) {
		throw new UnsupportedOperationException("Operation not availible");
	}
	
	public void action() {
		throw new UnsupportedOperationException("Operation not availible");
	}
	
	public boolean hasChildDirectory() {
		throw new UnsupportedOperationException("Operation not availible");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
}
