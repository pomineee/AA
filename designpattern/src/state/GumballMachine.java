package state;

public class GumballMachine implements State{
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	private State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if(this.count > 0) {
			state = noQuarterState;
		}
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getSoldOutState() {
		return this.soldOutState;
	}
	
	public State getNoQuaraterState() {
		return this.noQuarterState;
	}
	
	public State getSoldState() {
		return this.soldState;
	}
	
	public State getHasQuarterState() {
		return this.hasQuarterState;
	}
	
	public State getWinnerState() {
		return this.winnerState;
	}
	
	public void releaseGumball() {
		count--;
	}
	
	public int getCount() {
		return this.count;
	}

	@Override
	public void insertQuarter() {
		this.state.insertQuarter();
	}

	@Override
	public void ejectQuarter() {
		this.state.ejectQuarter();
	}

	@Override
	public void dispense() {
		this.state.dispense();
	}

	@Override
	public void tumCrank() {
		this.state.tumCrank();
	}
}
