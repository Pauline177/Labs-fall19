/**
 * 
 */
package keyValue1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author paulinemakoma
 *
 */
public class pairApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KeyValuePair<String , Integer> p1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String , Integer> p2 = new KeyValuePair<>("NYC", 8244910);
		KeyValuePair<String , Integer> p3 = new KeyValuePair<>("LA", 3819701);
		KeyValuePair<String , Integer> p4 = new KeyValuePair<>("SF", 812826);
		
		List<KeyValuePair> cities = new ArrayList<KeyValuePair>();
		
		///add elements to the list
		cities.add(p1);
		cities.add(p2);
		cities.add(p3);
		cities.add(p4);
		
		////print original list
		System.out.println("Original List:");
		for(KeyValuePair city: cities) {
			System.out.println(city);
		}
		System.out.println();
		
		///print sorted list
		Collections.sort(cities);
		
		///// print sorted list 
		System.out.println("Sorted List:");
		for(KeyValuePair city: cities) {
			System.out.println(city);
		}
		
	
		
	}

}
