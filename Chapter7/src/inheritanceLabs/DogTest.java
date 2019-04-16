package inheritanceLabs;
// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
	Labrador lab = new Labrador("lab", "brown");
	System.out.println(lab.getName() + " says " + lab.speak() + ". average breed weight " + lab.avgBreedWeight());
	
	Yorkshire york = new Yorkshire("york");
	System.out.println(york.getName() + " says " + york.speak() + ". average breed weight " + york.avgBreedWeight());

    }
}