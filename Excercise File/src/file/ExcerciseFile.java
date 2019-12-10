/**
 * 
 */
package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author paulinemakoma
 * Assignment:Excercise File
 * Date:Dec 9, 2019
 */
public class ExcerciseFile {
	
	static Scanner scan = new Scanner(System.in);
	
	/**
	 * @param args
	 * will read in from file and replace every x with 
	 * character provided by the user
	 */
	public static void main(String[]args) {
		String line = null;
		
		try(PrintWriter writer = new PrintWriter("Diamond2.txt")) {
	            File file = new File("Diamond.txt");
	            Scanner sc = new Scanner(file);
	            
	            System.out.println("Please enter one character: ");
	            String newChar = scan.nextLine();
	            
			 while (sc.hasNextLine()) {
				 line = sc.nextLine();
		 
	             System.out.println((line.replace("x", newChar)));
	             writer.println(line.replace("x", newChar));      
			  }
			 
		} catch (Exception e) {
			System.out.println("There is an exception");

		}
		

		
}
	
}