package statePattern.stateWithAbstractClass;

public class GumballMachine2 {
	
	private HasQuarterState hasQuarterState;
	private NoQuarterState noQuarterState;
	private SoldOutState soldOutState;
	private SoldState soldState;
	private WinnerState winnerState;
	
	private int qtdGumball;
	
	private State state;
	
	public GumballMachine2(int qtdGumball) {
		this.qtdGumball = qtdGumball;
		if ( this.qtdGumball > 0)
		this.state = new NoQuarterState(this);		
	}
	
	public void printQTDGumballs() {
		System.out.println("QTD Gumballs " + this.qtdGumball);
		System.out.println(this.getState());
	}
	
	public void insertQuarter() {
		this.state.insertQuarter();
	}
	
	public void ejectQuarter() {
		this.state.ejectQuarter();
	}
	
	public void turnCrank() {
		this.state.turnCrank();
	}
	
	public void dispense() {
		this.state.dispense();
	}

	public String getState() {
		return this.state.getClass().getName();
	}
	
	public void setState( State state) {
		this.state = state;
	}
	
	public void updateQTD() {
		this.qtdGumball--;
	}

	public HasQuarterState getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(HasQuarterState hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public NoQuarterState getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(NoQuarterState noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public SoldOutState getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(SoldOutState soldOutState) {
		this.soldOutState = soldOutState;
	}

	public SoldState getSoldState() {
		return soldState;
	}

	public void setSoldState(SoldState soldState) {
		this.soldState = soldState;
	}

	public WinnerState getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(WinnerState winnerState) {
		this.winnerState = winnerState;
	}

	public int getQtdGumball() {
		return qtdGumball;
	}

	public void setQtdGumball(int qtdGumball) {
		this.qtdGumball = qtdGumball;
	}
	
	

}
