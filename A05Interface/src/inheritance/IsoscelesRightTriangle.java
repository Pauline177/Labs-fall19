package inheritance;

/**
 * @author paulinemakoma
 * Assignment:A05Interface
 * Date:Nov 16, 2019
 */
public class IsoscelesRightTriangle implements Shape, Printable {
	
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
		hypo = Math.hypot(getLeg(), getLeg());
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

	
	/**
	 *Prints desired design of shape
	 */
	@Override
	public void print() {
		  for (int i = 1; i <= getLeg(); i++) {

	            for (int j = 1; j <= i; j++) {

	                if (i == 1 || i == getLeg()) {
	                    System.out.print("* ");
	                } else if (j == 1 || j == getLeg()) {
	                    System.out.print("* ");
	                } else if (j == i) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }

	            }
	            System.out.println();
	        }
		
	}
	
	/**
	 *returns the perimeter of the element
	 */
	@Override
	public double perimeter() {
		
		return  (getLeg() * 2) + Math.hypot(getLeg(), getLeg());
	}

	/**
	 *returns the area of the element
	 */
	@Override
	public double area() {
		
		return (getLeg() * getLeg()) / 2;
	}
	
}
