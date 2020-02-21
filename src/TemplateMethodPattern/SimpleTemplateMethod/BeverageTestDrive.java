package TemplateMethodPattern.SimpleTemplateMethod;

public class BeverageTestDrive {

	public static void main(String[] args) {
		CoffeeWithHook coffee = new CoffeeWithHook();
		System.out.println("making coffee\n");
		coffee.prepareRecipe();
		
	}

}
