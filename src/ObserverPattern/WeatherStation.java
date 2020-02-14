package ObserverPattern;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherDataJava data = new WeatherDataJava();
		/**
		 * 注册weatherData 成为观察者
		 */
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(data);
		GeneralDisplay general = new GeneralDisplay();

//		weatherData.setMeasuresments(80, 65, 30.4);
//		weatherData.setMeasuresments(80, 65, 30.4);
//		weatherData.setMeasuresments(80, 65, 30.4);

		data.setMeasuresments(80, 65, 30.4);

	}

}
