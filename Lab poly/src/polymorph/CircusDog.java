package polymorph;

public class CircusDog extends Dog
{
    public CircusDog(String b)
    {
        super(b);
    }

    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
    
    @Override
    public String toString() {
    return super.toString();
    }
}
