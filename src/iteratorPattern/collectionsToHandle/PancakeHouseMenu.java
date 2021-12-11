package iteratorPattern.collectionsToHandle;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	
	private ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<MenuItem>();
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", false, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Wafﬂes", "Wafﬂes, with your choice of blueberries or strawberries", true, 3.59);
	}
	
	public java.util.Iterator<MenuItem> createIterator(){
		return this.menuItems.iterator();
	}
	
//	public Iterator createIterator( ) {
//		return new PancakeMenuIterator(menuItems);
//	}
	
	public void addItem(String name, String description, boolean vegetariano, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetariano, price);
		this.menuItems.add(menuItem);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	

}
