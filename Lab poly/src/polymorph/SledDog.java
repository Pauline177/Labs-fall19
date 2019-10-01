package polymorph;

public class SledDog extends Dog
{
    public SledDog(String b)
    {
        super(b);
    }

    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
    
    @Override
    public String toString() {
    return super.toString();
    }
}
