/**
 * 
 */
package exception;

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
		int digit = numberFromUser();
		int result = sevenModulusN(digit);
		System.out.printf("7 %% %.1f = %.1f", digit, result);
	}
	
	private static int numberFromUser(){
		Scanner input = new Scanner(System.in);
		System.out.print("number: ");
		return input.nextInt();
	}
	
	private static int sevenModulusN(int number){
		
		return 7 % number;
		}


}
