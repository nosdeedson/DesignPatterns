package compoundPatterns.factory;

import compoundPatterns.ducks.Quackable;

public abstract class AbstractDuckFactory {
	
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createRubberDuck();
	public abstract Quackable createCallDucks();
	
}
