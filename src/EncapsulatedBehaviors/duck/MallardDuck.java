package EncapsulatedBehaviors.duck;

import EncapsulatedBehaviors.fly.FlyWithWings;
import EncapsulatedBehaviors.quack.Quack;

public class MallardDuck extends Duck {
	
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new  FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a MallardDuck");

	}

}
