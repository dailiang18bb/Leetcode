package algorithm.No_0560_Subarray_Sum_Equals_K;

import java.util.*;
import java.io.*;


class Solution {
    
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Notes: Brute force
    // public int subarraySum(int[] nums, int k) {
    //     //Edge
    //     //
    //     int res = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         int sum = 0;
    //         for(int y = i; y < nums.length; y++){
    //             sum += nums[y];
    //             if(sum == k){
    //                 res++;
    //             }
    //         }
    //     }
    //     return res;
    // }
    // End of Approach 1
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: prefix sum A[i,j] = A[0,j] - A[0,i-1]
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0;
        int res = 0;
        for(int x : nums){
            sum += x;
            if(hm.containsKey(sum - k)){
                res += hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return res;
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
            int k = Integer.parseInt(line);
            
            int ret = new Solution().subarraySum(nums, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
