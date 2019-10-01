package schools;

public class School {

	private String name;
		
	public School (String n) 
	{
		name = n;
	}
			
	
	public String toString() 
	{
		return String.format("Welcome to %s ", getSchool());
	}
	
	public void time() {
		System.out.println("Spring Summer Fall");
	}
	
	public void location() 
	{
		System.out.println("Located in Utah ");
	}
	public void scholar() {
		System.out.println("Offers scholarships");
	}

	public String getSchool() {
		return name;
	}
	
	
	
}