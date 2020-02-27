package CompoundPattern.SimpleCompound;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("quackologist: " + duck + " just quacked.");
	}

}
