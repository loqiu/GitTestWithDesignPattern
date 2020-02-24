package CompositePattern;

public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("pancake house menu", "breakfast");
		MenuComponent dinerMenu = new Menu("diner menu", "lunch");
		MenuComponent cafeMenu = new Menu("cafee menu", "is so good");
		MenuComponent dessertMenu = new Menu("dessert menu", "dessert of course!");
		MenuComponent allMenus = new Menu("all menus", "all menus combined");
		/**
		 * 所有菜单加入顶层菜单
		 */
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dessertMenu);
		/**
		 * 加入菜单项
		 */
		dinerMenu
				.add(new MenuItem("pasta", "spaghetti with marinara sauce,and a slice if sourdough bread", true, 3.89));
		dinerMenu.add(dessertMenu);

		dessertMenu.add(
				new MenuItem("apple pie", "apple pie with a falkey crust,topped with vanilla ica cream", true, 1.59));

		pancakeHouseMenu.add(new MenuItem("why", "im so good", false, 10));

		cafeMenu.add(new MenuItem("wxw", "i want a extensive party!", false, 90));

		/**
		 * 把顶层菜单给waiter
		 */
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();

	}

}
