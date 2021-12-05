package facadePattern.eletronics;

public class TheaterLights {

	private int dimmer;
	public void on() {
		System.out.println("lights on");
	}
	
	public void off() {
		System.out.println("lights off");
	}
	
	public void dim(int dimmer) {
		this.dimmer = dimmer;
		System.out.println("dimming lights to " + this.dimmer);
	}
}
