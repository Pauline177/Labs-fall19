/**
 * @author paulinemakoma Christian Makoma
 * Assignment:ItemList
 * Date:Dec 9, 2019 edited 
 */
package Courses;
import java.util.Scanner;

/**
 *client class
 */
public class AllCoursesApp {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		AllCourses myC = new AllCourses();
		Course  c;
		int id = 0;
		
		//// add 4 courses
		myC.addCourse(new Course("Math", "Fall", 2018));
		myC.addCourse(new Course("CSIS 1400", "Summer", 2019));
		myC.addCourse(new Course("Chemistry", "Summer", 2017));
		myC.addCourse(new Course("Englis", "Spring", 2018));
		
		int choice = 0; 
		////// menu format
		while(choice != 6) {
			System.out.println();
			System.out.println("1. Display all courses");
            System.out.println("2. Add a course");
            System.out.println("3. Find a course");
            System.out.println("4. Delete a course");
            System.out.println("5. Number of courses");
            System.out.println("6. Exit");
            System.out.print("Enter selection: ");
         
            choice = input.nextInt();
            input.nextLine();
            System.out.println();
            if(choice == 1) {
            	if(myC.getNumbers() <= 0) 
            		
            		System.out.println("\nNo Courses found yet");
            	else 
            	myC.displayAllCourses();
            	
            } else if(choice == 2) {
            	c = courseDes();
            	myC.addCourse(c);
            	System.out.println();
            	System.out.println(c + " was added");
            	
            }else if( choice == 3) {
            	System.out.println();
            	System.out.println("Enter Course id: ");
            	id = input.nextInt();
            	input.nextLine();
            	c = myC.findCourse(id);
            	if(c == null) {
            		System.out.println();
            		System.out.println(" No Course found");
            	} else {
            		System.out.println();
            		System.out.println(c + " is one of your courses");
            	}
            } else if( choice == 4) {
            	System.out.println();
            	System.out.println("(delete)Enter Course id to: ");
            	id = input.nextInt();
            	input.nextLine();
            	c = myC.deleteCourse(id);
            	if(c == null) {
            		System.out.println();
            		System.out.println(" No Course found");
            	} else {
            		System.out.println();
            		System.out.println(c + " was deleted from your courses");
            	}
            } else if( choice == 5) {
            	System.out.println();
            	System.out.println("you have signed up for " + myC.getNumbers() + " course(s)");
            }else if (choice == 6) {
            	System.out.println();
            	System.out.println("Goodbye");
            }else {
            	System.out.println();
            	System.out.println("Choose a valid option");
            }
		}

	}
	
	
	/**
	 * read input from user
	 * @return
	 */
	public static Course courseDes() {
		String name, semester;
		int year;

		System.out.println("Course Name: ");
		 name= input.nextLine();
		 

		System.out.println("Course Semester: ");
		semester = input.nextLine();
		
		System.out.println("Course Year: ");
		year = input.nextInt();
		input.nextLine();
		
		return new Course(name, semester, year);
	}

}
