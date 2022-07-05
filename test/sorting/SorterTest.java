package sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import sorting.BubbleSort;
import sorting.QuickSort;
import utilities.TestHelper;

public class SorterTest {
	
	//Declared outhere for consistent datasets
	TestHelper helper = new TestHelper(75000);
	
	int[] even;
	int[] odd;
	int[] oneEl;
	int[] empty;

	
	BubbleSort bubble;
	QuickSort quick;
	InsertionSort insertion;
	SelectionSort selection;
	
	@Before
	public void setup() {
		even = new int[]{5, 1, 4, 2, 8, 9, 3, 6};
		odd  = new int[]{3, 1, 4, 2, 5};
		oneEl= new int[]{1};
		empty= new int[]{};
		
		bubble = new BubbleSort();
		quick = new QuickSort();
		insertion = new InsertionSort();
		selection = new SelectionSort();
	}
	
	@Test
	public void testBaseCases() {
		//Bubble
		assertArrayEquals(new int[]{}, bubble.sort(empty.clone()));
		assertArrayEquals(new int[]{1}, bubble.sort(oneEl.clone()));
		assertArrayEquals(new int[]{}, bubble.sort2(empty.clone()));
		assertArrayEquals(new int[]{1}, bubble.sort2(oneEl.clone()));
		
		//Quick
		assertArrayEquals(new int[]{}, quick.sort(empty.clone()));
		assertArrayEquals(new int[]{1}, quick.sort(oneEl.clone()));
		
		//Insertion
		assertArrayEquals(new int[]{}, insertion.sort(empty.clone()));
		assertArrayEquals(new int[]{1}, insertion.sort(oneEl.clone()));
		
		//Selection
		assertArrayEquals(new int[]{}, selection.sort(empty.clone()));
		assertArrayEquals(new int[]{1}, selection.sort(oneEl.clone()));
	}
	
	@Test
	public void testEvenCases() {
		assertArrayEquals(new int[]{1,2,3,4,5,6,8,9}, bubble.sort(even.clone()));
		assertArrayEquals(new int[]{1,2,3,4,5,6,8,9}, bubble.sort2(even.clone()));
		assertArrayEquals(new int[]{1,2,3,4,5,6,8,9}, quick.sort(even.clone()));
		assertArrayEquals(new int[]{1,2,3,4,5,6,8,9}, insertion.sort(even.clone()));
		assertArrayEquals(new int[]{1,2,3,4,5,6,8,9}, selection.sort(even.clone()));
	}
	
	@Test
	public void testOddCases() {
		assertArrayEquals(new int[]{1,2,3,4,5}, bubble.sort(odd.clone()));
		assertArrayEquals(new int[]{1,2,3,4,5}, bubble.sort2(odd.clone()));
		assertArrayEquals(new int[]{1,2,3,4,5}, quick.sort(odd.clone()));
		assertArrayEquals(new int[]{1,2,3,4,5}, insertion.sort(odd.clone()));
		assertArrayEquals(new int[]{1,2,3,4,5}, selection.sort(odd.clone()));
	}
	
	@Test
	public void testTimeRandom() {
		long start;
		long end;
		
		System.out.println("-----------------------------Random-----------------------------");
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getRandomArraySorted(), quick.sort(helper.getRandomArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Quicksort)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getRandomArraySorted(), insertion.sort(helper.getRandomArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Insertion)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getRandomArraySorted(), selection.sort(helper.getRandomArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Selection)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getRandomArraySorted(), bubble.sort(helper.getRandomArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Bubblesort)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getRandomArraySorted(), bubble.sort2(helper.getRandomArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Bubblesort2)");
	}
	
	@Test
	public void testMostlySorted() {
		long start;
		long end;
		
		System.out.println("-----------------------------Mostly Sorted-----------------------------");
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlySortedArraySorted(), bubble.sort(helper.getMostlySortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Bubblesort)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlySortedArraySorted(), bubble.sort2(helper.getMostlySortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Bubblesort2)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlySortedArraySorted(), quick.sort(helper.getMostlySortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Quicksort)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlySortedArraySorted(), insertion.sort(helper.getMostlySortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Insertion)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlySortedArraySorted(), selection.sort(helper.getMostlySortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Selection)");
	}
	
	@Test
	public void testMostlyUnsorted() {
		long start;
		long end;
		
		System.out.println("-----------------------------Mostly Unsorted-----------------------------");
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlyUnsortedArraySorted(), bubble.sort(helper.getMostlyUnsortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Bubblesort)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlyUnsortedArraySorted(), bubble.sort2(helper.getMostlyUnsortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Bubblesort2)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlyUnsortedArraySorted(), quick.sort(helper.getMostlyUnsortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Quicksort)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlyUnsortedArraySorted(), insertion.sort(helper.getMostlyUnsortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Insertion)");
		
		start = System.currentTimeMillis();
		assertArrayEquals(helper.getMostlyUnsortedArraySorted(), selection.sort(helper.getMostlyUnsortedArray().clone()));
		end   = System.currentTimeMillis();
		
		System.out.println("Large Dataset Took: " + (end-start) + " Milliseconds (Selection)");
		
		
	}
}
