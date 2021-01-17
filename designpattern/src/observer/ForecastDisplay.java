package observer;

import java.time.temporal.JulianFields;

public class ForecastDisplay implements Observer, DisplayElement{

	String forcast;
	Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("forecast : " + forcast);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		if(temp >= 80) {
			forcast = "so hot";
		}
		if(humidity >= 90) {
			forcast = "really humidity";
		}
		if(pressure == 29.2f) {
			forcast = "good condition";
		}
		display();
	}

}
