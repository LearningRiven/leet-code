package algomonster;

import java.util.List;

/* 
 * 
Given a sorted list of numbers, remove duplicates and return the new length. You must do this in-place and without using extra memory.

Input: [0, 0, 1, 1, 1, 2, 2].

Output: 3.

Your function should modify the list in place so the first 3 elements becomes 0, 1, 2. Return 3 because the new length is 3.
 */

public class RemoveDuplicates {

	public int removeDuplicates(List<Integer> arr) {
        int k = 0;
        
        while(k < arr.size()){
            int j = k+1;
            while(j < arr.size() && arr.get(k) == arr.get(j)){
                if(j > k){
                    arr.remove(j);
                }
            }
            k++;
        }
        return arr.size();
        
    }
}
