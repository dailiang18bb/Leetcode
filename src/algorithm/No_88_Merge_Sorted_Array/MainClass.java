package algorithm.No_88_Merge_Sorted_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // Approach 1
        // Time Complexity: O(m + n) where m and n are the number of elements in nums1 and nums2 respectively
        // Space Complexity: O(m + n)
        
//         // Edge check
//         if(nums1.length == 0 || nums1 == null){
//             return;
//         }
        
        
//         int pointer1 = 0;
//         int pointer2 = 0;
//         int[] re = new int[m+n];
        
//         for(int i = 0; i < m + n; i++){
//             if(pointer1 < m && pointer2 < n){
//                 if(nums1[pointer1] <= nums2[pointer2]){
//                     re[i] = nums1[pointer1++];
//                 }else{
//                     re[i] = nums2[pointer2++];
//                 }
//             } else if(pointer1 >= m){
//                 re[i] = nums2[pointer2++];
//             } else if(pointer2 >= n){
//                 re[i] = nums1[pointer1++];
//             }
//         }
        
//         // nums1 = re.clone();
//         System.arraycopy(re,0,nums1,0,re.length);
    		// End of Approach 1

        
        
        
        
        // Approach 2
        // Time Complexity : O((m + n)log(m + n))
        // Space Complexity: O(1);
        // Notes: Implementation note: The sorting algorithm is a Dual-Pivot Quicksort by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch. This algorithm offers O(n log(n)) performance on many data sets that cause other quicksorts to degrade to quadratic performance, and is typically faster than traditional (one-pivot) Quicksort implementations.
        
        
        // int j = 0;
        // for(int i = m; i < m + n; i++){
        //     nums1[i] = nums2[j++];
        // }
        // Arrays.sort(nums1);
        // End of Approach 2

        
        
        
    	// Approach 3 
        // Time Complexity : O(m + n)
        // Space Complexity: O(1)
        
        int p1 = m - 1;
        int p2 = n - 1;
        
        for(int i = nums1.length - 1; i >= 0; i--){
            if(p1 >= 0 && p2 >= 0){
                if(nums1[p1] >= nums2[p2]){
                    nums1[i] = nums1[p1--];
                }else{
                    nums1[i] = nums2[p2--];
                }
            }else if(p1 < 0){
                nums1[i] = nums2[p2--];
            }else if(p2 < 0){
                nums1[i] = nums1[p1--];
            }
        }
        // End of Approach 3
        
        
    }
    
    
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums1 = stringToIntegerArray(line);
            line = in.readLine();
            int m = Integer.parseInt(line);
            line = in.readLine();
            int[] nums2 = stringToIntegerArray(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            new Solution().merge(nums1, m, nums2, n);
            String out = integerArrayToString(nums1);
            
            System.out.print(out);
        }
    }
}