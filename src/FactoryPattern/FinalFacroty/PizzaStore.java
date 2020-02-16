package FactoryPattern.FinalFacroty;

import FactoryPattern.FinalFacroty.Pizzas.Pizza;

public abstract class PizzaStore {

	/**
	 * 这里把new操作符换成了工厂创建方法，不再使用具体实例化 order方法委托工厂来创建pizza
	 * @param type
	 * @return Pizza 提供的Pizza
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		//prepare会在createpizza -> cheesepizza中被调用
		// pizza 的其他方法
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	// 其他方法
	/**
	 * 使得所有继承pizzastore的店都必须实现自己的createPizza方法，这就是一个工厂方法
	 * 工厂方法是抽象的，所以依赖子类来处理对象的创建
	 * 返回值必须是一个产品，这才是一个工厂
	 * 工厂方法将 客户 和 创建具体产品的代码分隔开来
	 * @param type
	 * @return Pizza
	 */
	public abstract Pizza createPizza(String type);

}
