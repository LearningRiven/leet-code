package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import problems.MergeKSortedLists;

public class MergeKSortedListsTest {

	
	MergeKSortedLists test = new MergeKSortedLists();
	
	@Test
	public void testBrute1() {
		List<List<Integer>> testList = new ArrayList<List<Integer>>();
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(3));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,3,5));
		List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(2,4,6));
		List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(7,10));
		
		testList.add(l1);
		testList.add(l2);
		testList.add(l3);
		testList.add(l4);

		assertEquals(List.of(1,2,3,4,5,6,7,10),test.mergeKSortedListsBrute(testList));
	}
	
	@Test
	public void testBrute2() {
		List<List<Integer>> testList = new ArrayList<List<Integer>>();
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(3));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		testList.add(l1);
		testList.add(l2);

		assertEquals(List.of(1,2,3),test.mergeKSortedListsBrute(testList));
	}
	
	@Test
	public void testQuick1() {
		List<List<Integer>> testList = new ArrayList<List<Integer>>();
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(3));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,3,5));
		List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(2,4,6));
		List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(7,10));
		
		testList.add(l1);
		testList.add(l2);
		testList.add(l3);
		testList.add(l4);

		assertEquals(List.of(1,2,3,4,5,6,7,10),test.mergeKSortedLists(testList));
	}
	
	@Test
	public void testQuick2() {
		List<List<Integer>> testList = new ArrayList<List<Integer>>();
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(3));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		testList.add(l1);
		testList.add(l2);

		assertEquals(List.of(1,2,3),test.mergeKSortedLists(testList));
	}
}
