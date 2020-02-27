package CompoundPattern.SimpleCompound;

public class MallerdDuck implements Quackable {

	Observable observable;
	
	public MallerdDuck() {
		// TODO Auto-generated constructor stub
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("maller-quack");
		notifyObserver();
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		observable.notifyObserver();
	}


	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

}
