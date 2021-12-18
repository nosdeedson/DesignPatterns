package statePattern.state;

public class NoQuarterState implements State {
	
	GumballMachine machine;
	
	public NoQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("you inserted a quarter");
		this.machine.setState(this.machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("insert a quarter first");		
	}

	@Override
	public void turnCrank() {
		System.out.println("you haven't inserted a quarter");
	}

	@Override
	public void dispense() {
		System.out.println("you haven't inserted a quarter");
	}

}
