package CompoundPattern.SimpleCompound;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {

	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer obserber) {
		// TODO Auto-generated method stub
		observers.add(obserber);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()) {
			Observer observer = it.next();
			observer.update(duck);
		}
	}

}
