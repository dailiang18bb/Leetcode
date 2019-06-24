package algorithm.No_136_Single_Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int singleNumber(int[] nums) {
        
        // Approach 1
        // Time complexity: O(n)
        // Space Complexity: O(n)
        
//         //edge check
//         if(nums.length ==1){return nums[0];}
        
//         HashMap<Integer,Integer> h = new HashMap<>();
//         for(int i = 0; i < nums.length; i++){
//             if(!h.containsKey(nums[i])){
//                 h.put(nums[i],1);
//             }else{
//                 h.remove(nums[i]);
//             }
//         }
        
//         for(Integer x : h.keySet()){
//             return x;
//         }
        
//         return 0;
        
        
        // Approach 2
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
//         //edge check
//         if(nums.length ==1){return nums[0];}
        
//         HashSet<Integer> h = new HashSet<>();
//         for(int x: nums){
//             if(!h.add(x)){
//                 h.remove(x);
//             }
//         }
        
//         for(int x:h){
//             return x;
//         }
        
//         return 0;
        
        
        // Approach 3
        // Notes: Bit Manipulation
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
        //edge check
        if(nums.length ==1){return nums[0];}
        int result = 0;
        for(int x : nums){
            result ^= x;
        }
        return result;
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().singleNumber(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}