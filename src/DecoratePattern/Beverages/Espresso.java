package DecoratePattern.Beverages;

public class Espresso extends Beverage {
	/**
	 * 设置饮料的描述
	 */
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
