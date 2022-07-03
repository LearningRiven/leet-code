package algorithmpractice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SorterTest {
	
	int[] even;
	int[] odd;
	int[] oneEl;
	int[] empty;
	
	BubbleSort bubble;
	
	@Before
	public void setup() {
		even = new int[]{5, 1, 4, 2, 8, 9, 3, 6};
		odd  = new int[]{3, 1, 4, 2, 5};
		oneEl= new int[]{1};
		empty= new int[]{};
		
		bubble = new BubbleSort();
	}
	
	@Test
	public void testBubblesort() {
		assertArrayEquals(new int[]{}, bubble.sort(empty));
		assertArrayEquals(new int[]{1}, bubble.sort(oneEl));
		assertArrayEquals(new int[]{1,2,3,4,5,6,8,9}, bubble.sort(even));
		assertArrayEquals(new int[]{1,2,3,4,5}, bubble.sort(odd));
	}
}
