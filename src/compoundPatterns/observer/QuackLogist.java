package compoundPatterns.observer;

public class QuackLogist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quacklogist " + duck.getClass().getName() + " just quacked");
	}

}
