package decorator.beverages;

import decorator.Size;

public class DarkRoast extends Beverage {

	private Size size;
	
	public DarkRoast(String description, Size size) {
		super(description);
		this.size = size;
	}
	
	@Override
	public Double cost() {
		return 1.1 * size.calculateCost();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription();
	}
}
