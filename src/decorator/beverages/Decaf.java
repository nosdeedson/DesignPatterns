package decorator.beverages;

import decorator.Size;

public class Decaf extends Beverage {

	private Size size;
	
	public Decaf(String description, Size size) {
		super(description);
		this.size = size;
	}

	@Override
	public Double cost() {
		return 0.9 * size.calculateCost();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}
}
