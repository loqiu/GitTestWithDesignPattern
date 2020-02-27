package CompoundPattern.SimpleCompound;

import java.util.Observer;

/**
 * 装饰者
 * 
 * @author loqiu
 *
 */
public class QuackCounter implements Quackable {

	Quackable duck;
	static int numberOfQuacks = 0;

	public QuackCounter(Quackable duck) {
		// TODO Auto-generated constructor stub
		this.duck = duck;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		numberOfQuacks++;
	}

	public static int getNumber() {
		return numberOfQuacks;
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerObserver(CompoundPattern.SimpleCompound.Observer obserber) {
		// TODO Auto-generated method stub
		
	}

}
