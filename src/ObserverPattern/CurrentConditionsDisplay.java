package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 一个布告栏，显示类（观察者） 使用Java内置类进行改进
 * 
 * @author loqiu
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private double temperature;
	private double humidity;
	Observable observable;

	/**
	 * 每一个观察者（Observer）注册的都是同一个主题（weatherData） 类实例创建的时候，就已经注册(addObsever)上了主题
	 */
	public CurrentConditionsDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this); 
	}

	/**
	 * 规定所有布告栏（观察者）都必须实现displayelement接口 用于显示信息
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	/**
	 * 每一个观察者都必须实现的接口
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherDataJava) {
			WeatherDataJava data = (WeatherDataJava) o;
			this.temperature = data.getTemperature();
			this.humidity = data.getHumidity();
			display();
		}
	}

}
