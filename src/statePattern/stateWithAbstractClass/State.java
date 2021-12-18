package statePattern.stateWithAbstractClass;

public abstract class State {
	
	/*using an abstract class we provide a default behavior 
	 * that way the croncrete class doesn't have to override all the
	 * methods*/
	
	void insertQuarter() {
		System.out.println("sorry you had already inserted a quarter");
	}
	
	void ejectQuarter() {
		System.out.println("insert a quarter first");
	}
	
	void turnCrank() {
		System.out.println("sorry, it doesn't have a quarter");
	}
	
	void dispense() {
		System.out.println("insert a quarter first.");
	}
	
	void withOutGumballs() {
		System.out.println("we have gumballs");
	}

}
