package FactoryPattern.FinalFacroty;

import FactoryPattern.FinalFacroty.PizzaIngredient.NYPizzaIngredientFactory;
import FactoryPattern.FinalFacroty.PizzaIngredient.PizzaIngredientFactory;
import FactoryPattern.FinalFacroty.Pizzas.CheesePizza;
import FactoryPattern.FinalFacroty.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
	/**
	 * 每一个店都要实现自己的createPizza方法
	 */
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setName("NY York style cheese pizza");
			return pizza;
		}
		//。。。。
		return null;
	}

}
