package algorithm.No_739_Daily_Temperatures;

import java.util.*;
import java.io.*;

class Solution {
    
    
    public int[] dailyTemperatures(int[] T) {
        
        // Approach 1
        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
        // Notes: brute force
        
        // Edge
//         if(T == null || T.length == 0) return null;
        
//         int[] res = new int[T.length];
        
//         for(int i = 0; i < res.length - 1; i++){
//             for(int j = i + 1; j < res.length; j++ ){
//                 if(T[j] > T[i]){
//                     res[i] = j - i;
//                     break;
//                 }
//             }
//         }
//         return res;
        // End of Approach 1
        
        
        
        // Approach 2
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // Notes: Stack
        
        // Edge
        if(T == null || T.length == 0) return null;
        
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < T.length; i++){
            while(!stack.isEmpty() && T[i] > T[stack.peek()]){
                int curr = stack.pop();
                res[curr] = i - curr;
            }
            stack.push(i);
        }
        return res;
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
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] T = stringToIntegerArray(line);
            
            int[] ret = new Solution().dailyTemperatures(T);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
