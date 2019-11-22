package inheritance;
/**
 * @author paulinemakoma
 * Assignment:A04 Inheritance
 * Date:Nov 16, 2019
 */


public class IsoscelesRightTriangle implements Shape, Printable{
	
	/**
	 * 1 private final field of type int.
	 */
	private final int leg;

	/**
	 * parameterized constructor that initializes the field created about.
	 * @param leg 
	 */
	public IsoscelesRightTriangle(int leg) {
		super();
		this.leg = leg;
	}
	
	/**
	 * Hypotenuse returns a value of type double
	 * @param hypo
	 * @return hypo value of hypotenuse
	 */
	public double hypotenuse(double hypo) {
		return hypo;
	}
	
	/**
	 * getLeg provide a getter for the field but no setter
	 * @return leg value of leg
	 */
	public int getLeg() {
		return leg;
	}
	
	/**
	 * gives a String of the following form:
	 * IsoscelesRightTriangle(leg) e.g. IsoscelesRightTriangle(5)
	 */
	public String toString() {
		return String.format("IsoscelesRightTriangle(%d)", leg);
	}
}
