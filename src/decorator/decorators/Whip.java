package decorator.decorators;

import decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {

	private Beverage beverageToDecorate;
	
	public Whip(String description, Beverage beverage) {
		super(description);
		this.beverageToDecorate = beverage;
	}
	
	@Override
	public Double cost() {
		return this.beverageToDecorate.cost() + 1.23;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + this.beverageToDecorate.getDescription();
	}
}
