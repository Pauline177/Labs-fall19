
package keyValue1;

/**
 * @author paulinemakoma
 * assignment KeyValuePair1
 * date: 10/28/2019
 *
 */
public class pairApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KeyValuePair<String , Integer> p1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String , Integer> p2 = new KeyValuePair<>("NYC", 8244910);
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println();
		
		/// assign p2 to p1
		p1 = p2;
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1.equals(p2): " + p1.equals(p2));		
	}

}
