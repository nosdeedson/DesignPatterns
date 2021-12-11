package iteratorPattern.iterator;

import java.util.List;
import java.util.Optional;

import iteratorPattern.collectionsToHandle.MenuItem;

public class PancakeMenuIterator implements Iterator {
	
	private int position = 0;
	private List<?> pancakeMenu;
	
	public PancakeMenuIterator(List<?> pancakeMenu) {
		this.pancakeMenu = pancakeMenu;
	}

	@Override
	public boolean hasNext() {
		if (position < pancakeMenu.size() ) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		MenuItem item = (MenuItem) pancakeMenu.get(position);
		this.position++;
		return item;
	}

	@Override
	public void remove() {
		if ( position <= 0) {
			throw new IllegalArgumentException("Menu is empty");
		}
		if ( Optional.ofNullable( this.pancakeMenu.get(position - 1 )).isPresent()) {
			this.pancakeMenu.remove(position - 1);
		}
		this.position--;
	}

}
