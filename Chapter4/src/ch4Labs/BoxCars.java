package ch4Labs;

public class BoxCars {

	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice();
		int numberOfBoxCars = 0;
		
		for(int i = 0; i <= 1000; i++) {
			dice.roll();
			if(dice.getBoxCar())
				numberOfBoxCars++;
		}
		System.out.println("Number of box cars: " + numberOfBoxCars);

	}

}
