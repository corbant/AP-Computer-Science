package ch5Labs;

import java.util.Scanner;

public class TransferTest {
	public static void main(String[] args) {
		Account acct1 = new Account(1000, "Bob");
		Account acct2 = new Account(1000, "Sally");
		
		Scanner scan = new Scanner(System.in);
		String account;
		
		do {
			System.out.print("Transfer from acct1, acct2, or quit (acct1, acct2, quit)? ");
			account = scan.next();
			if(account.equalsIgnoreCase("acct1") || account.equalsIgnoreCase("acct2")) {
				System.out.print("Enter the amount to transfer: ");
				double amount = scan.nextDouble();
				if(account.equalsIgnoreCase("acct1"))
					Account.transfer(acct1, acct2, amount);
				else
					Account.transfer(acct2, acct1, amount);
			}
		}while(!account.equalsIgnoreCase("quit"));
		
		scan.close();
		
		acct1.printSummary();
		acct2.printSummary();
	}

}
