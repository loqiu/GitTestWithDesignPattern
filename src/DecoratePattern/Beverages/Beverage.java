package DecoratePattern.Beverages;

/**
 * 抽象组件Beverage
 * 
 * @author loqiu
 *
 */
public abstract class Beverage {

	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
