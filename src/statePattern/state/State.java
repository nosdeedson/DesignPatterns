package statePattern.state;

public interface State {
	
	/* Using the pattern state to add a new state we just have to create the class 
	 * and instantiate it in our object that has states*/

	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
	
}
