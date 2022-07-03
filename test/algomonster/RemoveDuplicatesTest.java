package algomonster;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RemoveDuplicatesTest {

	RemoveDuplicates test = new RemoveDuplicates();
	
	@Test
	public void testListOfSameElements() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1));
		
		assertEquals(1, test.removeDuplicates(list));
	}
	
	@Test
	public void testListWithAllDuplicates() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,2,3,3,3,3,3,3));
		
		assertEquals(3, test.removeDuplicates(list));
		assertEquals(3, test.removeDuplicates(list2));
	}
	
	@Test
	public void testListWithoutDuplicates() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList());
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1));
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2));
		List<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		assertEquals(0, test.removeDuplicates(list));
		assertEquals(1, test.removeDuplicates(list2));
		assertEquals(2, test.removeDuplicates(list3));
		assertEquals(5, test.removeDuplicates(list4));
		
	}
}
