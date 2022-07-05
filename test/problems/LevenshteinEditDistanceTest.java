package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import problems.LevenshteinEditDistance;

class LevenshteinEditDistanceTest {

	LevenshteinEditDistance s1 = new LevenshteinEditDistance();
	
	@Test
	void test() {
		String a;
		String b;
		int result;
		
		//Test1
		a = "apple";
		b = "appla";
		result = LevenshteinEditDistance.getEditDistance(a,b);
		assertEquals(1,result,"Single change");
		
		//Test1
		a = "bapple";
		b = "apple";
		result = LevenshteinEditDistance.getEditDistance(a,b);
		assertEquals(5,result,"Single change");
		
		//Test1
		a = "ashgwuhga";
		b = "fsdgasdwh";
		result = LevenshteinEditDistance.getEditDistance(a,b);
		assertEquals(7,result,"Single change");
		
		//Test1
		a = "app";
		b = "appla";
		result = LevenshteinEditDistance.getEditDistance(a,b);
		assertEquals(2,result,"Single change");
		
		//Test1
		a = "apple";
		b = "applaaa";
		result = LevenshteinEditDistance.getEditDistance(a,b);
		assertEquals(3,result,"Single change");
		
		
	}
}
