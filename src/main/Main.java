package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import compositePattern.Directory;
import facadePattern.eletronics.Amplifier;
import facadePattern.eletronics.CdPlayer;
import facadePattern.eletronics.DvdPlayer;
import facadePattern.eletronics.PopcornPopper;
import facadePattern.eletronics.Projector;
import facadePattern.eletronics.Screen;
import facadePattern.eletronics.TheaterLights;
import facadePattern.eletronics.Tuner;
import facadePattern.facade.HomeTheaterFacade;
import factoryPattern.factoryMethod.ChicagoStylePizzaStore;
import factoryPattern.factoryMethod.NYStylePizzaStore;
import factoryPattern.ingredientFactory.ChicagoPizzaIngredientFactory;
import factoryPattern.ingredientFactory.NYPizzaIngredientFactory;
import factoryPattern.simplefactory.SimplePizzaFactory;
import iteratorPattern.collectionsToHandle.DinnerMenu;
import iteratorPattern.collectionsToHandle.PancakeHouseMenu;
import main.simulators.AdapterSimulator;
import main.simulators.CompositeSimulator;
import main.simulators.GumBallTestDriverWithStatePattern;
import main.simulators.GumballTestDriver;
import main.simulators.GumballTestDriverWithAbstractClass;
import main.simulators.WaitressCollectionsWithoutIterator;
import main.simulators.WaitressWithIterator;
import main.simulators.HomeTheaterWithoutFacadeSimulator;
import main.simulators.MakingBeverage;
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
//		RemoteControlSimulator.remoteControlSimulator();
		
		/* adapter pattern*/
//		AdapterSimulator.testingAdapter();
		
		/* home theater without facade*/
//		PopcornPopper pop = new PopcornPopper();
//		TheaterLights lights = new TheaterLights();
//		DvdPlayer dvd = new DvdPlayer();
//		Projector projector = new Projector(dvd);
//		Screen screen = new Screen();
//		Amplifier amplifier = new Amplifier(new Tuner(), dvd, new CdPlayer());
//		
//		HomeTheaterWithoutFacadeSimulator.testDriveHomeTheaterWatchMovie(pop, lights, screen, projector, amplifier);
//		HomeTheaterWithoutFacadeSimulator.testDriveHomeTheaterTurnOffMovie(pop, lights, screen, projector, amplifier);
		
		/* Using facade*/
//		Tuner tuner  = new Tuner();
//		DvdPlayer dvd = new DvdPlayer();
//		CdPlayer cd = new CdPlayer();
//		Amplifier amplifier = new Amplifier(tuner, dvd, cd);
//		
//		Screen screen = new Screen();
//		PopcornPopper popcornPopper = new PopcornPopper();
//		TheaterLights theaterLights = new TheaterLights();
//		Projector projector = new Projector(dvd);
// 		HomeTheaterFacade facade = new HomeTheaterFacade(amplifier, screen, popcornPopper, theaterLights, projector);
// 		facade.watchMovie();
// 		facade.endMovie();
		
		/* Making beverage using template method */
//		MakingBeverage.makingBeverage();
		
		/* Handling collections without iterator*/		
//		WaitressCollectionsWithoutIterator.printMenus();
		/* handling collections with iterator*/
//		PancakeHouseMenu pancakeMenu = new PancakeHouseMenu();
//		DinnerMenu dinnerMenu = new DinnerMenu();
//		WaitressWithIterator waitress = new WaitressWithIterator(pancakeMenu, dinnerMenu);
//		waitress.printMenu();
//		
//		waitress.removeDinnerMenu();
//		waitress.removePancakeMenu();
//		
//		waitress.printMenu();
		
		/*The composite pattern*/
//		Directory directory = new Directory("Documents");
//		CompositeSimulator simulator = new CompositeSimulator(directory);
//		simulator.create();
//		simulator.printNamesFiles(directory);
		
		/* without state patter*/
//		GumballTestDriver.testDriver();
		
		/* with state using interface*/
//		GumBallTestDriverWithStatePattern.gumballTestDriver();
		
		/* with state using an abstract class*/
		
		GumballTestDriverWithAbstractClass.tesdDriver();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
