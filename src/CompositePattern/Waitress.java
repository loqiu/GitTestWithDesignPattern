package CompositePattern;

import java.util.Iterator;

public class Waitress {

	MenuComponent allMenus;

	/**
	 * 把最顶层的菜单组件交给她就可以完成整个组合的遍历
	 * 
	 * @param allMenus
	 */
	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("VegetarianMenu");
		while (iterator.hasNext()) {
			MenuComponent menu = iterator.next();
			try {
				if (menu.isVegetarian()) {
					menu.print();
				}
			} catch (UnsupportedOperationException e) {
				// TODO: handle exception
			}
		}
	}

}
