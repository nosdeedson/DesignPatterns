package EncapsulatedBehaviors.fly;

public class FlyNoWay implements FlyBehavior {
	
	private String whyICantFly;
	
	public FlyNoWay() {}
	
	public FlyNoWay(String whyCantFly) {
		this.whyICantFly = whyCantFly;
	}

	@Override
	public void fly() {
		if(this.whyICantFly == null) {
			System.out.println("I can't fly");
		}else {
			System.out.println(this.whyICantFly);
		}
	}

	public String getWhyICantFly() {
		return whyICantFly;
	}

	public void setWhyICantFly(String whyICantFly) {
		this.whyICantFly = whyICantFly;
	}
	

	
}
