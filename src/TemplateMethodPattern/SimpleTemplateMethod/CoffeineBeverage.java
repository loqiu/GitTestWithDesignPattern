package TemplateMethodPattern.SimpleTemplateMethod;

/**
 * 抽象类作为基类
 * 
 * @author loqiu
 *
 */
public abstract class CoffeineBeverage {
	/**
	 * 模板方法，声明为final防止子类篡改这个方法
	 * 
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	/**
	 * 声明为final放置子类篡改
	 */
	final void boilWater() {
		System.out.println("boilWater");
	}

	final void pourInCup() {
		System.out.println("pourInCup");
	}

	/**
	 * hook一个钩子，子类可以覆盖这个方法，也可以不这么做
	 * 
	 * @return
	 */
	boolean customerWantsCondiments() {
		return true;
	}

}
