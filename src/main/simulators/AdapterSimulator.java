package main.simulators;

import adapterPattern.adpter.DuckAdapter;
import adapterPattern.adpter.TurkeyAdapter;
import adapterPattern.duck.Duck;
import adapterPattern.duck.MallardDuck;
import adapterPattern.turkey.Turkey;
import adapterPattern.turkey.WildTurkey;

public class AdapterSimulator {

	public static void testingAdapter() {
		
		/* a ducke receiving a turkey*/
		Duck mallardDuck = new MallardDuck();
		Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
		
		System.out.println("I real duck");
		mallardDuck.quack();
		mallardDuck.fly();
		
		System.out.println("I duck acting like a turkey");
		turkeyAdapter.fly();
		turkeyAdapter.quack();
		
		
		System.out.println("Calling a method that expect a duck");
		
		testDuck(mallardDuck);
		testDuck(turkeyAdapter);
		
		
		/* a turkey receiving a duck*/
		
		Turkey turkey = new WildTurkey();
		Turkey adapterTurkey = new DuckAdapter( mallardDuck);
		
		System.out.println("\n a real turkey");
		turkey.fly();
		turkey.gobble();
		
		System.out.println("\n a turkey acting like a duck");
		adapterTurkey.fly();
		adapterTurkey.gobble();
		
		/* calling a method that expect a turkey*/
		
		testTurkey(adapterTurkey);
		testTurkey(turkey);
		
	}
	
	private static void testDuck(Duck duck) {
		duck.fly();
		duck.quack();
	}
	
	private static void testTurkey(Turkey turkey) {
		turkey.fly();
		turkey.gobble();
	}
}
