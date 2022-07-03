package algorithmpractice;

import java.util.Arrays;

/*
 * Simplest sorting algorithm
 * 
 * 	 Best: O(N)
 *  Worst: O(N^2)
 *    Avg: O(N^2)
 *  Space: O(1)  
 *  
 *  Repeatedly swaps adjacent elements if they are in the wrong order. Not suitable for large datasets
 */

public class BubbleSort {
	
	public int[] sort(int[] arr) {
		if(arr.length > 1) {
			for(int k = 0; k < arr.length; k++) {
				for(int j = 1; j < arr.length; j++) {
					this.logCurrentArrayState(arr, j-1, j);
					if(arr[j-1] > arr[j]) {
						arr = this.performSwap(arr, j-1, j);
					}
				}
			}
		}
		
		return arr;
	}
	
	private int[] performSwap(int[] arr, int prev, int j) {
		int temp = arr[prev];
		
		arr[prev] = arr[j];
		arr[j] = temp;
		
		return arr;
	}
	
	private void logCurrentArrayState(int[] arr, int prev, int j) {
		String currentArray = Arrays.toString(arr);
		System.out.println("-----------------------------------");
		System.out.println("prev: " + prev + ",j: " + j);
		System.out.println(currentArray);
	}
	
}
