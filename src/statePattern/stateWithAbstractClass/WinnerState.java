package statePattern.stateWithAbstractClass;

public class WinnerState extends State{
	
	GumballMachine2 machine;
	
	public WinnerState(GumballMachine2 machine) {
		this.machine = machine;
	}
	
	@Override
	void dispense() {
		System.out.println("you are a WINNER/n you are giving you two gumballl");
		System.out.println("the gumbals are rolling down the slot");
		this.machine.updateQTD();
		if( this.machine.getQtdGumball() == 0) {
			this.machine.setState(new SoldOutState(machine));
		}else {
			this.machine.setState(new NoQuarterState(machine));
		}
	}
}
