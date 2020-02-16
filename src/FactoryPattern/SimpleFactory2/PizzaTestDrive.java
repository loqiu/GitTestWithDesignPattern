package FactoryPattern.SimpleFactory2;

import FactoryPattern.SimpleFactory2.Pizzas.Pizza;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore ny = new NYPizzaStore();
		
		Pizza pizza = ny.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
	}
}
