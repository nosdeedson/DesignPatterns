package main.simulators;

import statePattern.stateWithAbstractClass.GumballMachine2;

public class GumballTestDriverWithAbstractClass {
	
	public static void tesdDriver() {
		GumballMachine2 machine = new GumballMachine2(5);
		
		machine.insertQuarter();
		machine.insertQuarter();
		
		machine.turnCrank();
		machine.dispense();
		
		machine.printQTDGumballs();
		
		machine.turnCrank();
		
		machine.dispense();
		
		machine.ejectQuarter();
		
		machine.insertQuarter();
		machine.ejectQuarter();
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.ejectQuarter();
		
		machine.dispense();
		machine.printQTDGumballs();
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.dispense();
		
		machine.printQTDGumballs();
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.dispense();
		
		machine.printQTDGumballs();
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.dispense();
		
		machine.printQTDGumballs();
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.dispense();
		
		machine.printQTDGumballs();
		
	}

}
