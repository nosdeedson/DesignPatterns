package decorator.decorators;

import decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator {

	private Beverage beverageToDecorate;
	
	public Mocha(String descritpion, Beverage beverage) {
		super(descritpion);
		this.beverageToDecorate = beverage;
	}
	
	@Override
	public Double cost() {
		return this.beverageToDecorate.cost() + 2.2;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + this.beverageToDecorate.getDescription();
	}
	
	@Override
	public String toString() {
		return "Mocha description" + this.getDescription() + " [beverageToDecorate=" + beverageToDecorate.getDescription() + "]";
	}
	
	
}
