package CompoundPattern.SimpleCompound;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallerDuck() {
		// TODO Auto-generated method stub
		return new MallerdDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new RedheadDuck();
	}

}
