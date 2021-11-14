package decorator.beverages;

import decorator.Size;

public class Expresso extends Beverage {
	
	private Size size;

	public Expresso(String description, Size size) {
		super(description);
		this.size = size;
	}
	
	@Override
	public Double cost() {
		return 1.0 * size.calculateCost();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}
}
