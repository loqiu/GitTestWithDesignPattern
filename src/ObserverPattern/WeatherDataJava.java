package ObserverPattern;

/**
 * 通过Java内置的observerable实现的主题，负责消息推送
 */
import java.util.Observable;

public class WeatherDataJava extends Observable {

	private double temperature;
	private double humidity;
	private double pressure;

	public WeatherDataJava() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * weatherdataJava类通知方法 setChange 方法是一种更灵活的方法，没有调用这个方法的观察者，主题不会给他推送消息
	 */
	public void MeasurementsChanged() {
		setChanged();
		notifyObservers();
	}

	/**
	 * 对外的API接口
	 * 
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasuresments(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		MeasurementsChanged();
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}

}
