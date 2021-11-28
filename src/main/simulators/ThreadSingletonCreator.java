package main.simulators;

import singleton.threadSingleton.ChocolateBoiler;

public class ThreadSingletonCreator {
	
	public static void createingChocolateBoiler() {
		
		ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
		
		chocolateBoiler1.fill();
		
		ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
		
		
		chocolateBoiler2.fill();
		
		chocolateBoiler2.boil();
		
		chocolateBoiler1.boil();
		
		chocolateBoiler1.drain();
		
		chocolateBoiler2.drain();
	}

}
