package ch3Labs;

import java.util.Scanner;

public class Activities {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp;
		
		System.out.print("Enter the temperature: ");
		temp = scan.nextInt();
		
		System.out.print("You should go ");
		if(temp < 40 && temp >= 25) {
			System.out.print("skiing");
		}
		else if(temp < 60) {
			System.out.print("golf");
		}
		else if(temp < 80) {
			System.out.print("play Tennis");
		}
		else if(temp >= 80 && temp < 95) {
			System.out.print("swimming");
		}
		else {
			System.out.print("visit our shops");
		}
		scan.close();
	}

}
