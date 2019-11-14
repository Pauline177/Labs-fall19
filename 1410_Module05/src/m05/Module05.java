/**
 *@author paulinemakoma
 *Assignment: Module05
 *date: 11/13/2019
 */
package m05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

/**
 * Module05: class has reads the data from a text file
 * and has functions that reverse the text. 
 * Prints initial pattern along with reversed lines.
 */
public class Module05 {
	private static ArrayList<String> lines = new ArrayList<String>();
	
	public static void main(String[] args) {
		String line = null;
		
		try {
			////reading in from file using scanner
	            File file = new File("Pattern.txt");
	            Scanner sc = new Scanner(file);
	            
	        //////print first pattern 
	           System.out.println("Pattern.txt");
			 while (sc.hasNextLine()) {
				 line = sc.nextLine();
				 lines.add(line);		 
	                System.out.println(line);
			  }
 
		   ///// printing pattern1.txt
			 System.out.println("\nPattern1.text");
			 for (String el: lines) {
					 StringBuilder str = new StringBuilder(el);
					 System.out.println(el + str.reverse());
				 }
			 
			 pattern2(lines);
			   
		} catch (FileNotFoundException e) {
			System.out.println("File not found");

		} catch (Exception e) {
			System.out.println("There is an exception");

		}
	  
	}
	
	/**
	 * lines: Array of lines from text file
	 * Pattern2: method will print lines form last to first 
	 * after print the initial pattern
	 */
	private static void pattern2(ArrayList lines) {
		Object[] array = lines.toArray();
		 System.out.println("\nPattern2.text");
		 for (Object el: lines) {
			 System.out.println(el);
		 }
		 for(int i = array.length-1; i >= 0; i--) {
			 System.out.println(array[i]);
		 }
	}
	
		
}


	

	
	




