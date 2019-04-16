package ch5Examples;
//********************************************************************
//  Num.java       Author: Lewis/Loftus/Cocking
//
//  Represents a single integer as an object.
//********************************************************************

public class Num implements Comparable
{
   private int value;

   //-----------------------------------------------------------------
   //  Sets up the new Num object, storing an initial value.
   //-----------------------------------------------------------------
   public Num (int update)
   {
      value = update;
   }

   //-----------------------------------------------------------------
   //  Returns the stored integer value.
   //-----------------------------------------------------------------
   public int getValue ()
   {
      return value;
   }

   //-----------------------------------------------------------------
   //  Sets the stored value to the newly specified value.
   //-----------------------------------------------------------------
   public void setValue (int update)
   {
      value = update;
   }
   
   public boolean equals(Num other) {
	   return this.getValue() == other.getValue();
   }

   //-----------------------------------------------------------------
   //  Returns the stored integer value as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return value + "";
   }

@Override
public int compareTo(Object o) {
	return 0;
}
}
