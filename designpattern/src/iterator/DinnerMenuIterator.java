package iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;
	
	public DinnerMenuIterator(MenuItem[] menuItems) {
		items = menuItems;
	}
	@Override
	public boolean hasNext() {
		if(position >= items.length) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}
	
}
