package compoundPatterns.adapter;

import compoundPatterns.ducks.Quackable;
import compoundPatterns.goose.Goose;
import compoundPatterns.observer.Observable;
import compoundPatterns.observer.Observer;

public class GooseAdapter implements Quackable {

	private Goose goose;
	private Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		goose.honk();
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
