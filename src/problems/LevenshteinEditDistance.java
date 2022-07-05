package problems;

/**
 * 
 * 
 * 
	Levenshtein Edit Distance (Hard)
	Good morning! Here's our prompt for today.
	
	An edit distance is a way to quantify how different two strings are. This 
	is calculated using the minimum number of transformations to turn one 
	string to another.
	
	The transformations include insertion, deletion, and substitution. So when 
	comparing two identical strings, say cat and cat, the edit distance would 
	be 0-- there is only an edit distance where there are differences.
	
	As an example, here's the edit distance for mitten and sitting:
	
	JAVASCRIPT
	getEditDistance('mitten', 'sitting');
	// 3
	Here's the rationale for 3 in terms of the transformation steps required:
	
	SNIPPET
	1. mitten -> sitten (substitution of "s" for "m")
	2. sitten -> sittin (substitution of "i" for "e")
	3. sittin -> sitting (insertion of "g" at the end).
 *
 */


public class LevenshteinEditDistance {
	public static int getEditDistance(String a, String b) {
        int editDistance = 0;
        if(b.length() > a.length()){
            editDistance = getEditDistanceBasedOnLongestString(b,a);
        }
        else {
            editDistance = getEditDistanceBasedOnLongestString(a,b);
        }
        return editDistance;
    }
  
    public static int getEditDistanceBasedOnLongestString(String s1, String s2){
      int distance = 0;
      
      //First figure out how much bigger s1 is
      int len1 = s1.length();
      int len2 = s2.length();
      distance = len1-len2;
      
      for(int k = 0; k < s2.length(); k++){
        if(s1.charAt(k) != s2.charAt(k)){
           distance++;
        }
      }
      return distance;
    }
}
