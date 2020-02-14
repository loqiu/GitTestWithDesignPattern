package ObserverPattern;

/**
 * weatherdata 作为主题要实现 subject 接口
 * @author loqiu
 *
 */
import java.util.ArrayList;

public class WeatherData implements Subject {
	/**
	 * arraylist 用来记录观察者
	 */
	private ArrayList<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	/**
	 * 注册成为观察者
	 */
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i > 0) {
			observers.remove(i);
		}
	}

	/**
	 * 只有notifyObserver才知道如何通知所有的观察者
	 */
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	/**
	 * weatherdata类通知方法
	 */
	public void MeasurementsChanged() {
		notifyObserver();
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

}
