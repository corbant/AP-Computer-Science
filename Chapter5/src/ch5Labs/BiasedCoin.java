package ch5Labs;


public class BiasedCoin extends Coin{
	private double bias;
	
	
	public BiasedCoin() {
		bias = 0.5;
		flip();
	}
	
	public BiasedCoin(double bias) {
		this.bias = bias >= 0 && bias <= 1 ? bias : 0.5;
		flip();
	}
	
	@Override
	public void flip() {
		face = Math.random() < bias? HEADS : TAILS;
	}
	
	@Override
	public boolean isHeads() {
		return (face == HEADS);
	}
}