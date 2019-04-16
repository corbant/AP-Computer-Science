package ch4Labs;

import java.util.Scanner;
public class TestNames {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a first name: ");
		String first1 = scan.next();
		System.out.print("Enter a middle name: ");
		String middle1 = scan.next();
		System.out.print("Enter a last name: ");
		String last1 = scan.next();
		System.out.print("Enter another first name: ");
		String first2 = scan.next();
		System.out.print("Enter another middle name: ");
		String middle2 = scan.next();
		System.out.print("Enter another last name: ");
		String last2 = scan.next();
		
		Name name1 = new Name(first1, middle1, last1);
		Name name2 = new Name(first2, middle2, last2);
		
		System.out.println("Name 1: ");
		System.out.println(name1.firstMiddleLast());
		System.out.println(name1.lastFirstMiddle());
		System.out.println(name1.initials());
		System.out.println(name1.length());
		System.out.println("Name 2: ");
		System.out.println(name2.firstMiddleLast());
		System.out.println(name2.lastFirstMiddle());
		System.out.println(name2.initials());
		System.out.println(name2.length());
		
		if(name1.equals(name2)) {
			System.out.println("They are the same name.");
		}
		else {
			System.out.println("They are not the same name.");
		}
	}

}
