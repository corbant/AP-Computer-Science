package ch3Labs;
// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
    	int sum = 0;
    Scanner scan = new Scanner(System.in);
	System.out.print("How many times should the message be printed? ");
	int limit = scan.nextInt();

	int count = 1;

	while (count <= limit){
		sum = sum + count;
	    System.out.println(count + " I love Computer Science!!");
	    count++;
	}
	System.out.println("Printed this message " + limit + " times.\tThe sum of the numbers from 1 to " + limit + " is " + sum );
    
    scan.close();
    }
}