package algorithm.No_217_Contains_Duplicate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // HashSet<Integer> re = new HashSet<>(nums.length);
        // for(int i = 0; i< nums.length; i++){
        //     if(!re.add(nums[i])){
        //         return true;
        //     }
        // }
        // return false;
        // End of Approach 1
        
        
        // Approach 2
        // Time Complexity: O(nlog(n))
        // Space Complexity: O(1)
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            boolean ret = new Solution().containsDuplicate(nums);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}