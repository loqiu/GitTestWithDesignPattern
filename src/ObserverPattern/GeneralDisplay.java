package ObserverPattern;
/**
 * 使用Java内置的类来实现观察者模式
 * 
 * 这个是观察者，通过Java内置的 observer接口实现
 */
import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}
	
	public void display() {
		
	}
	
}
