/**
 * 
 */
package module02;

/**
 * @author paulinemakoma
 *
 */
public class Module02App {

	
	public static void main(String[] args) {
		
		DeskPedal deskPedal1 = new DeskPedal("blue");
		System.out.println("DeskPedal1: " + deskPedal1.toString());
		deskPedal1.pedal();

		
		System.out.println();
		DeskPedalPlus deskPedal2 = new DeskPedalPlus("blue", 0);
		System.out.println("DeskPedal2: " + deskPedal2.toString());
		deskPedal2.printReport();
		deskPedal2.pedal();
		deskPedal2.pedal();
		deskPedal2.pedal();
		deskPedal2.pedal();
		System.out.println("DeskPedal2: " + deskPedal2.toString());
		deskPedal2.printReport();
		
		deskPedal2.pedal();
		System.out.println("DeskPedal2: " + deskPedal2.toString());
		deskPedal2.printReport();
		
		deskPedal2.reset();
		System.out.println("DeskPedal2: " + deskPedal2.toString());
		
		
	}

}
