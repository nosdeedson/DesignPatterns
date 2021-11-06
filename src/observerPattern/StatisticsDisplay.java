package observerPattern;

public class StatisticsDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(String.format("Statistics = Temperature: %f, "
				+ "Humidity: %f, Pressure: %f", temperature, humidity, pressure) );
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
