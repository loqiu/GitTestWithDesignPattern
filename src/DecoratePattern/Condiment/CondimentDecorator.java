package DecoratePattern.Condiment;

import DecoratePattern.Beverages.Beverage;

/**
 * 抽象装饰者，包含需要被装饰部分
 * @author loqiu
 *
 */
public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();
	
}
