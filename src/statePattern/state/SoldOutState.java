package statePattern.state;

public class SoldOutState implements State {

	GumballMachine machine;
	
	public SoldOutState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("sorry, out of gumballs");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("sorry, out of gumballs");
	}

	@Override
	public void turnCrank() {
		System.out.println("sorry, out of gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("sorry, out of gumballs");
	}
	
}
