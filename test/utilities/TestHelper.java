package utilities;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class TestHelper {
	
	int[] randomArray;
	int[] randomArraySorted;
	
	int[] mostlySortedArray;
	int[] mostlySortedArraySorted;
	
	int[] mostlyUnsortedArray;
	int[] mostlyUnsortedArraySorted;
	
	public TestHelper(int elements) {
		randomArray = this.createLargeIntRandomArray(elements);
		mostlySortedArray = this.createLargeIntMostlySortedArray(elements);
		mostlyUnsortedArray = this.createLargeIntMostlyUnsortedArray(elements);
		
		randomArraySorted = this.cloneAndSortArray(randomArray);
		mostlySortedArraySorted = this.cloneAndSortArray(mostlySortedArray);
		mostlyUnsortedArraySorted = this.cloneAndSortArray(mostlyUnsortedArray);
	};
	
	
	
	public int[] getRandomArray() {
		return randomArray;
	}
	
	public int[] getRandomArraySorted() {
		return randomArraySorted;
	}

	public int[] getMostlySortedArray() {
		return mostlySortedArray;
	}
	
	public int[] getMostlySortedArraySorted() {
		return mostlySortedArraySorted;
	}
	
	public int[] getMostlyUnsortedArray() {
		return mostlyUnsortedArray;
	}
	
	public int[] getMostlyUnsortedArraySorted() {
		return mostlyUnsortedArraySorted;
	}



	private int[] cloneAndSortArray(int[] arr) {
		int[] carr = arr.clone();
		Arrays.sort(carr);
		return carr;
	};
	
	private int[] createLargeIntRandomArray(int elements) {
		int arr[] = new int[elements];
		
		for(int k = 0; k < arr.length; k++) {
			arr[k] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		}
		
		return arr;
	};
	
	private int[] createLargeIntMostlySortedArray(int elements) {
		int arr[] = new int[elements];
		
		for(int k = 0; k < arr.length; k++) {
			arr[k] = k;
		}
		
		arr[arr.length - 1] = 0;
		
		return arr;
	};
	
	private int[] createLargeIntMostlyUnsortedArray(int elements) {
		int arr[] = new int[elements];
		
		int pos = 0;
		for(int k = arr.length - 1; k >= 0; k--) {
			arr[pos] = k;
			pos++;
		}
		
		arr[0] = 0;
		
		return arr;
	};
}
