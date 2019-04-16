package ch8Labs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String word = scan.next();
		
		if(palindrome(word))
			System.out.println(word + " is a palindrome");
		else
			System.out.println(word + " is not a palindrome");
	}
	
	public static boolean palindrome(String s) {
		if(s.length() < 2)
			return true;
		else if(s.charAt(0) != s.charAt(s.length() - 1))
			return false;
		else
			return palindrome(s.substring(1, s.length()-1));
	}

}
