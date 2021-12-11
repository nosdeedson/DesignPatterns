package main.simulators;

import iteratorPattern.collectionsToHandle.DinnerMenu;
import iteratorPattern.collectionsToHandle.MenuItem;
import iteratorPattern.collectionsToHandle.PancakeHouseMenu;
import iteratorPattern.iterator.Iterator;

public class WaitressWithIterator {
	
	private PancakeHouseMenu pancakeHouseMenu;
	private DinnerMenu dinnerMenu;
	private java.util.Iterator<MenuItem> pancakeMenuIterator;
	private java.util.Iterator<MenuItem> dinnerIterator;
	
	public WaitressWithIterator(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public  void printMenu() {
		pancakeMenuIterator = this.pancakeHouseMenu.createIterator();
		dinnerIterator = this.dinnerMenu.createIterator();
		System.out.println("pancake menu");
		this.printMenu(pancakeMenuIterator);
		System.out.println("dinner menu");
		this.printMenu(dinnerIterator);
	}
	
	private void printMenu(java.util.Iterator<MenuItem> iterator) {
		int cont = 0;
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.getDescription());
			System.out.println(item.getName());
			System.out.println(item.getPrice());
			System.out.println(item.isVegetarian());
			System.out.println("cont: " + cont++);
		}
	}
	
	public void removeDinnerMenu() {
		dinnerIterator.remove();
	}
	
	public void removePancakeMenu() {
		pancakeMenuIterator.remove();
	}
	
}
