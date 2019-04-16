package inheritanceLabs;
import java.util.Arrays;
import java.util.Scanner;

public class MultChoice extends TestQuestion {
	
	private String[] answers;

	public MultChoice() {
		super();
	}

	@Override
	protected void readQuestion(Scanner scan) {
		int numAnswers = scan.nextInt();
		answers = new String[numAnswers];
		testQuestion = scan.next();
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return testQuestion + Arrays.toString(answers);
	}

}
