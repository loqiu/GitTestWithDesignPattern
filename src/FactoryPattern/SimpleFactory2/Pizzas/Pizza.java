package FactoryPattern.SimpleFactory2.Pizzas;
/**
 * 抽象的pizza类，所有pizza都必须实现这个类
 * @author loqiu
 *
 */
import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();

	public void prepapre() {
		System.out.println("preparing " + name);
		System.out.println("tossing dough");
		System.out.println("adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}

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
}
