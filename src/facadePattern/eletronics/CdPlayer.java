package facadePattern.eletronics;

public class CdPlayer {
	
	private Amplifier amplifier;

	public void on() {
		System.out.println("Cd on");
	}
	
	public void off() {
		System.out.println("Cd off");
	}
	
	public void eject() {
		System.out.println("Cd ejected");
	}
	
	public void paused() {
		System.out.println("Cd paused");
	}

	public void playing() {
		System.out.println("Cd playing");
	}
	
	public void stop() {
		System.out.println("Cd stopped");
	}

	public Amplifier getAmplifier() {
		return amplifier;
	}

	public void setAmplifier(Amplifier amplifier) {
		this.amplifier = amplifier;
	}
	
}
