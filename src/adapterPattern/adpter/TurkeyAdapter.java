package adapterPattern.adpter;

import adapterPattern.duck.Duck;
import adapterPattern.turkey.Turkey;

public class TurkeyAdapter implements Duck{

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		this.turkey.gobble();
	}

	@Override
	public void fly() {
		for ( int i = 0; i < 5; i++) {			
			this.turkey.fly();
		}
	}


}
