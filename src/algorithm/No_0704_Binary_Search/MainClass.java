package algorithm.No_0704_Binary_Search;

import java.io.*;

class Solution {
    
    
    // Approach 1
    // Time Complexity: O(logn)
    // Space Complexity:O(1)
    // Notes: Binary search
//     public int search(int[] nums, int target) {
//         if(nums == null || nums.length == 0) return -1;
        
//         int left = 0;
//         int right = nums.length - 1;
//         int pivot;
//         while(left <= right){
//             pivot = (left + right) / 2;
//             if(target > nums[pivot]){
//                 left = pivot + 1;
//             }else if(target < nums[pivot]){
//                 right = pivot - 1;
//             }else{
//                 return pivot;
//             }
//         }
//         return -1;
//     }
    // End of Approach 1;
    
    
    // Approach 2
    // Time Complexity: O(logn)
    // Space Complexity:O(logn)
    // Notes:recurrsive
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }
    
    public int helper(int[] nums, int target, int left, int right){
        if(left > right){ return -1;}
        int pivot = left + (right - left)/2;
        if(nums[pivot] > target){
            return helper(nums, target, left, pivot - 1);
        }else if(nums[pivot] < target){
            return helper(nums, target, pivot + 1, right);
        }else{
            return pivot;
        }
    }
    // End of Approach 2


    
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
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int ret = new Solution().search(nums, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}