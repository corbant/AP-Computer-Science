package ch4Labs;

import java.util.Random;

public class PairOfDice {
	private Dice dice1;
	private Dice dice2;
	private int value1;
	private int value2;
	static private Random random;
	public PairOfDice() {
		dice1 = new Dice();
		dice2 = new Dice();
		random = new Random();
		this.roll();
	}
	
	public void roll() {
		value1 = dice1.roll();
		value2 = dice2.roll();
	}
	
	public int getFaceOfDice1() {
		return value1;
	}
	
	public int getFaceOfDice2() {
		return value2;
	}
	
	public boolean getBoxCar() {
		return value1 == 6 && value2 == 6;
	}

}
