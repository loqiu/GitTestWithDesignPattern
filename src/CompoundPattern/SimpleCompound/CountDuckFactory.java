package CompoundPattern.SimpleCompound;

public class CountDuckFactory extends AbstractDuckFactory {
	/**
	 * 每个方法都有装饰器quackcount包装起来
	 */
	@Override
	public Quackable createMallerDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new MallerdDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RedheadDuck());
	}

}
