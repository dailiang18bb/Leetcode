package algorithm.No_0198_House_Robber;

import java.io.*;
import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n), where n is the length of nums
    // Space Complexity: O(n)
    // Notes: DP, currentMax = Math.max(prevPrevMax + currentValue, prevMax)
    
//     public int rob(int[] nums) {
//         // Edge
//         if(nums == null || nums.length == 0){
//            return 0; 
//         }
        
//         int[] res = new int[nums.length];
//         res[0] = nums[0];
//         for(int i = 1; i < nums.length; i++){
//             if(i - 2 >=0){
//                 res[i] = Math.max(res[i - 1], res[i - 2] + nums[i]);
//             }else{
//                 res[i] = Math.max(res[i - 1], nums[i]);
//             }
//         }
//         return res[res.length - 1];
//     }
    // End of Approach 1
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: Recurrsive, with memo
    public int rob(int[] nums) {
        // Edge
        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return helper(nums, nums.length - 1, memo);
    }
    
    private int helper(int[] nums, int i, int[] memo){
        if(i == 0){
            return nums[0];
        }
        if(i == 1){
            return Math.max(nums[0],nums[1]);
        }
        if(memo[i] == -1){
            memo[i] = Math.max(helper(nums, i - 2, memo) + nums[i], helper(nums, i - 1, memo));
        }
        return memo[i];
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
            
            int ret = new Solution().rob(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}