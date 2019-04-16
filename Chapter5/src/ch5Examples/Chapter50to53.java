package ch5Examples;

public class Chapter50to53 {
	public static void main(String[] args) {
		Num myNum = new Num(15);
		//if no toString exists then the reference will be printed
		System.out.println(myNum);
		
		//null reference means pointing to nothing
		Num num2;
		/*if(num2 == null)
			System.out.println("initialize num2");
		else
			System.out.println(num2.getValue());*/
		
		//this reference look at equals method in Num
		
		//Aliases
		
		num2 = new Num(16);
		Num num3 = new Num(17);
		
		System.out.println(num2.getValue());
		System.out.println(num3.getValue());
		num2 = num3; //this sets num2 reference same as num3
					// so if you change one you will change the other
		System.out.println(num2.getValue());
		System.out.println(num3.getValue());
		
		num3.setValue(18);
		System.out.println(num2.getValue());
		System.out.println(num3.getValue());
		int a = 3;
		//passing objects as Parameters
		System.out.println("Before: " + myNum+" "+num2+" "+a);
		changer(myNum, num2, a);
		System.out.println("After: " + myNum+" "+num2+" "+a);
		//another example in ParameterTester and ParameterPassing
		
		//Give an example using Num that uses aliases to change both Num objects
		num2 = num3;
	}
	
	public static void changer(Num n1, Num n2, int n3) {
		n1 = new Num(14);
		n2 = n1;
		n3 = 5;
	}
	
		
}
