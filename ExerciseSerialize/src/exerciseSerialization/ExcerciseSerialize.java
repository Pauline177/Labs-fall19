
package exerciseSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author paulinemakoma
 * Assignment:ExerciseSerialize
 * Date:Dec 9, 2019
 */
public class ExcerciseSerialize {

	/**
	 * @param args
	 * feed 20 numbers into an array, sort it
	 * serialize it, deserialize it then shuffle the numbers
	 */

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		
		try {
			
			FileOutputStream fileOut = new FileOutputStream("NumberList.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			Random rand = new Random();
			
			for (int i = 0; i < 20 ; i++) {
				numbers.add(rand.nextInt(8)*5+10);
			}
			
			System.out.println("numbers: " + numbers);
			Collections.sort(numbers);
			System.out.println("numbers2: " + numbers );
			
			/////serializing the list
			out.writeObject(numbers);
			out.close();
	        fileOut.close();
	        System.out.printf("List has been serialized \n");
	        
	        
	        
	        /////deserializing list into a new list
	        FileInputStream fileIn = new FileInputStream("NumberList.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	         numbers2 = (ArrayList) in.readObject();
	         
	         fileIn.close();
	         in.close();
	         
	         ////// reposition elements in numbers 2 array
	         Collections.shuffle(numbers2);
	         System.out.println("numbers2: " + numbers2);
	         
	         
			
		} catch (Exception e) {
			System.out.println("exception found");
		}
		

	}
	
}
