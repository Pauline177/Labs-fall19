package Courses;

import java.util.ArrayList;

public class AllCourses {
	
	private ArrayList<Course> allCourses;
	
	
	public AllCourses() {
		allCourses =  new ArrayList<Course>();
		
	}

	///1.show all courses
	public void displayAllCourses() {
		for (Course c : allCourses) {
			System.out.println(c);
		}
	}
	
	//2.add a course
	public void addCourse(Course c) {
		allCourses.add(c);
	}
	
	//3. find a course
	public Course findCourse(int id) {
		for (int i = 0; i < allCourses.size(); i++) {
			if(allCourses.get(i).getId() == id) {
				return allCourses.get(i);
			}
		}
		return null;
	}
	
	
	///4.delete a course
	public Course deleteCourse(int id) {
		for(int i = 0; i < allCourses.size(); i++) {
			if(allCourses.get(i).getId() == id) {
				return allCourses.remove(i);
			}
		}
		return null;
	}
	
	
	//5. show number of all course
	public int getNumbers() {
		return allCourses.size();
				
	}
	
	
}