package practice.algorithms;

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

public class BubbleSort{
	
	Utils utils = new Utils();
	
	public int[] sort(int[] arr) {
		if(arr.length > 1) {
			for(int k = 0; k < arr.length; k++) {
				for(int j = 1; j < arr.length; j++) {
					if(arr[j-1] > arr[j]) {
						utils.performSwap(arr, j-1, j);
					}
				}
			}
		}
		return arr;
	}
	
}
