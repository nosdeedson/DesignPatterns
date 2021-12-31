package compoundPatterns.decorator;

import compoundPatterns.ducks.Quackable;
import compoundPatterns.observer.Observable;
import compoundPatterns.observer.Observer;

public class QuackCount implements Quackable {

	Quackable duck;
	static int numberOfQuacks;
	Observable observable;
	
	public QuackCount(Quackable duck) {
		this.duck = duck;
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
		notifyObservers();
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}
