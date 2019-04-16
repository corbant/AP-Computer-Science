package ch2Labs;

import java.util.InputMismatchException;
import java.util.Scanner; 
public class BaseConvert 
{ 
   public static void main (String[] args) 
   { 
      int base;        // the new base 
      int base10Num;   // the number in base 10 
                       // in 4 digits in the new base 
      String letter;
      int remainder;
      String remainderS;
      String place = "";
      String letters = "          abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWKYZ";
      Scanner scan = new Scanner(System.in);
      // read in the base 10 number and the base 
      System.out.println(); 
      System.out.println ("Base Conversion Program"); 
      System.out.println(); 
      
      System.out.print ("Please enter a base 10 number to convert: "); 
      try{
    	  base10Num = scan.nextInt(); 
      }catch(InputMismatchException ime) {
    	  System.out.println("Please restart and enter a value within range of a integer; " + ime);
    	  scan.close();
    	  return;
      }
      
      System.out.print ("Please enter a base: "); 
      base = scan.nextInt(); 
      
      // Do the conversion (see notes in lab) 
      // Print the result (see notes in lab) 
      
      
      while(base10Num>0) {
      // First compute place0 -- the units place.  Remember this comes     
      // from the first division so it is the remainder when the     
      // base 10 number is divided by the base (HINT %).
      remainder = base10Num%base;
      if (remainder>9) {
    	  letter = Character.toString(letters.charAt(remainder));
    	  place = place + letter;
      }else {
    	  remainderS = Integer.toString(remainder);
    	  place = place + remainderS;
      }
      
      // Then compute the quotient (integer division / will do it!) -     
      // You can either store the result back in base10Num or declare a     
      // new variable for the quotient     
      base10Num = base10Num/base;
      // Now compute place1 -- this is the remainder when the quotient     
      // from the preceding step is divided by the base.       
      // Then compute the new quotient
      } 
      int length = place.length();
      for(int x = length-1; x >= 0; x--) {
    	  System.out.print(place.charAt(x));
      }
      scan.close();
   }
}

