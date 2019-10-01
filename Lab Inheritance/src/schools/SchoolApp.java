package schools;


public class SchoolApp {

	public static void main(String[] args) {
		
		School school1 = new School("Salt Lake Community College");

		beSchool(school1);
		System.out.println();
		
		AnotherSchool school2 = new AnotherSchool("University of Utah", 500);

		beSchool(school2);
		System.out.println(school2.toString(500));
		
		
	}

	public static void beSchool(School s) {
		System.out.println(s);
		s.location();
		s.time();
		s.scholar();
	}
}


