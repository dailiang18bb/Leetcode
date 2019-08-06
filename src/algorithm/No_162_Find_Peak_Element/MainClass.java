package algorithm.No_162_Find_Peak_Element;

import java.io.*;

class Solution {
    public int findPeakElement(int[] nums) {
        
//         // Approach 1
//         // Time Complexity: O(logn)
//         // Space Complexity: O(1)
//         // Notes: Binary Search
        
        // Edge
        if(nums == null || nums.length == 0) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid + 1] > nums[mid]){
                left = mid + 1;
            } else{
                right = mid;
            }
            
        }
        return left;
        
        //End of Approach 1
        
        
        
        
        
        
        // Approach 2
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Notes: brute force
        
        // Edge
//         if(nums == null || nums.length == 0) return -1;
//         if(nums.length == 1 || nums[0] > nums[1]) return 0;
//         if( nums[nums.length - 2] < nums[nums.length - 1]) return nums.length - 1;
        
//         for(int i = 1; i < nums.length - 1; i++){
//             if(nums[i + 1] < nums[i]){
//                 return i;
//             }
//         }
//         return -1;
        // End of Approach 2
        
        
        
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().findPeakElement(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}