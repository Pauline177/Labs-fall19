package inheritance;
/**
 * @author paulinemakoma
 * Assignment:A05 Interface
 * Date:Nov 20, 2019
 */
public class InterfaceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(6,3);
		Square mySquare = new Square(5);
		IsoscelesRightTriangle myIsoscelesRightTriangle = 
				new IsoscelesRightTriangle(6);
		Circle myCircle = new Circle(5);
		
		System.out.println(myRectangle.toString());
		System.out.println(mySquare.toString());
		System.out.println(myIsoscelesRightTriangle.toString());
		System.out.println(myCircle.toString());

	}

}
