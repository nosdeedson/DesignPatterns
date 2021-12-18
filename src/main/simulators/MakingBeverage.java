package main.simulators;

import templateMethodPattern.CafeineBerage;
import templateMethodPattern.Coffee;
import templateMethodPattern.Tea;

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
