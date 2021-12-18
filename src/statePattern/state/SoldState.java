package statePattern.state;

public class SoldState implements State {
	
	GumballMachine machine;
	
	public SoldState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you had already inserted a quarter");		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("sorry, you had already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("turn twice doesn't give you two gumball");
		this.dispense();
	}

	@Override
	public void dispense() {
		System.out.println("a gumball is rolling down the slot");
		this.machine.updateQTD();
		if( machine.getQtdGumball() == 0) {
			this.machine.setState(this.machine.getSoldOutState());
		}else {
			this.machine.setState(this.machine.getNoQuarterState());
		}
	}

}
