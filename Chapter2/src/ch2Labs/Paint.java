package ch2Labs;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Paint {
	public static void main(String[] args)     {
		final int COVERAGE = 350;  //paint covers 350 sq ft/gal
		final int DOOR = 20;
		final int WINDOW = 15;
		int numOfDoors, numOfWindows;
		int length, width, height; //declare integers length, width, and height;         
		double totalSqFt; //declare double totalSqFt;         
		double paintNeeded; //declare double paintNeeded;         
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);//declare and initialize Scanner object  
		
		//Prompt for and read in the length of the room
		System.out.println("What is the length of the room in ft? ");
		length = scan.nextInt();         
		
		//Prompt for and read in the width of the room
		System.out.println("What is the width of the room in ft? ");
		width = scan.nextInt();
		
		//Prompt for and read in the height of the room
		System.out.println("What is the height of the room in ft? ");
		height = scan.nextInt();
		
		System.out.println("How many doors does the room have? ");
		numOfDoors = scan.nextInt();
		
		System.out.println("How many windows does the room have? ");
		numOfWindows = scan.nextInt();
		
		//Compute the total square feet to be painted--think
		//about the dimensions of each wall
		totalSqFt = length*width*2 + length*height*2 + width*height*2 - numOfDoors*DOOR - numOfWindows*WINDOW;
		
		//Compute the amount of paint needed
		paintNeeded = totalSqFt/COVERAGE;
		
		//Print the length, width, and height of the room and the         
		//number of gallons of paint needed.
		System.out.println("Length: " + length + "\tWidth: " + width + "\tHeight: " + height + "\nPaint Needed: " + decimalFormat.format(paintNeeded) + " gal");
	}
}