package algorithmpractice;

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