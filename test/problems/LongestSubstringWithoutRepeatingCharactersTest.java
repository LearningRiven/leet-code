package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import problems.LongestSubstringWithoutRepeatingCharacters;

public class LongestSubstringWithoutRepeatingCharactersTest {

	LongestSubstringWithoutRepeatingCharacters test = new LongestSubstringWithoutRepeatingCharacters();
	
	@Test
	public void testNullCases() {
		assertEquals(0, test.longestSubstringWithoutRepeatingCharacters(null));
		assertEquals(0, test.longestSubstringWithoutRepeatingCharacters(""));
	}
	
	@Test
	public void testAlgoMonsterCase1() {
		String val = "abcdbea";

		assertEquals(5, test.longestSubstringWithoutRepeatingCharacters(val), val);
	}
	
	@Test
	public void testAlgoMonsterCase2() {
		String val = "aba";
		
		assertEquals(2, test.longestSubstringWithoutRepeatingCharacters(val), val);
	}
	
	@Test
	public void testAlgoMonsterCase3() {
		String val = "abccabcabcc";

		assertEquals(3, test.longestSubstringWithoutRepeatingCharacters(val), val);
	}
	
	@Test
	public void testAlgoMonsterCase4() {
		String val = "aaaabaaa";
		
		assertEquals(2, test.longestSubstringWithoutRepeatingCharacters(val), val);
	}
	
	@Test
	public void testAlphabet() {
		String val = "abcdefghijklmnopqrstuvwxyz";
		
		assertEquals(26, test.longestSubstringWithoutRepeatingCharacters(val), val);
	}
	
	@Test
	public void testAlphabetWithSubsetsInBeginning() {
		String val = "abcdefklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		
		assertEquals(26, test.longestSubstringWithoutRepeatingCharacters(val), val);
	}
}
