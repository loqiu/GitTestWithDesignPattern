package FactoryPattern.SimpleFactory2.Pizzas;

public class NYStyleCheesePizza extends Pizza {
		public NYStyleCheesePizza() {
			name = "NY style sauce and Cheese Pizza";
			dough = "THIN crust dough";
			sauce = "Marinara Sauce";
			
			toppings.add("Grated Reggiano Cheese");
		}
		@Override
		public void cut() {
		// TODO Auto-generated method stub
			System.out.println("Cutting ths pizza into square slices");
		}
}
