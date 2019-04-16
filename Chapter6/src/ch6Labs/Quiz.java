package ch6Labs;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		int numQuestion = 0;
		int[] answerKey;
		int correct = 0;
		char another;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the number of questions in the quiz: ");
			numQuestion = scan.nextInt();
			answerKey = new int[numQuestion];
			System.out.print("Enter the answer key: ");
			for(int i=0; i<numQuestion; i++) {
				answerKey[i] = scan.nextInt();
			}
			System.out.print("Enter the answers to the quiz to be graded: ");
			for(int i=0; i<numQuestion; i++) {
				if(scan.nextInt() == answerKey[i])
					correct++;
			}
			System.out.println("Num correct: " + correct + "\tPercent: " + (float) correct/numQuestion*100 + "%");
			System.out.print("Grade another quiz? (y/n): ");
			another = scan.next().charAt(0);
		}while(another == 'y');
	}

}
