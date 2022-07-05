package sorting;

import utils.Utils;

public class InsertionSort {

	Utils utils = new Utils();
	
	public int[] sort(int[] arr) {
		
		if(arr.length > 1) {
			for(int k = 0; k < arr.length; k++) {
				int j = k;
				while(j > 0 && arr[j] < arr[j-1]) {
					utils.performSwap(arr, j, j-1);
					j--;
				}
			}
		}
		
		return arr;
	}
}
