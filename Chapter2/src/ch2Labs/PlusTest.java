package ch2Labs;

public class PlusTest
{
 // -------------------------------------------------
 // main prints some expressions using the + operator
 // -------------------------------------------------
 public static void main (String[] args)
 {
 System.out.println ("This is a long string that is the " +
 "concatenation of two shorter strings.");
 System.out.println ("The first computer was invented about " + 55 +
 " years ago.");
 System.out.println ("8 plus 5 is " + 8 + 5);
 System.out.println("If at least one operand is a string the other operand is converted to a string and + is the concatenation operator.");
 System.out.println();
 System.out.println ("8 plus 5 is " + (8 + 5));
 System.out.println("If an expression contains more than one operation expressions inside parentheses are evaluated first. If there ar no parentheses the expression is evaluated left to right.");
 System.out.println();
 System.out.println (8 + 5 + " equals 8 plus 5.");
 System.out.println("If both operands are numbers + is treated as ordinary addition. (NOTE: in the expression a + b the a and b are called the operands.)");
 System.out.println();
 }
}