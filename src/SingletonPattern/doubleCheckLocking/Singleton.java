package SingletonPattern.doubleCheckLocking;
/**
 * 同步区块的双重验证比同步getInstance上会缓解性能的损失
 * @author loqiu
 *
 */
public class Singleton {
	/**
	 * volatile关键字确保 uniqueInstance变量被初始化成单例实例时，多线程正确的处理uniqueInstance变量
	 */
	private volatile static Singleton uniqueInstance;

	private Singleton() {
	}
	/**
	 * 双重验证，同步区块只会执行一次
	 * @return
	 */
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

}
