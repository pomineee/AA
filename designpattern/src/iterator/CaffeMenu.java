package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CaffeMenu implements Menu{
	Hashtable menuItems = new Hashtable();
	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator(); // Iterator class�� ���� �ʿ䰡 ����
	}

}
