package problems;

/*
Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, 
return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106


 */

public class FindMedianWithTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {     
        //First merge the arrays
        int[] merged = getMergedArray(nums1, nums2);
        
        if(merged.length == 0) {
        	return -9999.0;
        }
        
        //Then find the median
        double median = findMedian(merged);
        
        return median;
    }
    
    public int[] getMergedArray(int[] nums1, int[] nums2){
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len  = len1 + len2;
        
        int[] merged = new int[len];
        
        int it1  = 0;
        int it2  = 0;
        int   m  = 0;
        
        //Merge both
        while(it1 < len1 && it2 < len2){
            if(nums1[it1] <= nums2[it2]){
                merged[m] = nums1[it1];
                it1++;
            }
            else{
                merged[m] = nums2[it2];
                it2++;
            }
            m++;
        }
        
        //If there are still more elements in the first array, add them all
        while(it1 < len1){
            merged[m] = nums1[it1];
            it1++;
            m++;
        }
        
        //If there are still more elements in the second array, add them all
        while(it2 < len2){
            merged[m] = nums2[it2];
            it2++;
            m++;
        }
        
        return merged;
            
    }
    
    public double findMedian(int[] arr){
        boolean isEven = arr.length % 2 == 0 ? true : false;
        
        if(isEven){
            int midpoint = (int)Math.floor(arr.length / 2);
            double median = ((double)arr[midpoint-1]+(double)arr[midpoint])/2;
            return median;
        }
        else{
            int midpoint = (int)Math.floor(arr.length / 2);
            return arr[midpoint];
        }
    }
}
