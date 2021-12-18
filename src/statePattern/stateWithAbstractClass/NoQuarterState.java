package statePattern.stateWithAbstractClass;

import java.util.Optional;

public class NoQuarterState extends State {
	
	GumballMachine2 machine;

	public NoQuarterState(GumballMachine2 machine) {
		this.machine = machine;
	}
	
	@Override
	void insertQuarter() {
		System.out.println("you inserted a quarter");
		if ( Optional.ofNullable(this.machine.getSoldOutState()).isPresent() ) {
			this.machine.getSoldOutState().withOutGumballs();
		}else {			
			this.machine.setState(new HasQuarterState(machine));
		}
	}
	
	
	
}
