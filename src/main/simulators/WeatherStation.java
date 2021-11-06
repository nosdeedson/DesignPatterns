package main.simulators;

import java.util.Random;

import observerPattern.CurrentConditionsDisplay;
import observerPattern.StatisticsDisplay;
import observerPattern.WeatherData;

public class WeatherStation {
	
	public static void weatherStation() {

		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statistics = new StatisticsDisplay(weatherData);
		Random r = new Random();
		for ( int i = 0; i < 3; i++) {
			weatherData.setMeasurements(r.nextInt(100), (r.nextFloat() * 100), (r.nextFloat() * 100));	
			if ( i == 0) {
				weatherData.removeObserver(current);
			}else if ( i == 1) {
				weatherData.registerObserver(current);
				weatherData.removeObserver(statistics);
			}else {
				weatherData.removeObserver(current);
			}
			
		}
		
	}
}
