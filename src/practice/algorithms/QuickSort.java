package practice.algorithms;

/*
 * Quickest sorting algorithm
 * 	Drawbacks can occur if not picking a pivot correctly
 * 
 * 	 Best: O(NLog(N))
 *  Worst: O(N^2)
 *    Avg: O(NLog(N)) - atleast using the middle pivot
 *  Space: O(1)  
 *  
 *  Great for large datasets
 *  Basically
 *  	Starts with a full array, with pointers to first/last element
 *  	Selects a pivot in the middle and gets its value
 *  	Partitions an array into 2 pieces around an "index"
 *  		Finds an element on the left thats bigger than the pivot
 *  		Finds an element on the right thats smaller than the pivot
 *  		Swaps them
 */
public class QuickSort {
	Utils utils = new Utils();
	
	public int[] sort(int[] arr) {
		if(arr.length > 1) {
			//Start quicksorting with the full array
			this.quicksort(arr, 0, arr.length-1);
		}
		
		return arr;
	}
	
	private void quicksort(int[] arr, int low, int high) {
		//if our left side marker is larger/equal, we are done
		if(low < high) {
			//pick the middle as the pivot
			int pivot = arr[(low+high)/2];
			//partition it
			int index = this.partition(arr, low, high, pivot);
			//Sort the left
			this.quicksort(arr, low, index-1);
			//sort the right
			this.quicksort(arr, index, high);
		}
	}
	
	private int partition(int[] arr, int low, int high, int pivot) {
		//while our markers at each end arent touching, keep swapping
		while(low <= high) {
			//if the pivot is larger than the left, move marker up
			//breaks out if not
			while(arr[low] < pivot) {
				low++;
			}
			
			//if the pivot is larger than the right, move marker down
			while(arr[high] > pivot) {
				high--;
			}
			
			//As long as no cross happened, perform the swap and move markers
			if(low <= high) {
				utils.performSwap(arr, low, high);
				low++;
				high--;
			}
		}
		
		//return the marker
		return low;
	}
}