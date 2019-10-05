/**
 * @author Pauline Makoma and Christian Makoma
 *
 */
package Courses;


public class Course {

	private String name;
	private String semester;
	private int year;
	private int id;
	private static int count = 1000;
	
	/**
	 * 
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

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public String getSemester() {
		return semester;
	}
	
	public void setSemester() {
		this.semester = semester;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear() {
		this.year = year;
	}
	
	
	
	@Override
	public String toString() {
		return name + " " + semester + year + ", Course ID: " + id;
	}
}