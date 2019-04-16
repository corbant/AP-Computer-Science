package ch3Labs;
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
      int numToGuess;       //Number the user tries to guess
      int guess;            //The user's guess
      int timesGuessed = 1;
      int guessesHigh = 0;
      int guessesLow = 0;

	Scanner scan = new Scanner(System.in);
	Random generator = new Random();

	//randomly generate the  number to guess
	numToGuess = generator.nextInt(10) + 1;

	//print message asking user to enter a guess
	System.out.print("Guess a number between 1 and 10: ");

	//read in guess
	guess = scan.nextInt();
                
	while (guess != numToGuess) {  //keep going as long as the guess is wrong
	
	    //print message saying guess is wrong
		if(guess<numToGuess) {
			System.out.println("Your guess is too low");
			guessesLow++;
		}else {
			System.out.println("Your guess is too high");
			guessesHigh++;
		}
	    //get another guess from the user
		System.out.print("Guess another number between 1 and 10: ");
		guess = scan.nextInt();
		timesGuessed++;
	}

	//print message saying guess is right
	System.out.println("Congratulations, your guess is correct!  It took " + timesGuessed + " guesses to guess the number");
	System.out.println("You had " + guessesHigh + " guesses too high and " + guessesLow + " to low.");
    
    scan.close();
    }
}
