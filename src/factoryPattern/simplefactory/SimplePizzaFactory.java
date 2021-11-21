package factoryPattern.simplefactory;

import factoryPattern.ingredientFactory.PizzaIngredientFactory;
import factoryPattern.pizzas.CheesePizza;
import factoryPattern.pizzas.ClamPizza;
import factoryPattern.pizzas.GreekPizza;
import factoryPattern.pizzas.PepperoniPizza;
import factoryPattern.pizzas.Pizza;
import factoryPattern.pizzas.SimplePizza;
import factoryPattern.pizzas.VeggiePizza;

public class SimplePizzaFactory {

	private PizzaIngredientFactory ingredientFactory;
	
	public SimplePizzaFactory (PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ( type.equals("cheese")) {
			pizza =  new CheesePizza("Cheese", ingredientFactory);
		}else if(type.equals("greek")) {
			pizza =  new GreekPizza("Greek", ingredientFactory);
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza("Pepperoni", ingredientFactory);
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza("Veggie", ingredientFactory);
		}else if(type.equals("clam")) {
			pizza = new ClamPizza("Clam", ingredientFactory);
		}else {
			pizza = new SimplePizza();
		}
		
		return pizza;
	}
	
}
