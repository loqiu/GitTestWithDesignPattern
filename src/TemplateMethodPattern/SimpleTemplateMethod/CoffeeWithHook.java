package TemplateMethodPattern.SimpleTemplateMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 使用hook的算法模板
 * @author loqiu
 *
 */
public class CoffeeWithHook extends CoffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("coffee with hook brew");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("coffee with hook condiments");
	}

	@Override
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		String ans = getUserInput();
		if (ans.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String ans = null;

		System.out.println("would you like milk and sugar with your coffee");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			ans = in.readLine();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
		if (ans == null) {
			return "no";
		}
		return "yes";
	}

}
