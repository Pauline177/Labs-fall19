package labInterface;

public class Hangglider implements Flyable
{
	private final boolean isRigidWing;

	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}
	
	
	public void launch() {
		System.out.println("Running until take-offf");
	}
	
	public void land() {
		System.out.println("Gliding to a land");
	}
}
