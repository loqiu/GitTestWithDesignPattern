package FactoryPattern.SimpleFactory;

import FactoryPattern.SimpleFactory.Pizzas.Pizza;

public class PizzaStore {
	SimplePizzaFactory factory;

	/**
	 * 需要一个工厂作为参数
	 * 来创建工厂实例，有些类似观察者要注册主题
	 * @param factory
	 */
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;
		/**
		 * 这里把new操作符换成了工厂创建方法，不再使用具体实例化
		 * order方法委托工厂来创建pizza
		 */
		pizza = factory.createPizza(type);

		// pizza 的其他方法

		return pizza;
	}
	// 其他方法

}
