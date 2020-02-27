package CompoundPattern.SimpleCompound;

/**
 * 集合模式
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public class Flock implements Quackable {

	ArrayList<Quackable> ducklist = new ArrayList<Quackable>();

	public void add(Quackable quack) {
		ducklist.add(quack);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator<Quackable> it = ducklist.iterator();
		while (it.hasNext()) {
			Quackable duck = it.next();
			duck.quack();
		}
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
