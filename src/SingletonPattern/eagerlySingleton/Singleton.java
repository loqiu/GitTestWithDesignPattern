package SingletonPattern.eagerlySingleton;

public class Singleton {
	/**
	 * 私有的构造器，私有的单例变量
	 * JVM在加载这个类的时候马上就创建一个唯一的单例变量
	 */
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {
	}

	/**
	 * 没有延迟实例化
	 * @return
	 */
	public static Singleton getInstance() {
		return uniqueInstance;
	}

}
