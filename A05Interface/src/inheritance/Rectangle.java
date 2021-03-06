package inheritance;
/**
 * @author paulinemakoma
 * Assignment:A04 Inheritance
 * Date:Nov 16, 2019
 */

public class Rectangle implements Shape, Printable {
	
	/**
	 * 2 private final fields of type int.
	 */
	private final int length, width;
	
	/**
	 * parameterized constructor that initializes both fields
	 * @param l length of a rectangle
	 * @param w width of a rectangle
	 */
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	
	}

	/**
	 * getLength provides getter for field length but no setter
	 * @return length of rectangle
	 */
	public int getLength() {
		return length;
	}

	/**
	 * getwidth provides getter for field width but no setter
	 * @return width of rectangle
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * toString method that produces a result of the form
	 * Rectangle(lengthxwidth) e.g. Rectangle(5x4)
	 */
	@Override
	public String toString(){
		return String.format("Rectangle(%dX%d)", length, width);
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
		
		return (getLength()+ getWidth())*2;
	}

	/**
	 *returns the area of the element
	 */
	@Override
	public double area() {
		
		return getLength()* getWidth();
	}
	
	
}
