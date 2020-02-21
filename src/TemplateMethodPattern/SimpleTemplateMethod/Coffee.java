package TemplateMethodPattern.SimpleTemplateMethod;

public class Coffee extends CoffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("coffee-brew");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("coffee-condiments");
	}

}
