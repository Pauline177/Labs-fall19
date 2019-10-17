
package m04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author paulinemakoma
 *@assignment Module04
 *date 10/16/2019
 */
public class Module04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		demoCollection();
	}
	
	public static void demoCollection() {
		///printing the numbers 
		ArrayList<Double> numbers = new ArrayList<Double>(
				Arrays.asList(1d/5d, 2d/5d,3d/5d,1d/4d,1d/2d,3d/4d));
		System.out.println("numbers: " + numbers);
		
		//adding numbers twice the value
		int num1 = numbers.size();
		for(int i = 0; i < num1; i++ ) 	{
			numbers.add(numbers.get(i)*2);
		}
		
		//// sorting numbers in ascending order
		Collections.sort(numbers);
		System.out.println("numbers: " + numbers);
		
		/// replace numbers by number*100
		int num2 = numbers.size();
		for(int i = 0; i < num2; i++ ) 	{
			numbers.set(i, numbers.get(i)*100);
		}
		System.out.println("numbers: " + numbers);
			
		System.out.println();
		
		ArrayList<String> hexNumbers = new ArrayList<String>();
		
		for(int i = 0; i < num2; i++ ) 	{
			hexNumbers.add(Double.toHexString(numbers.get(i)));
		}
		System.out.println("hexNumbers: " + hexNumbers);
		
		
		
		int num3 = hexNumbers.size();
		/// new array of hexNumbers without duplicates
		ArrayList<String> newHexNumbers = new ArrayList<String>();
		
		for(int i = 0; i < num3; i++ ) 	{
			if ( !(newHexNumbers.contains(hexNumbers.get(i)))) {
				newHexNumbers.add(hexNumbers.get(i));
			}
		}
		/// sorting new array of hexNumbers
		Collections.sort(newHexNumbers);
		
		System.out.println("hexNumbers: " + newHexNumbers);
		
		
		
		
		
	}
	
	
}
