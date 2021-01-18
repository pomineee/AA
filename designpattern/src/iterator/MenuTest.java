package iterator;

public class MenuTest {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu(new MenuItem("Sweet Pancake"), new MenuItem("original pancake"));
		DinnerMenu dinnerMenu = new DinnerMenu(new MenuItem("buzzi"), new MenuItem("mealof"));
		Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
		waitress.printMenu();
	}
}
