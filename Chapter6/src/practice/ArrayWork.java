package practice;

import java.util.Arrays;

public class ArrayWork {
	public static void main(String[] args) {
		int[] nums = {3,2,5,1,0,6};
		System.out.print("[");
		for(int spot=0; spot<nums.length - 1; spot++) {
			System.out.print(nums[spot] + ",");
		}
		System.out.print(nums[nums.length-1]);
		System.out.println("]");
		
		for(int item : nums) {
			System.out.println(item);
		}
		
		double[] test = new double[10];
		
		for(int i = 0; i<10; i++) {
			test[i] = i*4;
		}
		
		System.out.println(Arrays.toString(test));
	}
	

}