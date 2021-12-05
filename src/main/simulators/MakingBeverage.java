package main.simulators;

import encapsulatingAlgorithmsPattern.CafeineBerage;
import encapsulatingAlgorithmsPattern.Coffee;
import encapsulatingAlgorithmsPattern.Tea;

public class MakingBeverage {

	public static void makingBeverage() {
		CafeineBerage coffee = new Coffee();
		CafeineBerage tea = new Tea();
		System.out.println("Making a coffee");
		coffee.prepareRecipe();
		System.out.println("\nMaking a tea");
		tea.prepareRecipe();
	}
}
