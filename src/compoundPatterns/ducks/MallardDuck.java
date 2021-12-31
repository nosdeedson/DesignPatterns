package compoundPatterns.ducks;

import compoundPatterns.observer.Observable;
import compoundPatterns.observer.Observer;

public class MallardDuck implements Quackable {
	
	Observable observable;

	public MallardDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("I am mallardDuck I'm quacking.");
		notifyObservers();
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
