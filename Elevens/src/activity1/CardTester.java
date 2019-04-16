package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card[] cards = {new Card("Ace", "Hearts", 1), new Card("Five", "Diamonds", 5), new Card("King", "Spades", 12)};
		
		for(Card card : cards) {
			System.out.println(card);
		}
	}
}
