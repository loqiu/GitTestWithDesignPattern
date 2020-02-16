package FactoryPattern.SimpleFactory2;

import FactoryPattern.SimpleFactory2.Pizzas.NYStyleCheesePizza;
import FactoryPattern.SimpleFactory2.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
	/**
	 * 每一个店都要实现自己的createPizza方法
	 */
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}
		//。。。。
		return null;
	}

}
