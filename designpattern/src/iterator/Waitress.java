package iterator;

import java.util.Iterator;

public class Waitress {
		
	PancakeHouseMenu pancakeHouseMenu;
	DinnerMenu dinnerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerIterator = dinnerMenu.createIterator();
		
		System.out.println("Menu");
		System.out.println("Breakfast");
		printMenu(pancakeHouseIterator);
		System.out.println("lunch");
		printMenu(dinnerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName());
		}
	}
}
