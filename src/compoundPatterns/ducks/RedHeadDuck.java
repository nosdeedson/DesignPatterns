package compoundPatterns.ducks;

import compoundPatterns.observer.Observable;
import compoundPatterns.observer.Observer;

public class RedHeadDuck implements Quackable {
	
	Observable observable;
	
	public RedHeadDuck() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("I am a redhead duck I'm quancking.");
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
