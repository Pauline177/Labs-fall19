
package inheritance;

/**
 * @author paulinemakoma
 * Assignment:A05Interface
 * Date:Nov 21, 2019
 */
public class InterfaceApp {
	public static void main(String [] args) {
	Rectangle myRectangle = new Rectangle(6,3);
	Square mySquare = new Square(5);
	IsoscelesRightTriangle myIsoscelesRightTriangle = 
			new IsoscelesRightTriangle(6);
	Circle myCircle = new Circle(5);
	
	System.out.println(myRectangle.toString());
	System.out.println(mySquare.toString());
	System.out.println(myIsoscelesRightTriangle.toString());
	System.out.println(myCircle.toString());
	
	System.out.printf("Diamter: %d\n", myCircle.diameter(myCircle.getRadius()));
	System.out.printf("Circumference: %.1f\n\n", myCircle.circumference());
	
	System.out.println("Shape Array:");
	System.out.println("--------------");
	
	Shape[] shapes = {mySquare, myRectangle,myIsoscelesRightTriangle, myCircle };
	
	for(Shape s: shapes) {
		System.out.println(s.toString());
		System.out.printf("Perimeter: %.1f\n", s.perimeter());
		System.out.printf("Area: %.1f\n",s.area());
		if(s instanceof Printable) {
			((Printable) s).print();
			System.out.println();
		}
		
		System.out.println();
	}
}
}