package schools;

public class AnotherSchool extends School {

	private int students;
	
	public AnotherSchool (String n, int s) {
		super(n);
		this.students = s;
	}
	
	@Override
	public void scholar() {
		System.out.println("Does not offer scholarships");
	}
	
	public String toString(int s) {
		return String.format("Total number of student: " + s);
	}
	
	
}
