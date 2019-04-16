package ch6Labs;

import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		int[] arr;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = scan.nextInt();
		arr = new int[num];
		System.out.print("Enter " + num + " integer values: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<(arr.length/2); i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
