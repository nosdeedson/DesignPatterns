package statePattern.state;

public class GumballMachine {
	
	private int qtdGumball;
	
	private HasQuarterState hasQuarterState;
	private NoQuarterState noQuarterState;
	private SoldOutState soldOutState;
	private SoldState soldState;
	private WinnerState winnerState;
	
	private State state = soldOutState;
	
	public GumballMachine( int qtdGumball) {
		this.qtdGumball = qtdGumball;
		this.hasQuarterState = new HasQuarterState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		if( qtdGumball >  0) {
			this.state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		this.state.insertQuarter();
	}
	
	public void ejectQuarter() {
		this.state.ejectQuarter();
	}
	
	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}
	
	public void updateQTD() {
		qtdGumball--;
	}

	public int getQtdGumball() {
		return qtdGumball;
	}

	public void setQtdGumball(int qtdGumball) {
		this.qtdGumball = qtdGumball;
	}

	public State getState() {
		return this.state;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public HasQuarterState getHasQuarterState() {
		return hasQuarterState;
	}

	public NoQuarterState getNoQuarterState() {
		return noQuarterState;
	}

	public SoldOutState getSoldOutState() {
		return soldOutState;
	}

	public SoldState getSoldState() {
		return soldState;
	}

	public WinnerState getWinnerState() {
		return winnerState;
	}
	
	
	

}
