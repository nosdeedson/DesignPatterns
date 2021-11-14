package decorator;

public abstract class Size {
	
	private String name;
	private Double size;
	
	public Size(String name, Double size) {
		this.name = name;
		this.size = size;
	}
	
	public Double calculateCost() {
		return size;
	};
}
