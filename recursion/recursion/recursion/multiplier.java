 package recursion;

public class multiplier {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
			multipleOf(num1, num2);
			
			System.out.printf("There are %d multiples of %d in %d", count, num2, num1);
			
	}
	
	public static int count = 0;
		
		
	public static void multipleOf(int x, int y) {

				if(x >= y) {	
					count++;
					x = x - y ;		
					multipleOf(x,y);
				}	
		}

}
