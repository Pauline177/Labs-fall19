/**
 * @author Christian Makoma, Pauline Makoma and Benjamin Wickham
 * Assignment:GroupProject
 * Date:Dec 4, 2019
 */
package firstTry;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FoodApp {
	
	private static ArrayList<Food> orderList = new ArrayList<Food>();
	
	/**
	 * adds the selected item to the orderlist
	 * @param item
	 */
	public static void addOrder(Food item) {
		orderList.add(item);
	}

	/**
	 * print receipt of orderlist and the total price
	 */
	public static void writeOrder() {
		String filename = "PrintReceipt.txt";
		
		try(PrintWriter writer = new PrintWriter(filename)) {
			double totalPrice = 0;
			for (Food f: orderList) {
				writer.println(f);
				totalPrice += f.getPrice();
			}
			writer.println(String.format("Total: $%.2f", totalPrice));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}
