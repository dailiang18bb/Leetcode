package algorithm.No_278_First_Bad_Version;

public class Solution {
	
	// dummy function
	public static boolean isBadVersion(int n) {
		return true;
	}
	
	
	
    public int firstBadVersion(int n) {
        
        // Approach 1
        // Time Complexity: O(logn)
        // Space Complexity: O(1)
        // Notes: Binary Search
        
        if(n < 1) return -1;
        
        int left = 1;
        int right = n;
        
        while(left < right){
            // int mid = left + (right - left) / 2;
            int mid = left + ((right - left) >> 1);
            if(isBadVersion(mid)){   
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
        // return -1;
        // End of Approach 1
        
        
        
        
    }
}
