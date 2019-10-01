
package module02;

/**
 * @author paulinemakoma
 * Assignment Module02
 * Date 09/25/2019 
 *
 */

public  class DeskPedal {

	private String color;
	/**
	 * @param c color of deskpedal;
	 */
	public DeskPedal(String c) {
		this.color = c;
	}
	
	public String getColor() {
		return color;
	}
	
	public  void pedal() {
		System.out.println("pedaling..");
	}
	

	public String toString() {
		return color + " " + this.getClass().getSimpleName() ;
	}
}
