package ch8Labs;
// *******************************************************************
//   DigitPlay.java
// 
//   Finds the number of digits in a positive integer.
// *******************************************************************

import java.util.Scanner;

public class DigitPlay
{

    public static void main (String[] args)
    {
	int num;    //a number
	int check = 7;

	Scanner scan = new Scanner(System.in);

	System.out.println ();
	System.out.print ("Please enter an ID number (positive integer): ");
	num = scan.nextInt ();
  
	if (num <= 0)
	    System.out.println ( num + " isn't positive -- start over!!");
	else 
	    {
		// Call numDigits to find the number of digits in the number
		// Print the number returned from numDigits
		System.out.println ("\nThe number " + num + " contains " +
				    + numDigits(num) + " digits.");
		System.out.println ();
		
		int sum = sumDigits(num);
		if(sum % check == 0)
			System.out.println(num + " --- ok");
		else
			System.out.println(num + " --- error");
	    }
    }

    // -----------------------------------------------------------
    //  Recursively counts the digits in a positive integer 
    // -----------------------------------------------------------
    public static int numDigits(int num)
    {
	if (num < 10)
	    return (1);
	else
	    return (1 + numDigits(num/10));
    }
    
    public static int sumDigits(int num) {
    	int sum = num % 10;
    	if (num < 10)
    	    return (num);
    	else
    	    return (sum + sumDigits(num/10));
        }
    }