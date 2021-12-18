package statePattern.stateWithAbstractClass;

public class SoldState extends State {

	GumballMachine2 machine;

	public SoldState(GumballMachine2 machine) {
		this.machine = machine;
	}
		
	@Override
	void dispense() {
		System.out.println("the gumbal is rolling down the slot");
		this.machine.updateQTD();
		if ( this.machine.getQtdGumball() == 0) {
			this.machine.setState(new SoldOutState(machine));
		}else {
			this.machine.setState(new NoQuarterState(machine));
		}
	}
	
	@Override
	void ejectQuarter() {
		System.out.println("sorry, you had already turned the crank");
	}
	
}
