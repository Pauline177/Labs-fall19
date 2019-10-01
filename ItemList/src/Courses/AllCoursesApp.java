package Courses;
import java.util.Scanner;

public class AllCoursesApp {

	private static Scanner input = new Scanner(System.in);
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AllCoursesApp all = new AllCoursesApp();
		AllCourses myC = new AllCourses();
		Course  c ;
		int id = 0;
		
		int choice = 0; 
		while(choice != 6) {
			System.out.println();
			System.out.println("1. Display all books");
            System.out.println("2. Add a book");
            System.out.println("3. Find a book");
            System.out.println("4. Delete a book");
            System.out.println("5. Number of books");
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
