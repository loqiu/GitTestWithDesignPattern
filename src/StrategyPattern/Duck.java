package StrategyPattern;

public abstract class Duck {
	FlyBahavior flybehavior;
	QuackBehavior quackbehavior;
	/**
	 * 引用实现quackbehavior接口的对象
	 * 鸭子对象自己不会实现quack行为，而是委托给quackbehavior引用的对象
	 */
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		flybehavior.fly();
	}
	
	public void performQuack() {
		quackbehavior.quack();
	}
	
	public void swim() {
		System.out.println("all ducks float");
	}
	
	public void setFlyBehavior(FlyBahavior fb) {
		this.flybehavior = fb;
	}
	/**
	 * 可以随时更换 调用这两个方法
	 * @param qb
	 */
	public void setQuackBehavior(QuackBehavior qb) {
		quackbehavior = qb;
	}
	
}
