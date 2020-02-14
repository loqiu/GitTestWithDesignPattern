package DecoratePattern.Condiment;

import DecoratePattern.Beverages.Beverage;

/**
 * 具体装饰者，继承CondimentDecorator，都扩展自Beverage 所有的装饰者类型是相同的
 * @author loqiu
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;
	double cost=0.4;
	/**
	 * 让被装饰者被记录到实例变量中，允许任何实现beverage的对象使用Mocha，实现’动态装配‘
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.4+beverage.cost();
	}
}
