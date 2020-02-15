package FactoryPattern.SimpleFactory;

import FactoryPattern.SimpleFactory.Pizzas.CheesePizza;
import FactoryPattern.SimpleFactory.Pizzas.Pizza;

public class SimplePizzaFactory {
	
	public static Pizza createPizza(String type) {
		/**
		 * 这是制作Pizza的代码
		 */
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		}
		//等等。。。。其他的pizza类型
		return pizza;
	}

}
