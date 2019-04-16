package ch6Labs;
import java.util.Arrays;
// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
    	
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of salespeople: ");
	final int SALESPEOPLE = scan.nextInt();
	int[] sales = new int[SALESPEOPLE];
	int sum;


	for (int i=0; i<sales.length; i++)
	    {
		System.out.print("Enter sales for salesperson " + (i+1) + ": ");
		sales[i] = scan.nextInt();
	    }
	
	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	int max = sales[0];
	int salepersonMax = 0;
	int min = sales[0];
	int salepersonMin = 0;
	sum = 0;
	for (int i=0; i<sales.length; i++)
	    {
		System.out.println("     " + (i+1) + "         " + sales[i]);
		sum += sales[i];
		if(sales[i] > max) {
			max = sales[i];
			salepersonMax = i;
		}
		if(sales[i] < min) {
			min = sales[i];
			salepersonMin = i;
		}
	    }

	System.out.println("\nTotal sales: " + sum);
	System.out.println("\nAverage sales: " + sum/SALESPEOPLE);
	System.out.println("\nSalesperson " + salepersonMax + " had the highest sale with $" + max);
	System.out.println("Salesperson " + salepersonMin + " had the lowest sale with $" + min);
	
	System.out.println();
	System.out.print("Enter a value: ");
	int value = scan.nextInt();
	int sumPeople = 0;
	System.out.println("\nSalespeople that exceeded $" + value);
	for(int i=0; i<sales.length; i++) {
		if(sales[i] > value) {
			System.out.println("Salesperson: " + (i+1) +"    Sales: $" + sales[i]);
			sumPeople++;
		}
	}
	System.out.println("\n" + sumPeople + " Salespeople exceeded " + value);
    }
}