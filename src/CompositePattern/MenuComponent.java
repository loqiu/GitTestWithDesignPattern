package CompositePattern;

import java.util.Iterator;

/**
 * 组合模式：允许你将对象组合成树形结构来表现“整体/部分”层次结构。组合能让客户以一至的方式处理个别对象以及对象组合
 * 
 * 最后组合成一个树形结构
 * 
 * @author loqiu
 *
 */
public abstract class MenuComponent {
	
	public abstract Iterator<MenuComponent> createIterator();
	
	/**
	 * 组合方法
	 * 
	 * @param menuComponent
	 */
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	/**
	 * operation
	 * 
	 * @return
	 */
	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}

}
