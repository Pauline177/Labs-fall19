/**
 * @author paulinemakoma Christian Makoma
 * Assignment:ItemList
 * Date:Dec 9, 2019 edited 
 */
package Courses;

import java.util.ArrayList;



/**
 * class that has all functionality methods.
 */
public class AllCourses {
	
	private ArrayList<Course> allCourses;
	
	/**
	 * allCourses: an array that will keep track of all courses
	 */
	public AllCourses() {
		allCourses =  new ArrayList<Course>();
		
	}

	/**
	 * prints all courses in array allCourses
	 */
	public void displayAllCourses() {
		for (Course c : allCourses) {
			System.out.println(c);
		}
	}
	
	
	/**
	 * add course to the array allCourses
	 * @param c
	 */
	public void addCourse(Course c) {
		allCourses.add(c);
	}
	
	
	/**
	 * looks up a course by its id
	 * @param id
	 * @return 
	 */
	public Course findCourse(int id) {
		for (int i = 0; i < allCourses.size(); i++) {
			if(allCourses.get(i).getId() == id) {
				return allCourses.get(i);
			}
		}
		return null;
	}
	
	
	
	/**
	 * deletes a course by its id
	 * @param id
	 * @return
	 */
	public Course deleteCourse(int id) {
		for(int i = 0; i < allCourses.size(); i++) {
			if(allCourses.get(i).getId() == id) {
				return allCourses.remove(i);
			}
		}
		return null;
	}
	
	
	
	/**
	 * displays the length of the array allCourses
	 * @return 
	 */
	public int getNumbers() {
		return allCourses.size();
				
	}
	
	
}