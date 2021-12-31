package compoundPatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import compoundPatterns.ducks.Quackable;
import compoundPatterns.observer.Observable;
import compoundPatterns.observer.Observer;

public class Flock implements Quackable {
	
	List<Quackable> quackers = new ArrayList<Quackable>();
	
	Observable observable;

	public void add(Quackable quack) {
		this.quackers.add(quack);
		this.observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
			notifyObservers();
		}
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
