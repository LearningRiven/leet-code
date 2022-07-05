package datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	Queue<Integer> test;
	
	@Before
	public void setup() {
		test = new Queue<Integer>();
	}
	
	@Test
	public void testStack() {
		test.insert(1);
		test.insert(2);
		test.insert(3);
		
		assertEquals(1, test.peek());
		assertEquals(1, test.poll());
		assertEquals(2, test.poll());
		assertEquals(3, test.peek());
		assertEquals(3, test.poll());
		assertEquals(null, test.peek());
		assertEquals(null, test.poll());
	}
}
