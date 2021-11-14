package decorator.beverages;

import decorator.Size;

public class HouseBlend extends Beverage{

	private Size size;
	
	public HouseBlend(String description, Size size) {
		super(description);
		this.size = size;
	}
	
	
	@Override
	public Double cost() {
		return 1.2 * size.calculateCost();
	}

	@Override
	public String getDescription() {
		return super.getDescription();
	}
	
}
