package main.simulators;

import factoryPattern.factoryMethod.PizzaStore;
import factoryPattern.pizzas.Pizza;

public class PizzaFactoryMethodStore {
	
	private PizzaStore store;
	
	public PizzaFactoryMethodStore() {}
	
	public PizzaFactoryMethodStore(PizzaStore store) {
		this.store = store;
	}

	public void delivering(String type) {
		Pizza pizza = store.orderPizza(type);
		System.out.println("Wich: " + pizza.toString());
	}
}
