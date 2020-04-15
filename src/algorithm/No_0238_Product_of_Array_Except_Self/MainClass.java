package algorithm.No_0238_Product_of_Array_Except_Self;

import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity:
    // Notes: 
    
//     public int[] productExceptSelf(int[] nums) {
//         // Edge
//         //
        
//         int[] res = new int[nums.length];
//         for(int i = 0; i < nums.length; i++){
//             int tempProduct = 1;
//             for(int k = 0; k < nums.length; k++){
//                 if(k != i){
//                     tempProduct *= nums[k];
//                 }
//             }
//             res[i] = tempProduct; 
//         }
//         return res;
//     }
    
    // End of Approach 1
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity:
    // Notes: Use two arrays to do the mimoization
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] arrLeft = new int[nums.length];
        int[] arrRight = new int[nums.length];
        //left
        arrLeft[0] = 1;
        for(int i = 1; i < nums.length; i++){
            arrLeft[i] = arrLeft[i - 1] * nums[i - 1];
        }
        //right
        arrRight[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            arrRight[i] = arrRight[i + 1] * nums[i + 1];
        }
        
        for(int i = 0; i < nums.length; i++){
            res[i] = arrLeft[i] * arrRight[i];
        }
        return res;
        
    }
    // End of Appraoch 2


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
            int[] nums = stringToIntegerArray(line);
            
            int[] ret = new Solution().productExceptSelf(nums);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}