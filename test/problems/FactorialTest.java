package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import problems.Factorial;

public class FactorialTest {
	
	Factorial test = new Factorial();
	
	@Test
	public void testFactorial() {
		assertEquals(6, test.factorial(3));
		assertEquals(24, test.factorial(4));
		assertEquals(1, test.factorial(1));
	}
}
