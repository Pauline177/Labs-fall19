/**
 * 
 */
package exerciseGeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * @author paulinemakoma
 * Assignment:Exercise Generic
 * Date:Dec 9, 2019
 */
public class Generic {

	/**
	 * two lists contain elements of type double and string.
	 * 
	 * @param args
	 */

	 static ArrayList<Double> numbers = new ArrayList<Double>();
	 static ArrayList<String> letters = new ArrayList<String>();

	public static void main(String[] args) {
		
		////// adding elements to the list
		numbers.add(1.1);
		numbers.add(2.2);
		numbers.add(3.3);
		numbers.add(4.4);
		numbers.add(5.5);
		numbers.add(6.6);
		
		
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("e");
		letters.add("f");
		letters.add("g");
		
		System.out.println("Original list: ");
		System.out.println("number: " + numbers);
		System.out.println("letters: " + letters);
		
		//////// removing every other element.
		System.out.println("After removing");
		removeEveryOtherElement(numbers);
		removeEveryOtherElement(letters);
	
		System.out.println("number: " + numbers);
		System.out.println("letters: " + letters);
		
	}
	
	/**
	 * removes every other element of the list
	 * return nothing 
	 * @param T
	 */
	private static void removeEveryOtherElement(List T) { 
		for(int i = 1; i  < T.size() ; i++) {
			T.remove(i);	
		}

	}

}
