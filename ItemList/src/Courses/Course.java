/**
 * @author paulinemakoma Christian Makoma
 * Assignment:ItemList
 * Date:Dec 9, 2019 edited 
 */
package Courses;


/**
 * class that represents description of the item 
 */
public class Course {

	private String name;
	private String semester;
	private int year;
	private int id;
	private static int count = 1000;
	
	/**
	 * parameterized constructor 
	 * allows the user to provide values for all the attributes
	 * @param n name of the course 
	 * @param s semester you're taking course in
	 * @param y year you're taking course in
	 */
	public Course(String n, String s,int y){
		
		this.name = n;
		this.year = y;
		this.semester = s;
		this.id = ++count;
	}

	/**
	 * displays the value of id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * displays name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * displays semester
	 * @return semester
	 */
	public String getSemester() {
		return semester;
	}
	
	
	/**
	 * displays value of year
	 * @return year 
	 */
	public int getYear() {
		return year;
	}
	

	/**
	 *displays string of this format e.g. 2015 Honda Accord id: 12345679
	 */
	@Override
	public String toString() {
		return name + " " + semester + year + ", Course ID: " + id;
	}
}
