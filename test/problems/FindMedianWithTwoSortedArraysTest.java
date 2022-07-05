package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import problems.FindMedianWithTwoSortedArrays;


class FindMedianWithTwoSortedArraysTest {

	FindMedianWithTwoSortedArrays test = new FindMedianWithTwoSortedArrays();
	ArrayList<Integer> arr1;
	ArrayList<Integer> arr2;
	
	@Test
	void testEmpty() {
		double median;
		
		arr1 = new ArrayList<Integer>(Arrays.asList());
		arr2 = new ArrayList<Integer>(Arrays.asList());
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(-9999.0, median,"Test Both Empty");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1));
		arr2 = new ArrayList<Integer>(Arrays.asList());
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(1.0, median,"Test Second Empty");
		
		arr1 = new ArrayList<Integer>(Arrays.asList());
		arr2 = new ArrayList<Integer>(Arrays.asList(1));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(1.0, median,"Test First Empty");
	}
	
	@Test
	void testBothEvenLength() {
		double median;
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2));
		arr2 = new ArrayList<Integer>(Arrays.asList(3,4));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(2.5, median,"Test Sequential");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2));
		arr2 = new ArrayList<Integer>(Arrays.asList(2,3));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(2.0, median,"Test Same Values");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(3,4));
		arr2 = new ArrayList<Integer>(Arrays.asList(1,2));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(2.5, median,"Test Inverted");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		arr2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7,8));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(4.5, median,"Test Large");
	}
	
	@Test
	void testBothOddLength() {
        double median;
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		arr2 = new ArrayList<Integer>(Arrays.asList(3,4,5));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(3.0, median,"Test Sequential");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		arr2 = new ArrayList<Integer>(Arrays.asList(2,3,4));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(2.5, median,"Test Same Values");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(3,4,5));
		arr2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(3.0, median,"Test Inverted");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		arr2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(4.0, median,"Test Large");
	}
	
	@Test
	void testFirstEvenSecondOdd() {
		double median;
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2));
		arr2 = new ArrayList<Integer>(Arrays.asList(3,4,5));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(3.0, median,"Test Sequential");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2));
		arr2 = new ArrayList<Integer>(Arrays.asList(2,3,4));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(2.0, median,"Test Same Values");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(3,4));
		arr2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(3.0, median,"Test Inverted");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		arr2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(4.0, median,"Test Large");
	}
	
	@Test
	void testFirstOddSecondEven() {
		double median;
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		arr2 = new ArrayList<Integer>(Arrays.asList(3,4));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(3.0, median,"Test Sequential");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		arr2 = new ArrayList<Integer>(Arrays.asList(2,3));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(2.0, median,"Test Same Values");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(3,4,5));
		arr2 = new ArrayList<Integer>(Arrays.asList(1,2));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(3.0, median,"Test Inverted");
		
		arr1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		arr2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6));
		median = test.findMedianSortedArrays(convertToArray(arr1), convertToArray(arr2));
		assertEquals(4.0, median,"Test Large");
	}
	
	int[] convertToArray(ArrayList<Integer> arr) {
		int[] converted = new int[arr.size()];
		
		for(int k = 0; k < arr.size(); k++) {
			converted[k] = arr.get(k).intValue();
		}
		
		return converted;
	}

}
