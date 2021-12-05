package facadePattern.eletronics;

public class Amplifier {

	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private int volume;
	
	public Amplifier(Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer) {
		this.tuner = tuner;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
	}
	
	public void on() {
		System.out.println("amplifier on");
	}
	
	public void off() {
		System.out.println("amplifier off");
	}

	public Tuner getTuner() {
		return tuner;
	}

	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

	public DvdPlayer getDvdPlayer() {
		return dvdPlayer;
	}

	public void setDvdPlayer(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}

	public CdPlayer getCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
