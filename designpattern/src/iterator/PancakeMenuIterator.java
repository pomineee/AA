package iterator;

import java.util.Iterator;

public class PancakeMenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;
	
	public PancakeMenuIterator(MenuItem[] menuItems) {
		items = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length)
			return false;
		return true;
	}

	@Override
	public Object next() {
		MenuItem item = items[position];
		position++;
		return item;
	}

}
