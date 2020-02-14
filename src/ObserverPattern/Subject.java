package ObserverPattern;
/**
 * 主题接口，所有主题都应实现这一接口
 * 
 * @author loqiu
 *
 */
public interface Subject {
	/**
	 * @param Observer o 观察者注册
	 */
	public void registerObserver(Observer o);
	/**
	 * 删除一个观察者
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	public void notifyObserver();
}
