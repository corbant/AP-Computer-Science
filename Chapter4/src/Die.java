
import java.util.Random;

public class Die {
	
	private int[] winNums;
	private int numFaces;
	private int dieFace;
	private Random rand;
	
	public Die(int numFaces) {
		rand = new Random();
		this.numFaces = numFaces;
		winNums = new int[2];
		winNums[0] = (int) 7*(numFaces/6);
		winNums[1] = (int) 11*(numFaces/6);
		roll();
	}
	
	/**
	 * Rolls the dice
	 */
	public void roll() {
		dieFace = rand.nextInt(numFaces) + 1;
	}
	
	public int getDieFace() {
		return dieFace;
	}
	
	public boolean getWin(Die other) {
		return this.getDieFace() + other.getDieFace() == winNums[0] || this.getDieFace() + other.getDieFace() == winNums[1];
	}
	
	public int getNumFaces() {
		return numFaces;
	}

}
