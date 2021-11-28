package main;

import factoryPattern.factoryMethod.ChicagoStylePizzaStore;
import factoryPattern.factoryMethod.NYStylePizzaStore;
import factoryPattern.ingredientFactory.ChicagoPizzaIngredientFactory;
import factoryPattern.ingredientFactory.NYPizzaIngredientFactory;
import factoryPattern.simplefactory.SimplePizzaFactory;
import main.simulators.PizzaFactoryMethodStore;
import main.simulators.RemoteControlSimulator;
import main.simulators.SimplePizzaStore;
import main.simulators.ThreadSingletonCreator;

public class Main {

	public static void main(String[] args) {
		/** encapsulated behavior or strategy */
//		EncapsulatedBehaviorsSimulator.encapsulatedBehaviorsSimulator();

		/** Observer pattern */
//		WeatherStation.weatherStation();

		/** Singleton */
//		WhoAmI i = SingletonCreator.whoAmICreator("I was created right now!!");
//		System.out.println(i.toString());
//		SingletonCreator.sigletonWorking();
//		System.out.println(i.toString());
		
		/** The thread singleton */
//		ThreadSingletonCreator.createingChocolateBoiler();
		

		/** decorators */
//		StarbuzzStore.makeCoffes();

		/** Simple factory */
//		SimplePizzaStore store = new SimplePizzaStore(
//				new SimplePizzaFactory(new NYPizzaIngredientFactory()));
//		store.delivering("greek");
//		store.delivering("cheese");
//		
//		store = new SimplePizzaStore(
//				new SimplePizzaFactory(new ChicagoPizzaIngredientFactory()));
//		store.delivering("pepperoni");
//		store.delivering("clam");
//		store.delivering("veggie");
		
		/** Method factory */
//		PizzaFactoryMethodStore nyStore = new PizzaFactoryMethodStore(
//				new  NYStylePizzaStore(
//						new NYPizzaIngredientFactory()));
//		System.out.println("New York style");
//		nyStore.delivering("cheese");
//		nyStore.delivering("veggie");
//		System.out.println("\nChicago style");
//		PizzaFactoryMethodStore chicagoStore = new PizzaFactoryMethodStore(
//				new ChicagoStylePizzaStore(
//						new ChicagoPizzaIngredientFactory()));
//		chicagoStore.delivering("clam");
//		chicagoStore.delivering("pepperoni");
		
		/** Command pattern*/
		RemoteControlSimulator.remoteControlSimulator();
		
		
		
		
		
		
		
	}

}
