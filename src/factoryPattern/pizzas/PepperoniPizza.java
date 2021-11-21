package factoryPattern.pizzas;

import factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;
	public PepperoniPizza(String name, PizzaIngredientFactory ingredientFactory) {
		super(name);
		this.ingredientFactory = ingredientFactory;
		prepare();
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + super.getName());
		this.ingredientFactory.createDough();
		this.ingredientFactory.createSauce();
		this.ingredientFactory.createCheese();
	}
	
}
