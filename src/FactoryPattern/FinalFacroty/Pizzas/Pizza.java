package FactoryPattern.FinalFacroty.Pizzas;

/**
 * 抽象的pizza类，所有pizza都必须实现这个类
 * @author loqiu
 *
 */
import java.util.ArrayList;
import java.util.Arrays;

import FactoryPattern.FinalFacroty.PizzaIngredient.*;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	ArrayList toppings = new ArrayList();
	/**
	 * 这个方法需要收集披萨原料，而原料来自原料工厂
	 */
	public abstract void prepare();

	public void bake() {
		System.out.println("bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("place pizza in offcial pizzastore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies=" + Arrays.toString(veggies)
				+ ", cheese=" + cheese + ", toppings=" + toppings + "]";
	}

}
