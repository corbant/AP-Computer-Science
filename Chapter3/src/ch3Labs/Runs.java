package ch3Labs;

// ********************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************
public class Runs
{
 public static void main (String[] args)
 {
final int FLIPS = 100; // number of coin flips
int currentRun = 0; // length of the current run of HEADS
int maxRun = 0; // length of the maximum run so far
Coin coin = new Coin();// Create a coin object
// Flip the coin FLIPS times
for (int i = 0; i < FLIPS; i++)
 {
// Flip the coin & print the result
	 coin.flip();
	 System.out.println(coin.toString());
// Update the run information
	 if(coin.isHeads()) {
		 currentRun++;
	 }else {
		 currentRun = 0;
	 }
	 maxRun = currentRun > maxRun? currentRun:maxRun;
 }
System.out.println("The max run is " + maxRun + " heads in a row");
 }
}