package FactoryPattern.FinalFacroty.Pizzas;

import FactoryPattern.FinalFacroty.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory factory;
	/**
	 * 关键是要在产品构造方法中与工厂建立联系
	 * @param factory
	 */
	public CheesePizza(PizzaIngredientFactory factory) {
		// TODO Auto-generated constructor stub
		this.factory = factory;
	}

	/**
	 * 这里对pizza进行初始化
	 * 不关心工厂原料
	 * 只关心如何制作prepare
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		// 。。。。。
	}

}
