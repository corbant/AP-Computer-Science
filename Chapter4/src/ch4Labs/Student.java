package ch4Labs;
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data 
	private String name;
	private double test1;
	private double test2;
	
	Scanner scan = new Scanner(System.in);

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
    	name = studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
    	System.out.print("Enter " + name + "'s score for test1: ");
    	test1 = scan.nextDouble();
    	System.out.print("Enter " + name + "'s score for test2: ");
    	test2 = scan.nextDouble();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()
    {
    	double avg = (test1 + test2) / 2;
    	return avg;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public String getName()
    {
    	return name;
    }
    
    public String toString() 
    {
    	return "Name: " + name + "\tTest1: " + test1 + "\tTest2: " + test2;
    }

}