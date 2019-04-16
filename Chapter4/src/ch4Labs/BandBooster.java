package ch4Labs;

public class BandBooster {
	private String name;
	private int boxesSold;
	
	public BandBooster(String bandBoosterName) {
		name = bandBoosterName;
		boxesSold = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void updateSales(int addBoxesSold) {
		boxesSold += addBoxesSold;
	}
	
	public String toString() {
		return name + ": " + boxesSold + " boxes";
	}

}
