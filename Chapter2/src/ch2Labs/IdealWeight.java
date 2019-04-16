package ch2Labs;

import java.util.Scanner;

public class IdealWeight {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Get height
		System.out.println("Please enter your height.");
		System.out.print("Feet: ");
		int feet = scan.nextInt();
		System.out.print("Inches: ");
		int inches = scan.nextInt();
		scan.close();
		//Calculate ideal weight
		int totalInches = (feet*12) + inches;
		int idealWeightFemale = 100 + (totalInches - 60) * 5;
		int idealWeightMale = 106 + (totalInches - 60) * 6;
		//Print values
		System.out.println("These are the ideal weight ranges for your height:");
		System.out.println("Male: " + (int)(idealWeightMale * 0.85) + "-" + (int)(idealWeightMale * 1.15) + " lbs");
		System.out.println("Female: " + (int)(idealWeightFemale * 0.85) + "-" + (int)(idealWeightFemale * 1.15) + " lbs");
	}

}
