package sorting;

import utils.Utils;

public class SelectionSort {
	
	Utils utils = new Utils();
	
	public int[] sort(int[] arr) {
		
		if(arr.length > 1) {
			for(int k = 0; k < arr.length; k++) {
				int minIndex = k;
				for(int j = k; j < arr.length; j++) {
					if(arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
				utils.performSwap(arr, k, minIndex);
					
			}
		}
		
		return arr;
	}
	
}
