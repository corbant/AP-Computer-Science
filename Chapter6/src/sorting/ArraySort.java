package sorting;

public final class ArraySort {
	
	
	/**
	 * Best: n
	 * <br>Average: n^2
	 * <br>Worst: n^2
	 * <br>Memory: 1
	 * <br>Stable: Yes
	 * <br>Method: Exchanging
	 * 
	 * <br><br>Bubble Sort is the simplest sorting algorithm
	 * that works by repeatedly swapping the adjacent
	 * elements if they are in wrong order.
	 * @param arr Array to sort
	 */
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * Best: n
	 * <br>Average: n^2
	 * <br>Worst: n^2
	 * <br>Memory: 1
	 * <br>Stable: Yes
	 * <br>Method: Insertion
	 * 
	 * <br><br>Insertion sort is a simple sorting algorithm
	 * that works the way we sort playing cards in our hands.
	 * @param arr Array to sort
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            T key = arr[i]; 
            int j = i-1;
            while (j>=0 && arr[j].compareTo(key) > 0) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
	}
	
	
	/**
	 * Best: n^2
	 * <br>Average: n^2
	 * <br>Worst: n^2
	 * <br>Memory: 1
	 * <br>Stable: No
	 * <br>Method: Selection
	 * 
	 * <br><br>The selection sort algorithm sorts an array by repeatedly
	 * finding the minimum element (considering ascending order) from
	 * unsorted part and putting it at the beginning. The algorithm maintains
	 * two subarrays in a given array.
	 * 
	 * @param arr Array to sort
	 */
	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j].compareTo(arr[min_idx]) < 0) 
                    min_idx = j; 
            
            T temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
	}

}
