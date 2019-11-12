/**
 * 
 */
package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author paulinemakoma
 *
 */
public class LabException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  try {
	            int digit = numberFromUser();

	            int result = sevenModulusN(digit);
	            System.out.printf("7 %% %d = %d", digit, result);
	        } catch (IllegalArgumentException exception) {

	            System.out.println(exception.getMessage());
	        }
	}
	
	private static int numberFromUser(){
		Scanner input = new Scanner(System.in);
        while (true) {
            try {

                System.out.print("number: ");
                int number = input.nextInt();
                input.nextLine();
            
                if (number == 0) 
                	throw new IllegalArgumentException("Can’t calculate 7 % 0 ");
                return number;
                
            } catch (InputMismatchException e) {
                System.out.println("The number entered needs to be a whole number");
                input.nextLine();
            }

        }
	}
	
	private static int sevenModulusN(int number){
		
		return 7 % number;
		}


}
