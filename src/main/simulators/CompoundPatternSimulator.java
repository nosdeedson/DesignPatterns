package main.simulators;

import compoundPatterns.Flock;
import compoundPatterns.adapter.GooseAdapter;
import compoundPatterns.decorator.QuackCount;
import compoundPatterns.ducks.CallDucks;
import compoundPatterns.ducks.MallardDuck;
import compoundPatterns.ducks.Quackable;
import compoundPatterns.ducks.RedHeadDuck;
import compoundPatterns.ducks.RubberDuck;
import compoundPatterns.factory.CountingDuckFactory;
import compoundPatterns.factory.DuckFactory;
import compoundPatterns.goose.Goose;
import compoundPatterns.goose.GooseFactory;
import compoundPatterns.observer.QuackLogist;

public class CompoundPatternSimulator {

	public  void ducksQuacking() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedHeadDuck();
		Quackable rubberDuck = new RubberDuck();
		Quackable callDuck = new CallDucks();
		Goose goose = new Goose();
		GooseAdapter gooseAdapter = new GooseAdapter(goose);
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(rubberDuck);
		simulate(callDuck);
		simulate(gooseAdapter);
	}
	
	private void simulate(Quackable quack) {
		quack.quack();
	}
	
	public void ducksWithAdapterDecorator() {
		Quackable mallardDuck = new QuackCount(new MallardDuck());
		Quackable redHeadDuck = new QuackCount(new RedHeadDuck());
		Quackable rubberDuck = new QuackCount(new RubberDuck());
		Quackable callDuck = new QuackCount(new CallDucks());
		Goose goose = new Goose();
		GooseAdapter gooseAdapter = new GooseAdapter(goose);
		simulate(mallardDuck);
		System.out.println( "quacks:" + QuackCount.getQuacks() );
		simulate(callDuck);
		System.out.println( "quacks:" + QuackCount.getQuacks());
		simulate(redHeadDuck);
		System.out.println( "quacks:" + QuackCount.getQuacks());
		simulate(rubberDuck);
		System.out.println("quacks:" + QuackCount.getQuacks());
		simulate(gooseAdapter);
		System.out.println( "quacks:" + QuackCount.getQuacks());
	}
	
	public void duckWithAdapterFactory() {
		DuckFactory factory = new DuckFactory();
		GooseFactory gooseFactory = new GooseFactory();
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable callDuck = factory.createCallDucks();
		Quackable redHeadDuck = factory.createRedHeadDuck();
		Quackable rubberDuck = factory.createRubberDuck();
		GooseAdapter gooseAdapter = new GooseAdapter(gooseFactory.createGoose());
	
		simulate(gooseAdapter);
		simulate(rubberDuck);
		simulate(redHeadDuck);
		simulate(callDuck);
		simulate(mallardDuck);
	}
	
	public void duckWithAdapterDecoratorFactory() {
		CountingDuckFactory factory = new CountingDuckFactory();
		GooseFactory gooseFactory = new GooseFactory();
		
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable callDuck = factory.createCallDucks();
		Quackable redHeadDuck = factory.createRedHeadDuck();
		Quackable rubberDuck = factory.createRubberDuck();
		GooseAdapter gooseAdapter = new GooseAdapter(gooseFactory.createGoose());
	
		simulate(gooseAdapter);
		System.out.println("quacks: " + QuackCount.getQuacks());
		simulate(rubberDuck);
		System.out.println("quacks: " + QuackCount.getQuacks());
		simulate(redHeadDuck);
		System.out.println("quacks: " + QuackCount.getQuacks());
		simulate(callDuck);
		System.out.println("quacks: " + QuackCount.getQuacks());
		simulate(mallardDuck);
		System.out.println("quacks: " + QuackCount.getQuacks());
		
		
	}
	
	public void duckWithAdapterDecoratorFactoryComposite() {
		CountingDuckFactory factory = new CountingDuckFactory();
		GooseFactory gooseFactory = new GooseFactory();
		
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable callDuck = factory.createCallDucks();
		Quackable redHeadDuck = factory.createRedHeadDuck();
		Quackable rubberDuck = factory.createRubberDuck();
		GooseAdapter gooseAdapter = new GooseAdapter(gooseFactory.createGoose());
		
		Flock flocks = new Flock();
		flocks.add(mallardDuck);
		flocks.add(callDuck);
		flocks.add(redHeadDuck);
		flocks.add(rubberDuck);
		flocks.add(gooseAdapter);
		
		flocks.quack();
		
		Quackable mallardDuckOne = factory.createMallardDuck();
		Quackable mallardDuckTwo = factory.createMallardDuck();
		Quackable mallardDuckThree = factory.createMallardDuck();
		Quackable mallardDuckFour = factory.createMallardDuck();
		Quackable mallardDuckFive = factory.createMallardDuck();
		
		Flock familyMallardDuck = new Flock();
		familyMallardDuck.add(mallardDuckOne);
		familyMallardDuck.add(mallardDuckTwo);
		familyMallardDuck.add(mallardDuckThree);
		familyMallardDuck.add(mallardDuckFour);
		familyMallardDuck.add(mallardDuckFive);
		
		flocks.add(familyMallardDuck);
		flocks.quack();
		
		
	}


	public void duckWithAdapterDecoratorFactoryCompositeObserver() {
		CountingDuckFactory factory = new CountingDuckFactory();
		GooseFactory gooseFactory = new GooseFactory();
		
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable callDuck = factory.createCallDucks();
		Quackable redHeadDuck = factory.createRedHeadDuck();
		Quackable rubberDuck = factory.createRubberDuck();
		GooseAdapter gooseAdapter = new GooseAdapter(gooseFactory.createGoose());
		
		Flock flocks = new Flock();
		flocks.add(mallardDuck);
		flocks.add(callDuck);
		flocks.add(redHeadDuck);
		flocks.add(rubberDuck);
		flocks.add(gooseAdapter);
		
		Quackable mallardDuckOne = factory.createMallardDuck();
		Quackable mallardDuckTwo = factory.createMallardDuck();
		Quackable mallardDuckThree = factory.createMallardDuck();
		Quackable mallardDuckFour = factory.createMallardDuck();
		Quackable mallardDuckFive = factory.createMallardDuck();
				
		Flock familyMallardDuck = new Flock();
		familyMallardDuck.add(mallardDuckOne);
		familyMallardDuck.add(mallardDuckTwo);
		familyMallardDuck.add(mallardDuckThree);
		familyMallardDuck.add(mallardDuckFour);
		familyMallardDuck.add(mallardDuckFive);
		
		flocks.add(familyMallardDuck);		
		QuackLogist quackologist = new QuackLogist();
		
		flocks.registerObserver(quackologist);
		mallardDuckFive.registerObserver(quackologist);
		simulate(flocks);
		System.out.println("just one duck");
		simulate(mallardDuckFive);
	}
	
	
	public void justOneDuck() {
		Quackable mallardDuck = new MallardDuck();
		QuackLogist observer = new QuackLogist();
		mallardDuck.registerObserver(observer);
		simulate(mallardDuck);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
