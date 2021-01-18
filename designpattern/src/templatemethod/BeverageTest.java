package templatemethod;

public class BeverageTest {
	public static void main(String[] args) {
		CaffeinBeverage coffe = new Coffe();
		coffe.prepareReciepe();
		
		Tea tea = new Tea();
		tea.prepareReciepe();
	}
}
