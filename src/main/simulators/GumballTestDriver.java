package main.simulators;

import statePattern.whatTofix.GumballMachine;

public class GumballTestDriver {
	
	
	public static void testDriver() {
		
		GumballMachine machine = new GumballMachine(5);
		System.out.println(machine.getState());
		
		machine.insertAQuarter();
		machine.turnCrank();
		
		System.out.println(machine.getState());
		
		machine.insertAQuarter();
		machine.ejectAQuarter();
		machine.turnCrank();
		
		System.out.println(machine.getState());
		
		machine.insertAQuarter();
		machine.turnCrank();
		machine.insertAQuarter();
		machine.ejectAQuarter();
		
		System.out.println(machine.getState());
		
		machine.insertAQuarter();
		machine.insertAQuarter();
		machine.turnCrank();
		machine.insertAQuarter();
		machine.turnCrank();
		machine.insertAQuarter();
		machine.turnCrank();
		
		System.out.println(machine.getState());
	}
}
