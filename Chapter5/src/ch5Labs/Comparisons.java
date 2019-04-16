package ch5Labs;

import java.util.Scanner;

public class Comparisons {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String s1 = scan.next();
		System.out.print("Enter String 2: ");
		String s2 = scan.next();
		System.out.print("Enter String 3: ");
		String s3 = scan.next();
		System.out.println(Compare3.largest(s1, s2, s3));
		
		System.out.print("Enter Integer 1: ");
		int i1 = scan.nextInt();
		System.out.print("Enter Integer 2: ");
		int i2 = scan.nextInt();
		System.out.print("Enter Integer 3: ");
		int i3 = scan.nextInt();
		System.out.println(Compare3.largest(i1, i2, i3));
		
		
	}

}
