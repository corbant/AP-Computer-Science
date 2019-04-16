package ch4Labs;

import java.util.Scanner;
public class WeeklyBandBooster {

	public static void main(String[] args) {
		BandBooster booster1 = new BandBooster("Joe");
		BandBooster booster2 = new BandBooster("Sally");
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i <3; i++) {
		System.out.print("Enter the number of boxes sold by " + booster1.getName() + " this week: ");
		booster1.updateSales(scan.nextInt());
		
		System.out.print("Enter the number of boxes sold by " + booster2.getName() + " this week: ");
		booster2.updateSales(scan.nextInt());
		}
		System.out.println(booster1);
		System.out.println(booster2);
		
		scan.close();
	}

}
