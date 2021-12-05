package facadePattern.eletronics;

public class Projector {
	
	private DvdPlayer dvdPlayer;
	
	public Projector(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}

	public void on() {
		System.out.println("projector on");
	}

	public void off() {
		System.out.println("projector off");
	}
	
	public void tvMode() {
		System.out.println("TV mode");
	}
	
	public void wideScreenMode() {
		System.out.println("wide screen mode");
	}
	
	public DvdPlayer getDvdPlayer() {
		return dvdPlayer;
	}

	public void setDvdPlayer(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}
	
	
}
