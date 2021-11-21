package factoryPattern.factoryMethod;

import factoryPattern.ingredientFactory.PizzaIngredientFactory;
import factoryPattern.pizzas.CheesePizza;
import factoryPattern.pizzas.ClamPizza;
import factoryPattern.pizzas.GreekPizza;
import factoryPattern.pizzas.PepperoniPizza;
import factoryPattern.pizzas.Pizza;
import factoryPattern.pizzas.SimplePizza;
import factoryPattern.pizzas.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
	
	private PizzaIngredientFactory ingredientFactory;
	
	public NYStylePizzaStore(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if ( type.equals("cheese")) {
			pizza =  new CheesePizza("New York Style Cheese", ingredientFactory);
		}else if(type.equals("greek")) {
			pizza =  new GreekPizza("New York Style Greek", ingredientFactory);
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza("New York Style Pepperoni", ingredientFactory);
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza(" New York Style Veggie", ingredientFactory);
		}else if(type.equals("clam")) {
			pizza = new ClamPizza(" New York Style Clam", ingredientFactory);
		}else {
			pizza = new SimplePizza();
		}
		
		return pizza;
	}

}
