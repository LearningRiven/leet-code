package practice.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import testHelpers.TestHelper;

public class SorterTest {
	
	TestHelper helper = new TestHelper(100000);
	
	int[] even;
	int[] odd;
	int[] oneEl;
	int[] empty;

	
	BubbleSort bubble;
	QuickSort quick;
	
	@Before
	public void setup() {
		even = new int[]{5, 1, 4, 2, 8, 9, 3, 6};
		odd  = new int[]{3, 1, 4, 2, 5};
		oneEl= new int[]{1};
		empty= new int[]{};
		
		bubble = new BubbleSort();
		quick = new QuickSort();
	}
	
	@Test
	public void testBubblesort() {
		assertArrayEquals(new int[]{}, bubble.sort(empty));
		assertArrayEquals(new int[]{1}, bubble.sort(oneEl));
		assertArrayEquals(new int[]{1,2,3,4,5,6,8,9}, bubble.sort(even));
		assertArrayEquals(new int[]{1,2,3,4,5}, bubble.sort(odd));
		
		long start = System.currentTimeMillis();
		int[] largeTest = helper.getLargeArray().clone();
		assertArrayEquals(helper.getLargeArraySorted(), bubble.sort(largeTest));
		long end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Bubblesort)");
		
	}
	
	@Test
	public void testQuicksort() {
//		assertArrayEquals(new int[]{}, quick.sort(empty));
//		assertArrayEquals(new int[]{1}, quick.sort(oneEl));
//		assertArrayEquals(new int[]{1,2,3,4,5}, quick.sort(odd));
		assertArrayEquals(new int[]{1,2,3,4,5,6,8,9}, quick.sort(even));
		
//		long start = System.currentTimeMillis();
//		int[] largeTest = helper.getLargeArray().clone();
//		assertArrayEquals(helper.getLargeArraySorted(), quick.sort(largeTest));
//		long end   = System.currentTimeMillis();
//		
//		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Quicksort)");
	}
}
