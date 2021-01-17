package observer;

public class WeatherStationTest {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDiaplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 60, 40.3f);
		weatherData.setMeasurements(82, 70, 29.3f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
