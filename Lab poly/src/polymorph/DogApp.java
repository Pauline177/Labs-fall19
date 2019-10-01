package polymorph;

public class DogApp
{
    public static void main(String[] args)
    {
    	
    	
        Dog myDog = new Dog("Greyhound");
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        actAsDog(myCircusDog);
        
        
        System.out.println("--------------------------------");
        System.out.println("Using Array: ");
        
        Dog allDogs[] = new Dog[] {myDog, mySledDog, myCircusDog};
        
        for(Dog d : allDogs) {
        	System.out.println(d.toString());
        	if(d instanceof SledDog) {
        		((SledDog)d).pullSled();
        	}
        	
        	d.communicate();
            d.move();
            System.out.println();
        }
  
        
    }

    private static void actAsDog(Dog d)
    {	System.out.println(d.toString());
        d.communicate();
        d.move();
        
        System.out.println();
     
    }
}
