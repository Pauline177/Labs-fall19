/**
 * @author paulinemakoma
 * Assignment:A09 ListVsSet
 * Date:Dec 7, 2019
 */
package listVsSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListVsSetDemo {

	private List<ColoredSquare> list;
	private Set<ColoredSquare> set;
	
	/**
	 * @param elements set and list elements
	 * constructor uses the elements passed to initialize both the list and the set
	 */
	public ListVsSetDemo(ColoredSquare... elements) {
		
		this.list = new ArrayList<>(Arrays.asList(elements));
		this.set = new HashSet<>(list);
	}
	
	/**
	 * @return return a formatted string containing all the elements of the list collection 
	 */
	public String getListElements() {
		
		StringBuilder sb = new StringBuilder("");
		for (ColoredSquare l: list) {
			sb.append(l);
		}
		return sb.toString();
		
	}
	
	/**
	 * @return return a formatted string containing all the elements of the set collection 
	 */
	public String getSetElements() {
		StringBuilder sb = new StringBuilder("");
		for (ColoredSquare s: set) {
			sb.append(s);
		}
		return sb.toString();
	}
	
	
	/**
	 * @param el adds an element (el) to both the list and set
	 */
	public void addElement(ColoredSquare el) {
		list.add(el);
		set.add(el);
	}
}
