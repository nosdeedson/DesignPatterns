package statePattern.stateWithAbstractClass;

import java.util.Random;

public class HasQuarterState extends State{
	
	GumballMachine2 machine;

	public HasQuarterState(GumballMachine2 machine) {
		this.machine = machine;
	}

	@Override
	void ejectQuarter() {
		System.out.println("ejecting the quarter");
		this.machine.setState(new NoQuarterState(machine));
	}
	
	@Override
	void turnCrank() {
		System.out.println("you turned the crank");
		Random random = new Random();
		int winner = random.nextInt(9);
		if ( winner == 1 && this.machine.getQtdGumball() > 1) {
			this.machine.setState(new WinnerState(machine));
		}else {			
			this.machine.setState(new SoldState(machine));
		}
	}

}
