package observer;

import java.util.ArrayList;
import java.util.Observer;

public class WeatherData implements Subject{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(observer.Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(observer.Observer o) {
		int i = observers.indexOf(o);
		observers.remove(i);
	}

	@Override
	public void notifyObservers() {
		for(int i = 0 ; i < observers.size() ; i++) {
			observer.Observer observer = (observer.Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}
