package CompoundPattern.SimpleCompound;

public interface QuackObservable {

	public void registerObserver(Observer obserber);

	public void notifyObserver();

}
