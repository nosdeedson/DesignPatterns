package factoryPattern.pizzas;

import factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class VeggiePizza  extends Pizza{

	private PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(String name, PizzaIngredientFactory ingredientFactory) {
		super(name);
		this.ingredientFactory = ingredientFactory;
		prepare();
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + super.getName());
		this.ingredientFactory.createDough();
		this.ingredientFactory.createSauce();
		this.ingredientFactory.createVeggies();
	}

}
