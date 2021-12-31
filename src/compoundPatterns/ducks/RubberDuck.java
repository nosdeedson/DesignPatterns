package compoundPatterns.ducks;

import compoundPatterns.observer.Observable;
import compoundPatterns.observer.Observer;

public class RubberDuck implements Quackable {
	
	Observable observable;
	
	public RubberDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("I am a RubberDuck I'm squeaking");
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
