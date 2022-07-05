package datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import datastructures.HeapMinMax;

public class HeapMinMaxTest {

	HeapMinMax minHeap;
	HeapMinMax maxHeap;
	
	@Before
	public void setup() {
		minHeap = new HeapMinMax(false);
		maxHeap = new HeapMinMax(true);
	}
	
	@Test
	public void testMinHeap() {
		minHeap.insert(1);
		minHeap.insert(10);
		minHeap.insert(5);
		minHeap.insert(3);
		minHeap.insert(2);
		
		String result = pullFromHeap(minHeap);
		
		assertEquals("1 2 3 5 10", result);
	}
	
	@Test
	public void testMaxHeap() {
		maxHeap.insert(1);
		maxHeap.insert(10);
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(2);
		
		String result = pullFromHeap(maxHeap);
		
		assertEquals("10 5 3 2 1", result);
		
	}
	
	private String pullFromHeap(HeapMinMax heap) {
		String contents = "";
		while(!heap.isEmpty()) {
			contents = contents + " " + heap.remove();
		}
		return contents;
	}
}
