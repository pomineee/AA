package observer;

public class StatisticsDisplay implements Observer, DisplayElement{

	float nonRealCal;
	Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
		
	@Override
	public void display() {
		System.out.println("Statistics : " + nonRealCal);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.nonRealCal = (temp+humidity+pressure)/3;
		display();
	}

}
