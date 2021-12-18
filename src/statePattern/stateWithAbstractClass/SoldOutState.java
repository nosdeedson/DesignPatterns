package statePattern.stateWithAbstractClass;

public class SoldOutState extends State {
	
	GumballMachine2 machine;

	public SoldOutState(GumballMachine2 machine) {
		this.machine = machine;
	}
	
	@Override
	void withOutGumballs() {
		System.out.println("Sorry, there are no gumballs");
		this.ejectQuarter();
	}
	
	@Override
	void insertQuarter() {
		this.withOutGumballs();
	}
	
	@Override
	void turnCrank() {
		this.withOutGumballs();
	}
	
	@Override
	void dispense() {
		this.withOutGumballs();
	}
	
	@Override
	void ejectQuarter() {
		System.out.println("ejecting the quarter.");
	}

}
