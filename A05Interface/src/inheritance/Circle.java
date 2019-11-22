package inheritance;

/**
 * @author paulinemakoma
 * Assignment:A05Interface
 * Date:Nov 16, 2019
 */
public class Circle implements Shape {
	
	/**
	 *  1 private final field of type int
	 */
	private final int radius;
	
	/**
	 *  parameterized constructor that initializes the field
	 *  created above
	 * @param r
	 */
	public Circle(int r) {
		super();
		this.radius = r;
	}
	
	/**
	 * gives diameter of circle by multiplying radius by 2
	 * @param radius
	 * @return diameter
	 */
	public int diameter(int radius) {
		return radius*2;
	}
	
	
	/**
	 * gives circumference of circle by multiplting pi by diamter
	 * @return circumference 
	 */
	public double circumference() {
		return diameter(radius)*Math.PI;
	}
	
	/**
	 * provides a getter for the field radius but no setter
	 * @return radius
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * method gives a String of the following form:
	 * Circle(radius) e.g. Circle(3)
	 */
	public String toString() {
		return String.format("Circle(%d)", radius);
	}

	
	/**
	 *returns the perimeter of the element
	 */
	@Override
	public double perimeter() {	
		return getRadius()*2*Math.PI;
	}

	
	/**
	 *returns the area of the element
	 */
	@Override
	public double area() {
		return getRadius()*getRadius()*Math.PI;
	}
	
}
