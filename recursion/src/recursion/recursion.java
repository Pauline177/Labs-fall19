package recursion;

public class recursion {
	
	public static void main(String[] args) {
			
			multipleOf(40, 5);
			System.out.println(count);
			
	}
		

		
	public static int count = 0;
		
		
	public static void multipleOf(int x, int y) {

				if(x > y ) {	
					count++;
					x = x-y;		
					multipleOf(x,y);
				}	
		}

}
