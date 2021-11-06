package main;

import main.simulators.SingletonCreator;
import singleton.WhoAmI;

public class Main {
	
	public static void main(String[] args) {
		/** encapsulated behavior or strategy */
//		EncapsulatedBehaviorsSimulator.encapsulatedBehaviorsSimulator();
	
		/** Observer pattern */
//		WeatherStation.weatherStation();
		
		/** Singleton */
		WhoAmI i = SingletonCreator.whoAmICreator("I was created right now!!");
		System.out.println(i.toString());
		SingletonCreator.sigletonWorking();
		System.out.println(i.toString());
	}

}
