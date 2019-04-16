package inheritanceLabs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WriteTest {

	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("testbank.dat"));
		}catch(FileNotFoundException e) {
			System.err.println("File not found. Try again");
			System.exit(1);
		}
		int numTestQuestions = scan.nextInt();
		//TestQuestion[] testQuestions = new TestQuestion[scan.nextInt()];
		
		for(int i = 0; i < numTestQuestions; i++) {
			if(scan.next().charAt(0) == 'e') {
				Essay essayQuestion = new Essay();
				essayQuestion.readQuestion(scan);
			}else {
				MultChoice multChoiceQuestion = new MultChoice();
				multChoiceQuestion.readQuestion(scan);
			}
		}
	}

}
