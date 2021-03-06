package inheritance;
/**
 * @author paulinemakoma
 * Assignment:A04 Inheritance
 * Date:Nov 16, 2019
 */
public class Square extends Rectangle implements Shape, Printable {
	
	/**
	 * parameterized constructor with only one parameter
	 * The parameter is used to initialize both fields of Rectangle
	 * @param a
	 */
	public Square(int a) {
		super(a,a);

	}
	
	/**
	 * getSide expose the side-length of the square
	 * @return length
	 */
	public int getSide() {
		return super.getLength();
	}
	
	/**
	 * method that return a String of the following 
	 * form: Square(side) e.g. Square(4) 
	 */
	@Override
	public String toString() {
		return String.format("Square(%d)", getLength());
	}
	
	/**
	 *Prints desired design of shape
	 */
	@Override
	public void print() {
		for (int i = 0; i < getWidth(); i++) {
            System.out.print("* ");
            for (int j = 0; j < getLength() - 2; j++) {
                if (i == 0 || i == getWidth() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("* ");
            System.out.println();
	}
	}
	
	/**
	 *returns the perimeter of the element
	 */
	@Override
	public double perimeter() {
		
		return getLength() * 4;
	}

	/**
	 *returns the area of the element
	 */
	@Override
	public double area() {
		
		return getLength()* getWidth();
	}
	
}
