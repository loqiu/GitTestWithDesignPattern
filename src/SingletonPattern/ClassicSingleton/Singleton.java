package SingletonPattern.ClassicSingleton;

public class Singleton {
	/**
	 * 私有的构造器，私有的单例变量
	 */
	private static Singleton uniqueInstance;
	
	private Singleton() {
	}

	/**
	 * Singleton Pattern 这个if判断来保证 只有一个对象实例
	 * getInstance 可以保证对象的延迟实例化
	 * 但是多线程会有创建多个实例的风险，可使用同步，但会大大影响性能
	 * @return
	 */
	public synchronized static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
