package algomonster.twopointer;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public int longestSubstringWithoutRepeatingCharacters(String s) {
        int longest = 0;
        if(s != null) {
            int size = s.length();
            int start = 0;
            HashSet<Character> window;
            
            while(start < size){
            	window = new HashSet<Character>();
            	window.add(s.charAt(start));
            	
            	int next = start + 1;
        		while(next < size && !window.contains(s.charAt(next))) {
        			window.add(s.charAt(next));
        			next++;
        		}
            	
            	if(window.size() > longest) {
            		longest = window.size();
            	}
            	start++;
            	
            	//Potential to break early
            	if(this.breakEarly(start, size, longest)) {
            		break;
            	}
            }
        }
        
        return longest;
    }
	
	//You can break early if the string doesnt have any length left
	private boolean breakEarly(int start, int size, int longest) {
		int sizeRemaining = size-start;
		if(longest >= sizeRemaining) {
			return true;
		}
		
		return false;
	}
    
}
