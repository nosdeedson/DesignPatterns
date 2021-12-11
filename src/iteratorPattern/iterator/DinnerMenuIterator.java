package iteratorPattern.iterator;

import iteratorPattern.collectionsToHandle.MenuItem;

public class DinnerMenuIterator implements Iterator {

	private int position = 0;
	MenuItem[] menuItems;
		
	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (menuItems[position] != null) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		MenuItem item = menuItems[position];
		this.position++;
		return item;
	}

	@Override
	public void remove() {
		if ( this.position <= 0) {
			throw new IllegalArgumentException("Menu is empty");
		}
		if( menuItems[position-1] != null) {
			for( int i = (position-1); i < (menuItems.length-1); i++) {
				menuItems[i] = menuItems[i+1];
			}
			menuItems[menuItems.length - 1] = null;
		}
		this.position--;
	}

}
