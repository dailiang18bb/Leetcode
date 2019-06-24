package algorithm.No_268_Missing_Number;

import java.io.*;
import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Notes: Math
        
        
//         // Edge case
//         if(nums.length == 0){return 0;}
//         if(nums.length == 1 && nums[0] == 1){return 0;}
//         if(nums.length == 1 && nums[0] == 0){return 1;}
        
//         int n = nums.length;
//         int gaussSum = ((1 + n) * n)/2;
//         int arraySum = 0;
//         for(int x : nums){
//             arraySum += x;
//         }
        
//         return gaussSum - arraySum;
//         // End of Approach 1
        
        
        // Approach 2
        // Time Complexity: O(nlog(n))
        // Space Complexity: O(1)
        
        
//         // Edge case
//         if(nums.length == 0){return 0;}
//         if(nums.length == 1 && nums[0] == 1){return 0;}
//         if(nums.length == 1 && nums[0] == 0){return 1;}
        
//         Arrays.sort(nums);
//         for(int i = 0; i < nums.length; i ++){
//             if(nums[i] != i){
//                 return i;
//             }
//         }
//         return nums.length;
//         // End of Approach 2
        
        
        // Approach 3
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Notes: Bit Manipulation
        
//         // Edge case
//         if(nums.length == 0){return 0;}
//         if(nums.length == 1 && nums[0] == 1){return 0;}
//         if(nums.length == 1 && nums[0] == 0){return 1;}
        
//         int missing = nums.length;
//         for(int i = 0; i < nums.length; i++){
//             missing ^= i ^ nums[i];
//         }
//         return missing;
//         // End of Approach 3
        
        
        
        // Approach 4 
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        // Edge case
        if(nums.length == 0){return 0;}
        if(nums.length == 1 && nums[0] == 1){return 0;}
        if(nums.length == 1 && nums[0] == 0){return 1;}
        
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length + 1; i++){ hs.add(i);}
        for(int x : nums){
            if(hs.contains(x)){
                hs.remove(x);
            }
        }
        return hs.iterator().next();
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
            
            int ret = new Solution().missingNumber(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}