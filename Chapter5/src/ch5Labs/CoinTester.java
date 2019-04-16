package ch5Labs;

public class CoinTester {

	public static void main(String[] args) {
		int bc1Heads = 0;
		int bc2Heads = 0;
		
		BiasedCoin bc1 = new BiasedCoin();
		BiasedCoin bc2 = new BiasedCoin(0.8);
		
		for(int i = 1; i <= 100; i++) {
			bc1.flip();
			bc2.flip();
			if(bc1.isHeads())
				bc1Heads++;
			if(bc2.isHeads())
				bc2Heads++;
		}
		System.out.println("Number of heads by coin 1: " + bc1Heads);
		System.out.println("Number of heads by coin 2: " + bc2Heads);
	}

}
