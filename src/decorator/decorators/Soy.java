package decorator.decorators;

import decorator.beverages.Beverage;

public class Soy extends CondimentDecorator {

	private Beverage beverageToDecorate;
	
	public Soy(String description, Beverage beverage) {
		super(description);
		this.beverageToDecorate = beverage;
	}
	
	@Override
	public Double cost() {
		return this.beverageToDecorate.cost() + 0.7;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + this.beverageToDecorate.getDescription();
	}
}
