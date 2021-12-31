package compoundPatterns.factory;

import compoundPatterns.ducks.CallDucks;
import compoundPatterns.ducks.MallardDuck;
import compoundPatterns.ducks.Quackable;
import compoundPatterns.ducks.RedHeadDuck;
import compoundPatterns.ducks.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

	@Override
	public Quackable createCallDucks() {
		return new  CallDucks();
	}
	
		
}
