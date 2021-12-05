package main.simulators;

import facadePattern.eletronics.Amplifier;
import facadePattern.eletronics.PopcornPopper;
import facadePattern.eletronics.Projector;
import facadePattern.eletronics.Screen;
import facadePattern.eletronics.TheaterLights;

public class HomeTheaterWithoutFacadeSimulator {

	public static void testDriveHomeTheaterWatchMovie( PopcornPopper pop,
			TheaterLights lights, Screen screen, Projector projector, Amplifier amplifier) {
		System.out.println("Get ready to watch a movie without a facade");
		
		pop.on();
		pop.pop();
		
		lights.on();
		lights.dim(9);
		
		screen.down();
		
		projector.on();
		
		amplifier.on();
		amplifier.setVolume(10);
		
		amplifier.getDvdPlayer().on();
		amplifier.getDvdPlayer().play();
	}
	
	public static void testDriveHomeTheaterTurnOffMovie(PopcornPopper pop,
			TheaterLights lights, Screen screen, Projector projector, Amplifier amplifier) {
		System.out.println("\n turning off the movie");
		pop.off();
		lights.off();
		screen.up();
		projector.off();
		amplifier.getDvdPlayer().eject();
		amplifier.getDvdPlayer().off();
		amplifier.off();
	}
	
}
