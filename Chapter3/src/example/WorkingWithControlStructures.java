package example;

import java.util.Scanner;

public class WorkingWithControlStructures {

	public static void main(String[] args) {
		
		int numberInput;
		Scanner nums = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		numberInput = nums.nextInt();
		
		if(numberInput%2 == 0) {
			System.out.println(numberInput + " is even");
		}
		else {
			System.out.println(numberInput + " is odd");
		}
		
		System.out.print("Please enter your grade percent in this class: ");
		double gradePercent = nums.nextDouble();
		
		System.out.print(gradePercent + " will give you an ");
		if(gradePercent <= 100 && gradePercent >= 90 ) {
			System.out.println("A");
		}else if(gradePercent >= 80) {
			System.out.println("B");
		}else if(gradePercent >= 70) {
			System.out.println("C");
		}else if(gradePercent >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
