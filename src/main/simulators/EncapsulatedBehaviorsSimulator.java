package main.simulators;

import java.util.Optional;

import encapsulatedBehaviors.duck.Duck;
import encapsulatedBehaviors.duck.MallardDuck;
import encapsulatedBehaviors.duck.ModelDuck;
import encapsulatedBehaviors.duck.RealDuck;
import encapsulatedBehaviors.fly.FlyNoWay;
import encapsulatedBehaviors.fly.FlyRocketPowered;
import encapsulatedBehaviors.fly.FlyWithWings;
import encapsulatedBehaviors.quack.Squeak;

public class EncapsulatedBehaviorsSimulator {

	public static void encapsulatedBehaviorsSimulator() {
		
		Duck mallard = new MallardDuck();
		
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		mallard.swin();
		
		System.out.println("Dynamically adding behavior");
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		System.out.println("Duck growing");
		
		Duck real = new RealDuck();
		
		real.display();
		
		if( Optional.ofNullable(real.getFlyBehavior()).isEmpty() ) {
			System.out.println("I can't fly because a little");
		}else {			
			real.performFly();
		}
		if(Optional.ofNullable(real.getQuackBehavior()).isEmpty()) {
			System.out.println("I can't quack still");
		}else {
			real.performQuack();
		}
		
		System.out.println("adding the behavior");
		
		
		real.setFlyBehavior(new FlyWithWings());
		real.setQuackBehavior(new Squeak());
		
		System.out.println("now with behavior");
		
		real.performFly();
		real.performQuack();
		
		
		real.setFlyBehavior(new FlyNoWay("I can't fly, I broke my wings"));
		real.performFly();
		
	}
}
