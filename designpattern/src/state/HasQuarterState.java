package state;

import java.util.Random;

public class HasQuarterState implements State{
	GumballMachine gumballMachine;
	Random radomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("you can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("quarter returned");
		gumballMachine.setState(gumballMachine.noQuarterState);
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispense");
	}

	@Override
	public void tumCrank() {
		System.out.println("you turned");
		int winner = radomWinner.nextInt(10);
		if((winner == 0) && gumballMachine.getCount() > 1) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		gumballMachine.dispense();
	}

}
