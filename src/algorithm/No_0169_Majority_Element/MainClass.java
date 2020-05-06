package algorithm.No_0169_Majority_Element;


import java.io.*;
import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: Hash Table
//     public int majorityElement(int[] nums) {
//         // Edge
//         //
//         int max = nums[0];
//         int count = 0;
        
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         for(Integer x : nums){
//             if(hm.containsKey(x)){
//                 if(hm.get(x) + 1 > count){
//                     count = hm.get(x) + 1;
//                     max = x;
//                 }
//             }
//             hm.put(x, hm.getOrDefault(x, 0) + 1);
//         }
//         return max;
//     }
    // End of Approach 1
    
    // Approach 2
    // Time Complexity: O(nlogn)
    // Space Complexity: O(1)
    // Notes:
    public int majorityElement(int[] nums) {
        //
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    // Approach 2


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
            
            int ret = new Solution().majorityElement(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}