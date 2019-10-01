package m01;
import java.util.Scanner;

public class Module01 {
	
//	 public static void main(String[] args) {
//	        Scanner input = new Scanner(System.in);
//	        StringBuilder wordb = new StringBuilder(input.nextLine());
//
//
//	        System.out.print(wordb.reverse().toString() + "_" + wordb.reverse() );
//
//	        if(wordb.toString().startsWith("a")){
//	            wordb.toString().replace("a", "A");
//	        } else if (wordb.toString().startsWith("b")){
//	            wordb.toString().replace("b", "B");
//	        }  else if(wordb.toString().endsWith("y")) {
//	            wordb.toString().replace("y", "Y");
//	        }  else if(wordb.toString().endsWith("z")) {
//	            wordb.toString().replace("z", "Z");
//	        }
//
//	    }
	 
	 Scanner input = new Scanner(System.in);
     StringBuilder wordb = new StringBuilder(input.nextLine());


     System.out.print(wordb.reverse().toString() + "_" + wordb.reverse() );

     if(wordb.toString().startsWith("a")){
         wordb.toString().replace("a", "A");
     } else if (wordb.toString().startsWith("b")){
         wordb.toString().replace("b", "B");
     }  else if(wordb.toString().endsWith("y")) {
         wordb.toString().replace("y", "Y");
     }  else if(wordb.toString().endsWith("z")) {
         wordb.toString().replace("z", "Z");
     }
	 
	 
	 
}
