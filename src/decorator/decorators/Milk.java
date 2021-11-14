package decorator.decorators;

import decorator.beverages.Beverage;

public class Milk extends CondimentDecorator {
	
	private Beverage beverageToDecorate;
	
	public Milk(String description, Beverage beverage) {
		super(description);
		this.beverageToDecorate = beverage;
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + this.beverageToDecorate.getDescription();
	}
	
	@Override
	public Double cost() {
		return this.beverageToDecorate.cost() + 0.8;
	}

	@Override
	public String toString() {
		return "Milk costs " + this.getDescription() ;
	}

	
}
