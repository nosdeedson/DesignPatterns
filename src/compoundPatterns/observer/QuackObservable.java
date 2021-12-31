package compoundPatterns.observer;

public interface QuackObservable {
	
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
