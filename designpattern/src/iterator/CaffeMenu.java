package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CaffeMenu implements Menu{
	Hashtable menuItems = new Hashtable();
	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator(); // Iterator class를 만들 필요가 없네
	}

}
