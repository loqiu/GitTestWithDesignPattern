package FactoryPattern.FinalFacroty;

import FactoryPattern.FinalFacroty.PizzaIngredient.*;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();

}
