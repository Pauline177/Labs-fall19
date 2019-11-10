package labQuadrotors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author paulinemakoma
 *
 */
public class QuadrotorApp {

	public static void main(String[] args) {
		List<Quadrotor> rotors = new ArrayList(Arrays.asList(
				 new Quadrotor(2, 4, 2), new Quadrotor(3, 4, 4), new Quadrotor(4, 4, 6),
				 new Quadrotor(5, 4, 2), new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6)));
		
		System.out.println(rotors);
		
		changeOrientation(rotors);
		System.out.println(rotors);
		
		Quadrotor searchItem = new Quadrotor(4,6,4);
		System.out.println();
		
		///// search if the item exist in the list of rotors
		if(rotors.contains(searchItem)) {
			System.out.println("rotors does contain " + searchItem);
		} else {
			System.out.println("rotors does not contain " + searchItem);
		}
		
		///// print the numbers of rotors 
		System.out.println("\nNumber of rotors: " + rotors.size());
		
		
		//// remove searchItem from rotors
		rotors.remove(searchItem);
		System.out.println();
		System.out.println(rotors);
		
		////reomve item at index 0
		rotors.remove(0);
		System.out.println(rotors);
		
		
	}
	
	
	/**
	 * @param l quadrotor with x,y,z coordinates
	 * changes the direction by swapping x and y
	 */
	private static void changeOrientation(List<Quadrotor> l) {
		//creates a new array of the same size as the quadrotors
		 Quadrotor newor[] = new Quadrotor[l.size()];
		 int i = 0;
		 
		 ///get x y z elemetns and swaps x with y 
		 for (Object o: l) {
			 Quadrotor q = (Quadrotor)o;
			 int x = q.getX();
			 int y = q.getY();
			 int z = q.getZ();
			 
			 newor[i] = new Quadrotor(y,x,z);
			 i++;
		 }
		 
		 ////set the quadrotors to the new values in the new array. those that are swapped
		 int j = 0;
		 for (Quadrotor quad: newor) {
			 l.set(j, quad);
			 j++;
		 } 
		 
	}
	
		
}
