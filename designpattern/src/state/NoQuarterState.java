package state;

public class NoQuarterState implements State{
	GumballMachine gumballMachine;
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispense");
	}

	@Override
	public void tumCrank() {
		System.out.println("You turned, but there's no quarter");
	}

}
