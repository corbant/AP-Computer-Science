package ch4Labs;

public class Card {
	public final static int ACE = 1;
	public final static int TWO = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int TEN = 10;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
	
	public final static int CLUBS = 1;
	public final static int DIAMONDS = 2;
	public final static int HEARTS = 3;
	public final static int SPADES = 4;
	
	private final static int NUM_FACES = 13;
	private final static int NUM_SUITS = 4;
	
	private int face, suit;
	private String faceName, suitName;
	
	public Card() {
		face = (int) (Math.random()*NUM_FACES) + 1;
		setFaceName();
		suit = (int) (Math.random()*NUM_SUITS) + 1;
		setSuitName();
	}
	
	public Card(int faceValue, int suitValue) {
		face = faceValue;
		setFaceName();
		suit = suitValue;
		setSuitName();
	}
	
	private void setFaceName() {
		switch (face) {
		case ACE: faceName = "Ace"; break;
		case TWO: faceName = "Two"; break;
		case THREE: faceName = "Three"; break;
		case FOUR: faceName = "Four"; break;
		case FIVE: faceName = "Five"; break;
		case SIX: faceName = "Six"; break;
		case SEVEN: faceName = "Seven"; break;
		case EIGHT: faceName = "Eight"; break;
		case NINE: faceName = "Nine"; break;
		case TEN: faceName = "Ten"; break;
		case JACK: faceName = "Jack"; break;
		case QUEEN: faceName = "Queen"; break;
		case KING: faceName = "King"; break;
		}
	}
		
	private void setSuitName() {
		switch (suit) {
		case CLUBS: suitName = "Clubs"; break;
		case DIAMONDS: suitName = "Diamonds"; break;
		case HEARTS: suitName = "Hearts"; break;
		case SPADES: suitName = "Spades"; break;
		}
	}
	
	public int getFace() {
		return face;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public boolean isHigherThan(Card card, boolean aceHigh) {
		boolean result;
		if(face == card.getFace()) {
			result = suit > card.getSuit();
		}
		else {
			if(aceHigh && face == ACE)
				result = true;
			else {
				if(face > card.getFace())
					result = true;
				else 
					result = false;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return faceName + " of " + suitName;
	}
}
