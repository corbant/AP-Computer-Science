package practice;

public class ArraySmallest {
	public static void main(String[] args) {
		int[] array1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		int[] array2 = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] array3 = {10,20,30,40,50,-11818,40,30,20,10};
		int[] array4 = {32767};
		int[] array5 = {255,255};
		int[] array6 = {9,10,-88,100,-555,1000};
		
		getSmallestValue(array1);
		getSmallestValue(array2);
		getSmallestValue(array3);
		getSmallestValue(array4);
		getSmallestValue(array5);
		getSmallestValue(array6);
	}
	
	public static int getSmallestValue(int[] arr) {
		int smallest = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.println(smallest);
		return smallest;
	}

}
