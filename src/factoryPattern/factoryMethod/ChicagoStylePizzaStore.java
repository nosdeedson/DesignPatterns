package factoryPattern.factoryMethod;

import factoryPattern.ingredientFactory.ChicagoPizzaIngredientFactory;
import factoryPattern.pizzas.CheesePizza;
import factoryPattern.pizzas.ClamPizza;
import factoryPattern.pizzas.GreekPizza;
import factoryPattern.pizzas.PepperoniPizza;
import factoryPattern.pizzas.Pizza;
import factoryPattern.pizzas.SimplePizza;
import factoryPattern.pizzas.VeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
	
	private ChicagoPizzaIngredientFactory ingredientFactory;
	
	public ChicagoStylePizzaStore(ChicagoPizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if ( type.equals("cheese")) {
			pizza =  new CheesePizza("Chicago Style cheese pizza", ingredientFactory);
			pizza.setCuttingShape("square");
		}else if(type.equals("greek")) {
			pizza =  new GreekPizza("Chicago Style Greek", ingredientFactory);
			pizza.setCuttingShape("square");
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza("Chicago Style Pepperoni", ingredientFactory);
			pizza.setCuttingShape("square");
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza("Chicago StyleVeggie", ingredientFactory);
			pizza.setCuttingShape("square");
		}else if(type.equals("clam")) {
			pizza = new ClamPizza("Chicago Style Clam", ingredientFactory);
			pizza.setCuttingShape("square");
		}else {
			pizza = new SimplePizza();
		}
		
		return pizza;
	}
	
	private void cut() {
		System.out.println("Cutting the ");
	}

}
