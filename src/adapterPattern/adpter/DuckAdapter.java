package adapterPattern.adpter;

import adapterPattern.duck.Duck;
import adapterPattern.turkey.Turkey;

public class DuckAdapter implements Turkey {
	
	private Duck duck;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}
	
	@Override
	public void gobble() {
		this.duck.fly();
	}

	@Override
	public void fly() {
		this.duck.quack();
	}

}
