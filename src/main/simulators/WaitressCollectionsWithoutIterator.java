package main.simulators;

import iteratorPattern.collectionsToHandle.DinnerMenu;
import iteratorPattern.collectionsToHandle.MenuItem;
import iteratorPattern.collectionsToHandle.PancakeHouseMenu;

public class WaitressCollectionsWithoutIterator {

	/* to print the menus */
	public static void printMenus() {
		DinnerMenu dinnerMenu = new DinnerMenu();
		PancakeHouseMenu pancakeHouse = new PancakeHouseMenu();
		System.out.println("Dinner menu");
		for (int i = 0; i < dinnerMenu.getNumberOfItems(); i++) {
			MenuItem item = dinnerMenu.getMenuItems()[i];
			System.out.println(item.getName());
			System.out.println(item.getDescription());
			System.out.println(item.getPrice());
			System.out.println(item.isVegetarian());
		}
		System.out.println("\nPancake house");
		for (int i = 0; i < pancakeHouse.getMenuItems().size(); i++) {
			MenuItem item = pancakeHouse.getMenuItems().get(i);
			System.out.println(item.getName());
			System.out.println(item.getDescription());
			System.out.println(item.getPrice());
			System.out.println(item.isVegetarian());
		}

	}

}
