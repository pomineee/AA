package iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu{
	MenuItem[] menuItems;
	
	public DinnerMenu(MenuItem...items) {
		this.menuItems = items;
	}
	
	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
