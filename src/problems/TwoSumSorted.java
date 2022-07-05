package problems;

import java.util.List;

public class TwoSumSorted {
	public List<Integer> twoSumSorted(List<Integer> arr, int target) {
        List<Integer> retList = List.of();
        
        if(arr == null) {
        	return retList;
        }
        
        int k = 0;
        while(k < arr.size()){
            int j = arr.size() - 1;
            while(j > k){
                 if((arr.get(j) + arr.get(k)) == target){
                     return List.of(k,j);
                 }
                j--;
            }
            k++;
        }
        
        return retList;
    }
}
