/**
 * 
 */
package labExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author paulinemakoma
 * Lab ExceptionHandling
 * date: 11/10/2019
 *
 */
public class LabExceptionHandling {

	public static void main(String[] args){
		
		try {
            int digit = numberFromUser();

            int result = sevenModulusN(digit);
            System.out.printf("7 %% %.1f = %.1f", (float)digit, (float)result);
        } catch (IllegalArgumentException exception) {

            System.out.println(exception.getMessage());
        }

	}
	
	private static int numberFromUser(){
		 Scanner input = new Scanner(System.in);
	        while (true) {
	            try {

	                System.out.print("number: ");
	                int number = Integer.parseInt(input.nextLine());
	                if (number == 0) throw new IllegalArgumentException("Can’t calculate 7 % 0 ");
	                return number;
	            } catch (NumberFormatException nfe) {
	                System.out.println("The number entered needs to be a whole number");
	            }

	        }

		
	}
		private static int sevenModulusN(int number){
			return 7 % number;
	
	}
	
}
