package TemplateMethodPattern.SimpleTemplateMethod;

public class Tea extends CoffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("tea-brew");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("tea-condiments");
	}

}
