package EncapsulatedBehaviors.duck;

import EncapsulatedBehaviors.fly.FlyNoWay;
import EncapsulatedBehaviors.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {

		System.out.println("I am a model duck");
	}

}
