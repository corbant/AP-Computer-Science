package ch3Labs;
// ***************************************************************
//   Election.java
//
//   This file contains a program that tallies the results of
//   an election.  It reads in the number of votes for each of
//   two candidates in each of several precincts.  It determines
//   the total number of votes received by each candidate, the
//   percent of votes received by each candidate, the number of 
//   precincts each candidate carries, and the 
//   maximum winning margin in a precinct.
// **************************************************************

import java.util.Scanner;

public class Election
{
    public static void main (String[] args)
    {
	int votesForPolly;  // number of votes for Polly in each precinct
	int votesForErnest; // number of votes for Ernest in each precinct
	int totalPolly;     // running total of votes for Polly
	int totalErnest;    // running total of votes for Ernest
	int precinctsPolly;
	int precinctsErnest;
	int precinctsTied;
	String response = "y";    // answer (y or n) to the "more precincts" question

	Scanner scan = new Scanner(System.in);

	System.out.println ();
	System.out.println ("Election Day Vote Counting Program");
	System.out.println ();

	// Initializations
	totalPolly = 0;
	totalErnest = 0;
	precinctsPolly = 0;
	precinctsErnest = 0;
	precinctsTied = 0;

	// Loop to "process" the votes in each precinct
	do {
		System.out.print("Votes for Polly: ");
		votesForPolly = scan.nextInt();
		System.out.print("Votes for Ernest: ");
		votesForErnest = scan.nextInt();
		totalPolly += votesForPolly;
		totalErnest += votesForErnest;
		precinctsPolly += votesForPolly > votesForErnest? 1:0;
		precinctsErnest += votesForErnest > votesForPolly? 1:0;
		precinctsTied += votesForErnest == votesForPolly? 1:0;
		System.out.print("Is there more precincts to report?(y/n): ");
		response = scan.next();
	}
	while(response.equals("y") || response.equals("Y"));

	// Print out the results
	System.out.println("Number of precincts won by Polly: " + precinctsPolly);
	System.out.println("number of precincts won by Ernest: " + precinctsErnest);
	System.out.println("Number of precincts tied: " + precinctsTied);
	System.out.println("Total votes for Polly: " + totalPolly);
	System.out.println("Total votes for Ernest: " + totalErnest);
	
	scan.close();
    }
}