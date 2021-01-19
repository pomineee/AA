package state;

public class WinnerState implements State{
	GumballMachine gumballMachine;
	public WinnerState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");		
	}

	@Override
	public void ejectQuarter() {
		
	}

	@Override
	public void dispense() {
		System.out.println("You're a WINNER! You get two gumballs");
		gumballMachine.releaseGumball();
		gumballMachine.releaseGumball();
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuaraterState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		
	}

	@Override
	public void tumCrank() {
		// TODO Auto-generated method stub
		
	}

}
