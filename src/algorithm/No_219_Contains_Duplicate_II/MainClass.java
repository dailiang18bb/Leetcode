package algorithm.No_219_Contains_Duplicate_II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*; 

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // Approach 1 
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        // Hashtable<Integer, Integer> h = new Hashtable<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(h.containsKey(nums[i])){
        //         if(i - h.get(nums[i]) <= k){
        //             return true;
        //         }else{
        //             h.put(nums[i],i);
        //         }
        //     } else{
        //         h.put(nums[i],i);
        //     }
        // }
        // return false;
        
        // End of Approach 1
        
        
        
        // Approach 2
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        // Edge check
//         if(nums.length == 0 || nums == null){
//             return false;
//         }
//         if(nums.length == 1 || k < 1){
//             return false;
//         }
        
//         Hashtable<Integer, Integer> h = new Hashtable<>();
//         for(int i = 0; i < nums.length; i++){
//             Integer prevValue = h.put(nums[i],i);
//             if(prevValue != null && Math.abs(i - prevValue) <= k){
//                 return true;
//             }
//         }
//         return false;
        // End of Approach 2
        
        
        
        // Approach 3
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        // Edge check
        if(nums.length == 0 || nums == null){
            return false;
        }
        if(nums.length == 1 || k < 1){
            return false;
        }
        
        Set<Integer> re = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!re.add(nums[i])){
                return true;
            } else{
                if(i-k >= 0){
                    re.remove(nums[i-k]);
                }
            }
        }
        return false;
        
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
            
            boolean ret = new Solution().containsNearbyDuplicate(nums, k);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}