package compoundPatterns.ducks;

import compoundPatterns.observer.Observable;
import compoundPatterns.observer.Observer;

public class CallDucks implements Quackable {
	
	Observable observable;
	
	public CallDucks() {
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("I am a call duck for hunters. I kwak");
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
