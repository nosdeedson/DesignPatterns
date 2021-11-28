package commandPattern.devices;

public class Stereo {

	private int volume;
	
	public Stereo() {}
	
	public void on() {
		System.out.println("Stereo on");
		setCd();
		setVolume(11);
	}
	
	public void off() {
		System.out.println("Stereo off");
	}
	
	public void setCd() {
		System.out.println("Stereo playing cd");
	}
	
	public void setDVD() {
		System.out.println("Stereo playing DVD");
	}
	
	public void setRadio() {
		System.out.println("Stereo playing radio");
	}
	
	public void setVolume( int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}
	
	
}
