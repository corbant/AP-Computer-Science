package ch4Labs;

import java.util.Scanner;

public class FractionCalculator {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//fraction 1
		System.out.print("Enter a numerator: ");
		int numer1 = scan.nextInt();
		System.out.print("Enter a denomenator: ");
		int denom1 = scan.nextInt();
		
		Rational rational1 = new Rational(numer1, denom1);
		
		//operator
		System.out.print("Enter a operator (*/+-): ");
		char operator = scan.next().charAt(0);
		if(operator == '*' || operator == '/' || operator == '+' || operator == '-') {}
		else {
			System.err.println("You did not enter a valid operator");System.exit(-1);}
		//fraction 2
		System.out.print("Enter a numerator: ");
		int numer2 = scan.nextInt();
		System.out.print("Enter a denomenator: ");
		int denom2 = scan.nextInt();
		
		Rational rational2 = new Rational(numer2, denom2);
		
		Rational answer;
		
		switch(operator) {
		case '*': answer = rational1.multiply(rational2);break;
		case '/': answer = rational1.divide(rational2);break;
		case '+': answer = rational1.add(rational2);break;
		case '-': answer = rational1.subtract(rational2);break;
		default: answer = null;
		}
		
		System.out.println(rational1+" "+operator+" "+rational2+" = "+answer);
		
	}

}
