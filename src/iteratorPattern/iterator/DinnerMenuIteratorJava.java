package iteratorPattern.iterator;

import java.util.Iterator;

import iteratorPattern.collectionsToHandle.MenuItem;

public class DinnerMenuIteratorJava implements Iterator<MenuItem> {
	
	private int position = 0;
	private MenuItem[] dinnerMenu;
	
	public DinnerMenuIteratorJava(MenuItem[] dinnerMenu) {
		this.dinnerMenu = dinnerMenu;
	}

	@Override
	public boolean hasNext() {
		if ( this.dinnerMenu[position] != null) {
			return true;
		}
		return false;
	}

	@Override
	public MenuItem next() {
		MenuItem item = this.dinnerMenu[position];
		this.position++;
		return item;
	}
	
	@Override
	public void remove() {
		if ( this.position <= 0 ) {
			throw new IllegalArgumentException("Menu is empty");
		}
		if ( this.dinnerMenu[position - 1] != null ) {
			this.dinnerMenu[position -1 ] = null;
		}
		this.position--;
	}

}
