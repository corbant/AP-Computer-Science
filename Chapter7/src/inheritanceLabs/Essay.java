package inheritanceLabs;

import java.util.Scanner;

public class Essay extends TestQuestion {
	private int blankSpaces;

	public Essay() {
		super();
	}

	@Override
	protected void readQuestion(Scanner scan) {
		blankSpaces = scan.nextInt();
		testQuestion = scan.next();
		System.out.println(this);
		for(int i = 0; i < blankSpaces; i++) {
			scan.nextLine();
		}
	}
	
	
	@Override
	public String toString() {
		return testQuestion;
	}

}
