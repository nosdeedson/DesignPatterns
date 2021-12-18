package statePattern.whatTofix;

public class GumballMachine {
	
	/** Using this code if we have to insert a new state 
	 * we have to create a static int to represent the state, no big deal
	 *  but we have to change all the methods in this class to handle the new state
	 */

	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int qtdGumball = 0;

	public GumballMachine(int qtdGumball) {
		this.qtdGumball = qtdGumball;
		state = NO_QUARTER;
	}

	public void insertAQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("please wait we're already giving you a gumball");
		}
	}

	public void ejectAQuarter() {
		if (state == HAS_QUARTER) {
			state = NO_QUARTER;
			System.out.println("you are giving you your quarter back");
		} else if (state == NO_QUARTER) {
			System.out.println("you haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("sorry, you already turned the crank");
		} else if (state == SOLD_OUT) {
			System.out.println("you can't eject, you haven't inserted a quarter");
		}
	}
	
	public void turnCrank() {
		if ( state == SOLD) {
			System.out.println("turning twice doesn't give you another gumball");
		} else if ( state == NO_QUARTER) {
			System.out.println("you turned, but there's no quarter");
		} else if ( state == SOLD_OUT) {
			System.out.println("you turned, but there is no gumball");
		} else if (state == HAS_QUARTER) {
			System.out.println("You turned..");
			state = SOLD;
			dispense();
		}
	}

	public void dispense() {
		if ( state == SOLD) {
			System.out.println("a gumball comes rolling out the slot");
			qtdGumball--;
			if ( qtdGumball == 0) {
				System.out.println("ops, out of gumballs");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		}else if(state == NO_QUARTER) {
			System.out.println("you need to pay first");
		}else if ( state == SOLD_OUT) {
			System.out.println("no gumball dispensed");
		}else if ( state == HAS_QUARTER) {
			System.out.println("no gumball dispensed");
		}
	}

	public int getState() {
		return state;
	}

	
	
}
