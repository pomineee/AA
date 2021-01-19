package state;

public class GumballTest {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(3);
		
		System.out.println(gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.tumCrank();
		System.out.println(gumballMachine.getCount());
		gumballMachine.tumCrank();
		gumballMachine.insertQuarter();
		gumballMachine.tumCrank();
		System.out.println(gumballMachine.getCount());
	}
}	
