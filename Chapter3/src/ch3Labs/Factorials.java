package ch3Labs;

import java.util.Scanner;
public class Factorials {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int factorial = -1;
		int incrament = 0;
		int answer = 1;
		
		while(factorial < 0) {
		System.out.print("Enter a non-negative integer: ");
		factorial = scan.nextInt();
		if(factorial < 0) {
			System.out.println("A nonnegative number is required.");
		}
		}
		
		while(incrament < factorial) {
			answer *= incrament + 1;
			incrament++;
		}
		answer = factorial <= 0? 1:answer;
		System.out.println(factorial + "! = " + answer);
		scan.close();
	}

}
