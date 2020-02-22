/**
 * @author Christian Makoma, Pauline Makoma and Benjamin Wickham
 * Assignment:GroupProject
 * Date:Dec 4, 2019
 */

package firstTry;

import javax.swing.Icon;

public class Food {

	private String name;
	private double price;
	
	/**
	 * Constructor that sets name and price
	 * @param name
	 * @param price
	 */
	public Food(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/**
	 * displays name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * displays price
	 * @return
	 */
	public double getPrice() {
		return price;
	}	
	
	/**
	 * return a string of format eg: veggie: $2.99
	 */
	@Override
	public String toString() {
		return String.format("%s: $%.2f", name, price);
	}
	
}
