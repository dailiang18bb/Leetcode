package algorithm.No_0523_Continuous_Subarray_Sum;

import java.util.*;
import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Notes: brute force
    
    // public boolean checkSubarraySum(int[] nums, int k) {
    //     // Edge
    //     if(nums == null || nums.length < 1){
    //         return false;
    //     }
    //     //
    //     for(int i = 0; i < nums.length - 1; i++){
    //         int sum = nums[i];
    //         for(int j = i + 1; j < nums.length; j++){
    //             sum += nums[j];
    //             if(k == 0){
    //                 if(sum == 0){
    //                     return true;
    //                 }
    //             }else if(sum % k == 0){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Notes: sum % k = A[0, j] % k - A[0, i - 1] % k 
    public boolean checkSubarraySum(int[] nums, int k) {
        // Edge
        if(nums == null || nums.length < 1){
            return false;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(k != 0){
                sum %= k;
            }
            if(hm.containsKey(sum)){
                if(i - hm.get(sum)> 1){
                    return true;
                }
            }else{
                hm.put(sum, i);
            }
        }
        return false;
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            boolean ret = new Solution().checkSubarraySum(nums, k);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}