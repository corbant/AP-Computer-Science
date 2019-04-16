package ch3Labs;

//****************************************************************
//Dates.java
//
//Determine whether a 2nd-millenium date entered by the user
//is valid
//****************************************************************


import java.util.Scanner;

public class Dates
{
 public static void main(String[] args) {
 
	 int month, day, year; //date read in from user
	 int daysInMonth; //number of days in month read in
	 boolean monthValid, yearValid, dayValid; //true if input from user is valid
	 boolean leapYear; //true if user's year is a leap year
	 Scanner scan = new Scanner(System.in);
	 //Get integer month, day, and year from user
	 System.out.print("Please enter the month, day, and year (ex: 3 30 2005): ");
	 month = scan.nextInt();
	 day = scan.nextInt();
	 year = scan.nextInt();
	 //Check to see if month is valid
	 monthValid = month>=1 && month<=12? true:false;
	 //Check to see if year is valid
	 yearValid = year>=0 && year<=2018? true:false;
	 //Determine whether it's a leap year
	 leapYear = year%400 == 0 || year%4 == 0 && year%100 != 0? true:false;
	 //Determine number of days in month
	 if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
		 daysInMonth = 31;
	 }
	 else if(month == 4 || month == 6 || month == 9 || month == 11) {
		 daysInMonth = 30;
	 }
	 else if(month == 2 && leapYear == false) {
		 daysInMonth = 28;
	 }
	 else if(month == 2 && leapYear == true) {
		 daysInMonth = 29;
	 }
	 else {
		 daysInMonth = 0;
	 }
	 //User number of days in month to check to see if day is valid
	 if(day <= daysInMonth) {
		 dayValid = true;
	 }else {
		 dayValid = false;
	 }
	 //Determine whether date is valid and print appropriate message
	 System.out.print("Date is ");
	 if(yearValid == true && monthValid == true && dayValid == true) {
		 System.out.println("valid");
		 if(leapYear == true) {
			 System.out.print("This year is a leap year");
		 }else {
			 System.out.print("This year is not a leap year");
		 }
	 }
	 else {
		 System.out.println("not valid");
	 }
	 scan.close();
 }
}