package practice;

import java.util.Arrays;

public class ArrayFun {
	public static void main(String[] args) {
		int[] arr1 = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
		int[] arr2 = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(sumOfSpots(arr1, 3, 6));
		System.out.println(sumOfSpots(arr1, 2, 9));
		System.out.println();
		System.out.println(numOccurences(arr1, 4));
		System.out.println(numOccurences(arr1, 9));
		System.out.println(numOccurences(arr1, 7));
		System.out.println();
		int[] newArr1 = removeNum(arr1, 7);
		System.out.println("new array with all 7s removed = " + Arrays.toString(newArr1));
		System.out.println(numOccurences(newArr1, 7));
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(arr2));
		System.out.println(sumOfSpots(arr2, 3, 16));
		System.out.println(sumOfSpots(arr2, 2, 9));
		System.out.println();
		System.out.println(numOccurences(arr2, 0));
		System.out.println(numOccurences(arr2, 3));
		System.out.println(numOccurences(arr2, 7));
		System.out.println();
		int[] newArr2 = removeNum(arr2, 7);
		System.out.println("new array with all 7s removed = " + Arrays.toString(newArr2));
		System.out.println(numOccurences(newArr2, 7));
	}
	
	public static String sumOfSpots(int[] arr, int startIndex, int endIndex) {
		int sum = 0;
		for(int i = startIndex; i <= endIndex; i++) {
			sum += arr[i];
		}
		return "sum of spots " + startIndex + "-" + endIndex + " = " + sum;
	}
	
	public static String numOccurences(int[] arr, int num) {
		int numOfOccurences = 0;
		for(int number : arr) {
			if(number == num)
				numOfOccurences++;
		}
		return "# of " + num + "s = " + numOfOccurences;
	}
	
	public static int[] removeNum(int[] arr, int num) {
		int numOfOccurences = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num)
				numOfOccurences++;
		}
		int[] newArr = new int[arr.length - numOfOccurences];
		int x = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 7) {
				newArr[x] = arr[i];
				x++;
			}
		}
		return newArr;
	}
	}
