package module02;

public class DeskPedalPlus extends DeskPedal {

	private int time;
	/**
	 * 
	 * @param c color of deskpadal
	 * @param t time time deskpedal run
	 */
	public DeskPedalPlus(String c, int t) {
		super(c);
		this.time = t;
	}
	
	@Override
	public void pedal() {
		System.out.println("pedaling..");
		time = time + 15;
//		System.out.println(time);
	}
	
	public void reset() {
		time = 0;
	}
	
	
	public void printReport() {
		
		int remainder = time % 60;
		int hours = time / 60;
		
		
		
		if(remainder == 0) {
			
			System.out.println("Total time pedaled: " + hours + "'");
		}
		else if(time > 60) {
	
			System.out.println("Total time pedaled: " + hours+ "' " + remainder +"''");
			
		}
		else
			System.out.println("Total time pedaled: " + hours+ "' " + remainder +"''");
	}
	
	
	@Override
	public String toString() {
		

		return getColor() + " " + this.getClass().getSimpleName() + " " + time+ " " + "min";
		
	}
}

