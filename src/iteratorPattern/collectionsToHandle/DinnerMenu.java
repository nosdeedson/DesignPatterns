package iteratorPattern.collectionsToHandle;

import iteratorPattern.iterator.DinnerMenuIteratorJava;

public class DinnerMenu implements Menu {
	
	static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		this.menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT", "(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
	}
	
	public java.util.Iterator<MenuItem> createIterator(){
		return new DinnerMenuIteratorJava(menuItems);
	}
	
	/*used with my own iterator*/
//	public Iterator createIterator() {
//		return new DinnerMenuIterator(menuItems);
//	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if ( this.numberOfItems == MAX_ITEMS) {
			System.out.println("Sorry, menu is full, cand add more items.");
		}else {
			this.menuItems[numberOfItems] = menuItem;
			this.numberOfItems++;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}
	
	
	
}
