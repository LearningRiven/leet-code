package utilities;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {
	public void performSwap(int[] arr, int slot1, int slot2) {
		int temp = arr[slot1];
		arr[slot1] = arr[slot2];
		arr[slot2] = temp;
	}
	
	public int[] createLargeIntArray() {
		int arr[] = new int[10000];
		for(int k = 0; k < arr.length; k++) {
			arr[k] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		}
		
		return arr;
	}
	
	public int[] cloneAndSortArray(int[] arr) {
		int[] carr = arr.clone();
		Arrays.sort(carr);
		return carr;
	}
}
