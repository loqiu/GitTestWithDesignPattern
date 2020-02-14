package StrategyPattern;
/**
 * 设计原则：找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起。
 * 设计原则：针对接口编程，而不是针对实现编程。
 * 设计原则：多用组合，少用继承。
 * 
 * 策略模式：定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
 * 
 * @author loqiu
 *
 */
public class MiniDuckTest {
	
	public static void main(String[] args) {
		Duck mallard = new MallarDuck();
		mallard.performFly();
		mallard.performQuack();
		System.out.println("---------------------------");
		/**
		 * 对 mallard 设定新的flyBehavior方法
		 * 想改变行为，只需要调用鸭子的set方法
		 */
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performFly();
		
	}

}
