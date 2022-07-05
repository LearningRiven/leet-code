package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import problems.TwoSumSorted;

public class TwoSumSortedTest {
	
	TwoSumSorted test = new TwoSumSorted();
	
	@Test
	public void testNotPossible() {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList());
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1));
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		
		assertEquals(0, test.twoSumSorted(null, 30).size());
		assertEquals(0, test.twoSumSorted(list1, 30).size());
		assertEquals(0, test.twoSumSorted(list2, 30).size());
		assertEquals(0, test.twoSumSorted(list3, 30).size());
	}
	
	@Test
	public void testPossible() {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList());
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1));
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		
		assertEquals(0, test.twoSumSorted(list1, 30).size());
		assertEquals(0, test.twoSumSorted(list2, 30).size());
		assertEquals(0, test.twoSumSorted(list3, 30).size());
	}
}
