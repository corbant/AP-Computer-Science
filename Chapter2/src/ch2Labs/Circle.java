package ch2Labs;

import java.util.Scanner;

public class Circle
{
 public static void main(String[] args)
 {
 Scanner scan = new Scanner(System.in);
 final double PI = Math.PI;

 int radius;
 System.out.println("Please enter a value for the radius.");
 radius = scan.nextInt();
 double area1 = PI * radius * radius;
 double circumference1 = (PI * radius) * 2;
 System.out.println("The area of a circle with radius " + radius +
 " is " + area1 +". The circumference of the circle is " + circumference1 + ".");
 radius *= 2;
 double area2 = PI * radius * radius;
 double circumference2 = (PI * radius) * 2;
 System.out.println("The area of a circle with radius " + radius +
 " is " + area2 +". The circumference of the circle is " + circumference2 + ".");
 double areaDifference = area2/area1;
 double circumferenceDifference = circumference1/circumference2;
 System.out.println("The area changed by " + areaDifference + ", and the circumference changed by " + circumferenceDifference);
 }
} 