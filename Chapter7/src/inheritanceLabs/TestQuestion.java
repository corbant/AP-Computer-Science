package inheritanceLabs;

import java.util.Scanner;

public abstract class TestQuestion {
	protected String testQuestion;
	protected Scanner scan;
	
	public TestQuestion() {
		
	}

	protected abstract void readQuestion(Scanner scan);

}
