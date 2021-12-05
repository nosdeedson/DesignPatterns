package facadePattern.facade;

import facadePattern.eletronics.Amplifier;
import facadePattern.eletronics.CdPlayer;
import facadePattern.eletronics.DvdPlayer;
import facadePattern.eletronics.PopcornPopper;
import facadePattern.eletronics.Projector;
import facadePattern.eletronics.Screen;
import facadePattern.eletronics.TheaterLights;
import facadePattern.eletronics.Tuner;

public class HomeTheaterFacade {

	private Amplifier amplifier;
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private Screen screen;
	private PopcornPopper popcornPopper;
	private TheaterLights theaterLights;
	private Projector projector;
	
	public HomeTheaterFacade(Amplifier amplifier,  Screen screen,
			PopcornPopper popcornPopper, TheaterLights theaterLights, Projector projector) {
		this.amplifier = amplifier;
		this.screen = screen;
		this.popcornPopper = popcornPopper;
		this.theaterLights = theaterLights;
		this.projector = projector;
	}
	
	public void watchMovie() {
		System.out.println("Get ready to watch a movie");
		this.popcornPopper.on();
		this.popcornPopper.pop();
		this.theaterLights.on();
		this.theaterLights.dim(10);
		this.screen.down();
		this.projector.on();
		this.projector.wideScreenMode();
		this.amplifier.on();
		this.amplifier.getDvdPlayer().on();
		this.amplifier.setVolume(10);
	}
	
	public void endMovie() {
		System.out.println("Stopping a movvie");
		this.popcornPopper.off();
		this.theaterLights.off();
		this.screen.up();
		this.projector.off();
		this.amplifier.getDvdPlayer().off();
		this.amplifier.off();
	}
	
	public void listenToCD() {
		System.out.println("get ready to listen music");
		this.amplifier.on();
		this.amplifier.setVolume(5);
		this.cdPlayer.on();
	}
	
	public void endCD() {
		System.out.println("stopping music");
		this.amplifier.getCdPlayer().stop();
		this.amplifier.getCdPlayer().off();
		this.amplifier.off();
	}
	
	public void listenToRadio() {
		System.out.println("listan radio");
		this.amplifier.on();
		this.amplifier.getTuner().on();
		this.amplifier.setVolume(4);
	}
	
	public void endRadio() {
		System.out.println("turnning off the radion");
		this.amplifier.getTuner().off();
		this.amplifier.off();
	}
	
	public Amplifier getAmplifier() {
		return amplifier;
	}


	public void setAmplifier(Amplifier amplifier) {
		this.amplifier = amplifier;
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


	public Screen getScreen() {
		return screen;
	}


	public void setScreen(Screen screen) {
		this.screen = screen;
	}


	public PopcornPopper getPopcornPopper() {
		return popcornPopper;
	}


	public void setPopcornPopper(PopcornPopper popcornPopper) {
		this.popcornPopper = popcornPopper;
	}


	public TheaterLights getTheaterLights() {
		return theaterLights;
	}


	public void setTheaterLights(TheaterLights theaterLights) {
		this.theaterLights = theaterLights;
	}


	public Projector getProjector() {
		return projector;
	}


	public void setProjector(Projector projector) {
		this.projector = projector;
	}
	
	
}
