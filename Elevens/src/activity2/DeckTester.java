package activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d1 = new Deck(ranks, suits, pointValues);
		
		System.out.println(d1.deal());
		
		System.out.println(d1.isEmpty());
		
		System.out.println(d1);
	}
}
