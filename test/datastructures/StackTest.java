package datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	Stack<Integer> test;
	
	@Before
	public void setup() {
		test = new Stack<Integer>();
	}
	
	@Test
	public void testStack() {
		test.insert(1);
		test.insert(2);
		test.insert(3);
		
		assertEquals(3, test.peek());
		assertEquals(3, test.pop());
		assertEquals(2, test.pop());
		assertEquals(1, test.peek());
		assertEquals(1, test.pop());
		assertEquals(null, test.peek());
		assertEquals(null, test.pop());
	}
}
