//Class is a blueprint for an object and holds our programs
public class practice {
	
	//The main method is the starting point for our programs
	public static void main(String[] args) {
		
		/*Declaring variables is to state their type and name ex// int age;
		 * this means that memory space has been set up
		 * Initializing a variable is giving a starting value, placing a value in memory location
		 */
		int age = 500;
		double length = 23.1;
		
		//A string is an object which means that there is only a pointer in memory
		String name = "Corban";
		
		//the + when used with strings is called concatenation
		System.out.println("My name is " + name + " and my age is " + age);
		
		//the + when used with numbers is addition and the = means is assigned
		length = length + age;
		System.out.println("length is now: " + length);
		
		//Syntax or compiler errors means I did not follow the rules of java so program wont run

	}

}
