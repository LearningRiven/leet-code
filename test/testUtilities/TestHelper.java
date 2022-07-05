package testUtilities;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class TestHelper {
	
	int[] largeArray;
	int[] largeArraySorted;
	
	public TestHelper(int elements) {
		largeArray = this.createLargeIntArray(elements);
		largeArraySorted = this.cloneAndSortArray(largeArray);
	};
	
	public int[] getLargeArray() {
		return largeArray;
	};
	
	public int[] getLargeArraySorted() {
		return largeArraySorted;
	};
	
	private int[] cloneAndSortArray(int[] arr) {
		int[] carr = arr.clone();
		Arrays.sort(carr);
		return carr;
	};
	
	private int[] createLargeIntArray(int elements) {
		int arr[] = new int[elements];
		
		for(int k = 0; k < arr.length; k++) {
			arr[k] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		}
		
		return arr;
	};
}
