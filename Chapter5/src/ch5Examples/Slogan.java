package ch5Examples;
//********************************************************************
//  Slogan.java       Author: Lewis/Loftus/Cocking
//
//  Represents a single slogan string.
//********************************************************************

public class Slogan implements Complexity, Comparable<Slogan>, Format
{
   private String phrase;
   private static int count = 0;
   private int complexityLevel;

   //-----------------------------------------------------------------
   //  Sets up the slogan and counts the number of instances created.
   //-----------------------------------------------------------------
   public Slogan (String str)
   {
      phrase = str;
      count++;
   }

   //-----------------------------------------------------------------
   //  Returns this slogan as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return phrase;
   }

   //-----------------------------------------------------------------
   //  Returns the number of instances of this class that have been
   //  created.
   //-----------------------------------------------------------------
   public static int getCount ()
   {
      return count;
   }

@Override
public String toUpperCase() {
	return phrase.toUpperCase();
}

@Override
public String toLowerCase() {
	return phrase.toLowerCase();
}

@Override
public int compareTo(Slogan o) {
	return phrase.compareTo(o.toString());
}

@Override
public void setComplexity(int complexity) {
	complexityLevel = complexity;
}

@Override
public int getComplexity() {
	return complexityLevel;
}
}
