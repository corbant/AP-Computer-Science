package practice;

import java.util.Arrays;

public class ArrayOdd {

	public static void main(String[] args) {
		int[] array1 = {2, 4, 6, 8, 10, 12, 14};
		int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9};
		int[] array3 = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
		
		oddNums(array1);
		evenNums(array1);
		System.out.println();
		oddNums(array2);
		evenNums(array2);
		System.out.println();
		oddNums(array3);
		evenNums(array3);
	}
	
	public static void oddNums(int[] arr) {
		int oddCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				oddCount++;
			}
		}
		int[] newArr = new int[oddCount];
		int x = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				newArr[x] = arr[i];
				x++;
			}
		}
		System.out.println("Odds - " + Arrays.toString(newArr));
	}
	
	public static void evenNums(int[] arr) {
		int oddCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				oddCount++;
			}
		}
		int[] newArr = new int[oddCount];
		int x = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				newArr[x] = arr[i];
				x++;
			}
		}
		System.out.println("Evens - " + Arrays.toString(newArr));
	}

}
