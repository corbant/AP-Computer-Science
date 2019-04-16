package ch4Labs;

import java.util.Random;

public class Dice {
	static private Random random;
	private int value;
	
	public Dice() {
		random = new Random();
		this.roll();
	}
	
	public int roll() {
		value = random.nextInt(6) + 1;
		return value;
	}
	
	public int getFaceValue() {
		return value;
	}

}
