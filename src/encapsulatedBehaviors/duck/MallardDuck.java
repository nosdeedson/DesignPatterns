package encapsulatedBehaviors.duck;

import encapsulatedBehaviors.fly.FlyWithWings;
import encapsulatedBehaviors.quack.Quack;

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
