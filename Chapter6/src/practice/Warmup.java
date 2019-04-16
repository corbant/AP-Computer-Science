package practice;

import java.util.Arrays;

import sorting.ArraySort;
public class Warmup {
	public static void main(String[] args) {
		
		
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i*7;
		}
		
		
		String[] words = {"Hello", "world", "it", "is", "great", "to", "be", "back"};
		
		double[] doubNums = new double[99];
		for(int i = 0; i < doubNums.length; i++) {
			doubNums[i] = i+1;
		}
		for(double num : doubNums) {
			if(num % 3 == 0)
				System.out.print(num);
		}
		
		
		int count = 0;
		for(double num : doubNums) {
			if(num % 7 == 0)
				count++;
		}
		double[] newDoubNums = new double[doubNums.length - count];
		int x = 0;
		for(double num : doubNums) {
			if(num % 7 != 0) {
				newDoubNums[x] = num;
				x++;
			}
		}
	}

}
