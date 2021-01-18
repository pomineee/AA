package iterator;

import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	MenuItem[] menuItem;
	
	public PancakeHouseMenu(MenuItem...items) {
		menuItem = items;
	}
	
	public Iterator createIterator() {
		return new PancakeMenuIterator(menuItem);
	}
}
