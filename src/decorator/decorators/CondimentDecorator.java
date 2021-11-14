package decorator.decorators;

import decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

	public CondimentDecorator(String description) {
		super(description);
	}

	public String getDescription() {
		return super.getDescription();
	}
}
