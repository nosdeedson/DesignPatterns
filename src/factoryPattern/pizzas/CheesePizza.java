package factoryPattern.pizzas;

import factoryPattern.ingredientFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(String name, PizzaIngredientFactory ingredientFactory) {
		super(name);
		this.ingredientFactory = ingredientFactory;
		prepare();
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + super.getName());
		super.setDough(this.ingredientFactory.createDough());
 	    super.setSauce(this.ingredientFactory.createSauce());
		super.setCheese(this.ingredientFactory.createCheese());
	}
	
	

}
