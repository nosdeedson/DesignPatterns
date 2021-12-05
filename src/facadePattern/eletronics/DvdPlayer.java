package facadePattern.eletronics;

public class DvdPlayer {

	public void on() {
		System.out.println("Dvd on");
	}

	public void off() {
		System.out.println("Dvd off");
	}
	
	public void eject() {
		System.out.println("Dvd ejected");
	}
	
	public void pause() {
		System.out.println("Dvd paused");
	}
	
	public void play() {
		System.out.println("Dvd playing a movie");
	}
	
	public void setSurroundAudio() {
		System.out.println(" surroung audio setted");
	}
	
	public void setTwoChannelAudio() {
		System.out.println("two channel audio setted");
	}
	
	public void stop() {
		System.out.println("Dvd stopped");
	}
}
