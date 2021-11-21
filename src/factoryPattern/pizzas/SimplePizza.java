package factoryPattern.pizzas;

import factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class SimplePizza extends Pizza {

	private PizzaIngredientFactory ingredienteFactory;
	
	public SimplePizza(String name, PizzaIngredientFactory ingredienteFactory) {
		super(name);
		this.ingredienteFactory = ingredienteFactory;
		prepare();
	}

	public SimplePizza() {	}

	@Override
	void prepare() {
		System.out.println("Preparing " + super.getName());
		this.ingredienteFactory.createDough();
		this.ingredienteFactory.createSauce();
		this.ingredienteFactory.createCheese();
	}

}
