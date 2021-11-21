package main.simulators;

import factoryPattern.pizzas.Pizza;
import factoryPattern.simplefactory.SimplePizzaFactory;

public class SimplePizzaStore {
	
	private SimplePizzaFactory simpleFactory;

	public SimplePizzaStore(SimplePizzaFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza  pizza;
		pizza = simpleFactory.createPizza(type);
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public void delivering(String type) {
		Pizza pizza =  this.orderPizza(type);
		System.out.println("\n\n");
	}
	
	

}
