package main.simulators;

import facadePattern.facade.HomeTheaterFacade;

public class HomeTeatherWithFacade {

	public void turningOn( HomeTheaterFacade facade ) {
		facade.watchMovie();
	}
	
	public void turningOff( HomeTheaterFacade facade) {
		facade.endMovie();
	}
}
