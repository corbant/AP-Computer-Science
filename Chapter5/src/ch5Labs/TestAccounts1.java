package ch5Labs;
//***********************************************************
// TestAccounts1.java
// A simple program to test the numAccts method of the 
// Account class.  
//***********************************************************
import java.util.Scanner;

public class TestAccounts1
{
    public static void main(String[] args)
    {

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a name: ");
	Account acct1 = new Account(100, scan.next());
	System.out.println("\nCreated account " + acct1);
	System.out.println("Now there are " + Account.getNumAccounts() + 
				" accounts");
	
	System.out.println("Enter a name: ");
	Account acct2 = new Account(100, scan.next());
	System.out.println("\nCreated account " + acct2);
	System.out.println("Now there are " + Account.getNumAccounts() + 
				" accounts");
	
	System.out.println("Enter a name: ");
	Account acct3 = new Account(100, scan.next());
	System.out.println("\nCreated account " + acct3);
	System.out.println("Now there are " + Account.getNumAccounts() + 
				" accounts");
	
	
	acct1.close();
	Account acct4 = Account.consolidate(acct2, acct3);
	
	System.out.println(acct1);
	System.out.println(acct2);
	System.out.println(acct3);
	System.out.println(acct4);
	
	scan.close();
    }
}