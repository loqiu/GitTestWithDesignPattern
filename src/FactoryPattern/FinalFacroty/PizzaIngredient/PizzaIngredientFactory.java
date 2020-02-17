package FactoryPattern.FinalFacroty.PizzaIngredient;

import FactoryPattern.FinalFacroty.PizzaIngredient.*;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();

}
