package ch3Labs;

import java.text.NumberFormat;
import java.util.Scanner;

public class AccountCharge {
	public static void main(String[] args) {
		double previousBalance;
		double additionalCharges;
		double newBalance;
		double interest;
		double minimumPayment;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your previous balance on account: ");
		previousBalance = scan.nextDouble();
		System.out.print("Enter your total amount of additional charges during this month: ");
		additionalCharges = scan.nextDouble();
		//new balance
		//Interest
		if(previousBalance <= 0) {
			interest = 0;
		}
		else {
			interest = (previousBalance + additionalCharges) * 0.02;
		}
		newBalance = previousBalance + additionalCharges + interest;
		//minimum payment
		if(newBalance < 50) {
			minimumPayment = newBalance;
		}
		else if(newBalance >= 50 && newBalance <= 300) {
			minimumPayment = 50;
		}
		else {
			minimumPayment = newBalance * 0.20;
		}
		//print
		System.out.println("CS CARD International Statement");
		System.out.println("===============================");
		System.out.println("\nPrevious Balance:\t" + money.format(previousBalance));
		System.out.println("Additional Charges:\t" + money.format(additionalCharges));
		System.out.println("Interest:\t\t" + money.format(interest));
		System.out.println("\nNew Balance:\t\t" + money.format(newBalance));
		System.out.println("\nMinimum Payment:\t" + money.format(minimumPayment));
		
		scan.close();
	}

}
