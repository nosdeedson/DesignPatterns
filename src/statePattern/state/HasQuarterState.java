package statePattern.state;

import java.util.Random;

public class HasQuarterState implements State {
	
	GumballMachine machine;
	
	public HasQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you had already inserted a quarter");		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("ejecting quarter");
		this.machine.setState(this.machine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("you turned the cranl");
		Random random = new Random();
		int winner = random.nextInt(9);
		if ( winner == 1 && this.machine.getQtdGumball() > 1) {
			this.machine.setState(this.machine.getWinnerState());
		}else {			
			this.machine.setState(this.machine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("the gumball is rolling down the slot.");
		this.machine.updateQTD();
		if ( this.machine.getQtdGumball() > 0) {
			this.machine.setState(this.machine.getNoQuarterState());
		}else {
			this.machine.setState(this.machine.getNoQuarterState());
		}
	}

}
