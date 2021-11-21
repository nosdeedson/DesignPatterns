package factoryPattern.pizzas;

import factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(String name, PizzaIngredientFactory ingredientFactory) {
		super(name);
		this.ingredientFactory = ingredientFactory;
		prepare();
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + super.getName());
		super.setDough(this.ingredientFactory.createDough());
		super.setSauce(this.ingredientFactory.createSauce());
		super.setClam(this.ingredientFactory.createClam());
	}

}
