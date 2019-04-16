package ch5Labs;

import java.util.Random;

//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//*******************************************************

public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  private static int numAccounts;
  private static int numDeposits;
  private static int totalDepositAmount;
  private static int numWithdrawals;
  private static int totalWithdrawalAmount;
  private Random rand;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
    numAccounts++;
  }
  public Account(double initBal, String owner) {
	  rand = new Random();
	  balance = initBal;
	  name = owner;
	  acctNum = Math.abs(rand.nextLong());
	  numAccounts++;
  }
  public Account(String owner) {
	  rand = new Random();
	  balance = 0;
	  name = owner;
	  acctNum = Math.abs(rand.nextLong());
	  numAccounts++;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount) {
       balance -= amount;
       numWithdrawals++;
       totalWithdrawalAmount += amount;
    }
    else
       System.out.println("Insufficient funds");
  }
  public void withdraw(double amount, double fee) {
	  if (balance >= amount + fee) {
	       balance -= amount + fee;
	       numWithdrawals++;
	       totalWithdrawalAmount += amount + fee;
	  }
	    else
	       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
    numDeposits++;
    totalDepositAmount += amount;
  }
  
  public void transfer(Account acct, double amount) {
	  this.balance -= amount;
	  acct.balance += amount;
  }
  
  public static void transfer(Account acct1, Account acct2, double amount) {
	  acct1.balance -= amount;
	  acct2.balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }
  
  public String getName() {
	  return name;
  }
  
  public long getAcctNumber() {
	  return acctNum;
  }
  
  public static int getNumAccounts() {
	  return numAccounts;
  }
  
  public static int getNumDeposits() {
	  return numDeposits;
  }
  
  public static int getTotalDepositAmount() {
	  return totalDepositAmount;
  }
  
  public static int getNumWithdrawals() {
	  return numWithdrawals;
  }
  
  public static int getTotalWithdrawalAmount() {
	  return totalWithdrawalAmount;
  }
  
  public static void resetNumDeposits() {
	  numDeposits = 0;
  }
  
  public static void resetTotalDepositAmount() {
	  totalDepositAmount = 0;
  }
  
  public static void resetNumWithdrawals() {
	  numWithdrawals = 0;
  }
  
  public static void resetTotalWithdrawalAmount() {
	  totalWithdrawalAmount = 0;
  }
  
  
  public static Account consolidate(Account acct1, Account acct2) {
	  String name;
	  double bal;
	  if(acct1.getName().equals(acct2.getName()) && acct1.getAcctNumber() != acct2.getAcctNumber()) {
		  name = acct1.name;
		  bal = acct1.balance + acct2.balance;
		  acct1.close();
		  acct2.close();
		  return new Account(bal, name);
	  }
	  System.out.println("You can't consolidate these two accounts.");
	  return null;
  }
  
  
  void close() {
	  name = "CLOSED";
	  balance = 0;
	  numAccounts--;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  @Override
  public String toString()
  {
	return "Name: " + name + 
        "\nAccount Number: " + acctNum +
        "\nBalance: " + balance; 
  }
public void printSummary() {
	System.out.println("Name: " + name + 
        "\nAccount Number: " + acctNum +
        "\nBalance: " + balance);
	
}
}