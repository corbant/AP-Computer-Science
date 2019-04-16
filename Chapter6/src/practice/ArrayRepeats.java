package practice;

public class ArrayRepeats {
	public static void main(String[] args) {
		int[] array1 = {-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5};
		int[] array2 = {10,9,8,7,6,5,4,3,2,1,-99};
		int[] array3 = {10,20,30,40,50,10,10,40,30,20,10};
		int[] array4 = {32767};
		int[] array5 = {255,255};
		int[] array6 = {9,10,-88,100,-555,1000};
		int[] array7 = {10,10,10,11,456,10,10,2,2,2,2,2,2,2};
		int[] array8 = {-111,1,2,3,9,11,20,30};
		int[] array9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		int[] array10 = {12,12,15,18,21,23,1000};
		int[] array11 = {250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1};
		int[] array12 = {9,10,-8,10000,-5000,1000};
		
		repeats(array1);
		repeats(array2);
		repeats(array3);
		repeats(array4);
		repeats(array5);
		repeats(array6);
		repeats(array7);
		repeats(array8);
		repeats(array9);
		repeats(array10);
		repeats(array11);
		repeats(array12);
	}
	
	public static boolean repeats(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					System.out.println(false);
					return false;
				}
			}
		}
		System.out.println(true);
		return true;
	}

}
