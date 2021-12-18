package statePattern.state;

public class WinnerState implements State {
	
	GumballMachine machine;
	
	public WinnerState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you had already inserted a quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("you had already inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("you had already inserted a quarter");
	}

	@Override
	public void dispense() {
		System.out.println("you are a WINNER!! \n you are giving you to gumball");
		this.machine.updateQTD();
		if ( this.machine.getQtdGumball() == 0) {
			this.machine.setState(this.machine.getSoldOutState());
		}else {
			this.machine.setState(this.machine.getNoQuarterState());
		}
	}

}
