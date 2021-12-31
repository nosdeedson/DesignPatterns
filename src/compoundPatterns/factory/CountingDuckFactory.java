package compoundPatterns.factory;

import compoundPatterns.decorator.QuackCount;
import compoundPatterns.ducks.CallDucks;
import compoundPatterns.ducks.MallardDuck;
import compoundPatterns.ducks.Quackable;
import compoundPatterns.ducks.RedHeadDuck;
import compoundPatterns.ducks.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCount(new MallardDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new QuackCount(new RedHeadDuck());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCount(new RubberDuck());
	}

	@Override
	public Quackable createCallDucks() {
		return new QuackCount(new CallDucks());
	}

}
