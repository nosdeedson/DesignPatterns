package main.simulators;

import statePattern.state.GumballMachine;

public class GumBallTestDriverWithStatePattern {

	public static void gumballTestDriver() {
		GumballMachine machine = new GumballMachine(5);
		
		System.out.println(machine.getState().getClass().getName());
		System.out.println(machine.getQtdGumball());
		
		machine.insertQuarter();
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.insertQuarter();
		System.out.println(machine.getState().getClass().getName());
		System.out.println(machine.getQtdGumball());
		
		machine.turnCrank();
		
		machine.turnCrank();
		
		machine.ejectQuarter();
		machine.insertQuarter();
		machine.ejectQuarter();
		machine.turnCrank();
		
		System.out.println(machine.getState().getClass().getName());
		System.out.println(machine.getQtdGumball());
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine.getState().getClass().getName());
		System.out.println(machine.getQtdGumball());
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine.getState().getClass().getName());
		System.out.println(machine.getQtdGumball());
		
		machine.insertQuarter();
		machine.turnCrank();
		
		System.out.println(machine.getState().getClass().getName());
		System.out.println(machine.getQtdGumball());
		
		machine.insertQuarter();
		
		
	}
}
