package facadePattern.eletronics;

public class Tuner {

	private int frequency;
	private Amplifier amplifier;
	
	public void on() {
		System.out.println("Tuner on");
	}
	
	public void off() {
		System.out.println("Turner off");
	}
	
	public void setAM() {
		System.out.println("Playing AM");
	}
	
	public void setFM() {
		System.out.println("Playing FM");
	}
	
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getFrequency() {
		return frequency;
	}

	public Amplifier getAmplifier() {
		return amplifier;
	}

	public void setAmplifier(Amplifier amplifier) {
		this.amplifier = amplifier;
	}
	
	
	
}
