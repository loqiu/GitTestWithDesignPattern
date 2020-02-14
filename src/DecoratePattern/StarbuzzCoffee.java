package DecoratePattern;

import DecoratePattern.Beverages.Beverage;
import DecoratePattern.Beverages.DarkRoast;
import DecoratePattern.Beverages.Espresso;
import DecoratePattern.Beverages.HouseBlend;
import DecoratePattern.Condiment.Mocha;
import DecoratePattern.Condiment.Soy;
import DecoratePattern.Condiment.Whip;

/**
 * 具体测试类
 * 
 * 通常用于工厂或生成器模式创建装饰者
 * 
 * java I/O 就是典型的装饰链条
 * 
 * @author loqiu
 *
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {
		/**
		 * 定一杯Espresso，不加任何东西
		 */
		Beverage beverage_espresso = new Espresso();
		System.out.println(beverage_espresso.getDescription() + " $" + beverage_espresso.cost());

		/**
		 * 定一杯 darkRoast，加双倍Mocha 加Whip 形成一连串的装饰链条
		 */
		Beverage beverage_darkRoast = new DarkRoast();
		beverage_darkRoast = new Mocha(beverage_darkRoast);
		beverage_darkRoast = new Mocha(beverage_darkRoast);
		beverage_darkRoast = new Whip(beverage_darkRoast);
		System.out.println(beverage_darkRoast.getDescription() + " $" + beverage_darkRoast.cost());

		Beverage beverage_houseblend = new HouseBlend();
		beverage_houseblend = new Soy(beverage_houseblend);
		beverage_houseblend = new Mocha(beverage_houseblend);
		beverage_houseblend = new Whip(beverage_houseblend);
		System.out.println(beverage_houseblend.getDescription() + " $" + beverage_houseblend.cost());

	}

}
