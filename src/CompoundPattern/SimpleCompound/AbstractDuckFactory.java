package CompoundPattern.SimpleCompound;
/**
 * 工厂模式
 * @author loqiu
 *
 */
public abstract class AbstractDuckFactory {

	public abstract Quackable createMallerDuck();

	public abstract Quackable createRedheadDuck();
}
