package adapterPattern.duck;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("I am MallardDuck, and I am quacking");
	}

	@Override
	public void fly() {
		System.out.println("I am MallardDuck, and I am flying");
	}

}
