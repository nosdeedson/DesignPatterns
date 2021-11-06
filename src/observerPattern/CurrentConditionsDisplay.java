package observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humudity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay( Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humudity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature +
				"F degress and " + humudity + "% humidity.");
	}

}
