
/* Corban Thompson
* 9.21.18
* examples of classes and objects.
*/


import java.util.*;

import static java.lang.System.out;

import java.text.DecimalFormat;
	
public class ClassObjectPractice {
	
	
	public static void main(String[] args) {
		int classPeriod = 1;
		double grade, gpa, classGPA;
		
		//teacherName is an object of the String Class and has been declared and 
		//instantiated using the keyword new
		String teacherName = new String("Mr. Peck");
		
		String className = "AP Computer Science", studentName;
		
		Random rand = new Random();
		
		Scanner text = new Scanner(System.in);
		Scanner nums = new Scanner(System.in);
		
		//will format the decimals with the format given in the constructor
		//in this case two decimal places
		DecimalFormat gradeFormat = new DecimalFormat("#.##");
		
		//nextInt(4) gives a number between 0 and 3 and +1 shifts to 1 - 5
		classPeriod = rand.nextInt(4) + 1;
		
		out.println("What is your name? ");
		
		studentName = text.nextLine();
		
		out.println("Hello nice to meet you "+studentName+"\nThank your for signing up for "
				+ className + " "+ classPeriod + "st period.\n\nWhat grade are you hoping to get?");
		//used the nums scanner object, the . operator, and the nextDouble() method
		grade = nums.nextDouble();
		
		out.println("What is your current GPA? ");
		gpa = nums.nextDouble();
		
		classGPA = grade/100 * 4;
		
		if(classGPA >= gpa) {
			out.println("You can earn " + gradeFormat.format(grade) + " in AP Computer Science");
		}else {
			out.println("You may struggle to earn " + gradeFormat.format(grade) + " in AP Computer Science");
			double gpaNeeded = Math.min(4.0, classGPA + rand.nextDouble()*2);
			out.println("If you can get your GPA to " + gradeFormat.format(gpaNeeded) + " You will pass the class.");
		}
		
		out.println("\nHow many things are currently connected to the internet of things?" +
		" (Please answer in scienteific notation 1.23x10^3)\n");
		
		String numConnected = text.nextLine();
		
		//goal to convert 1.23x10^3 to 1.23E3 so we can store into double
		
		//Use String methods:
		//substring(int a) - gets string starting at index a to end of string
		//substring(int a, int b) - gets string starting at a up until b
		//indexOf(String x) - give index of the first occurrence of string
		numConnected = numConnected.substring(0, numConnected.indexOf("x")) + "E"
				+ numConnected.substring(numConnected.indexOf("^")+1);
		
		//Used the Double wrapper class static method parseDouble
		//to see if string is a double and return it
		double numIOT = Double.parseDouble(numConnected);
		
		out.println("In how many years will you have a tech job?");
		int years  = nums.nextInt();
		
		out.println("In congruence with Moore's law, when you are in tech there will be:\n"
				+ numIOT*Math.pow(2, years) + " things connected to the internet");
		
		
		text.close();
		nums.close();
	}

}
