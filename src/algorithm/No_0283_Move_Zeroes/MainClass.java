package algorithm.No_0283_Move_Zeroes;


import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Sapce Complexity: O(1)
    // Notes:
//     public void moveZeroes(int[] nums) {
//         // Edge
//         if(nums == null || nums.length == 0){
//             return;
//         }
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == 0){
//                 for(int j = i + 1; j < nums.length; j++){
//                     if(nums[j] != 0){
//                         //swap
//                         int temp = nums[i];
//                         nums[i] = nums[j];
//                         nums[j] = temp;
//                         break;
//                     }
//                 }    
//             }
            
//         }
//     }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Notes: two pointer
     public void moveZeroes(int[] nums) {
         int pointerA = 0;
         for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[pointerA++] = nums[i];
            }    
         }
         while(pointerA < nums.length){
             nums[pointerA++] = 0;
         }
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
            
            new Solution().moveZeroes(nums);
            String out = integerArrayToString(nums);
            
            System.out.print(out);
        }
    }
}