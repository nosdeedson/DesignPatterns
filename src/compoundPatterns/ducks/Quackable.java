package compoundPatterns.ducks;

import compoundPatterns.observer.QuackObservable;

public interface Quackable extends QuackObservable{
	public void quack();
}
