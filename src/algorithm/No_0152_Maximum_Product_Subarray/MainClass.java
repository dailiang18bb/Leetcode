package algorithm.No_0152_Maximum_Product_Subarray;



import java.io.*;

class Solution {
    
    
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Notes: brute force
//     public int maxProduct(int[] nums) {
//         // Edge
//         if(nums == null || nums.length == 0){
//             return 0;
//         }
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < nums.length; i++){
//             int prod = 1;
//             for(int j = i; j < nums.length; j++){
//                 prod *= nums[j];
//                 if(prod > max){
//                     max = prod;
//                 }
//             }
//         }
//         return max;
//     }
    // End of Approach 1
    
    // Approach 2
    // Time Complexity:
    // Space Complexity:
    // Notes:
    public int maxProduct(int[] nums) {
        // Edge
        if(nums == null || nums.length == 0){
            return 0;
        }
        //
        int max = nums[0];
        int min = nums[0];
        int res = max;
        for(int i = 1; i < nums.length; i++){
            int prevMax = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(prevMax* nums[i], min * nums[i]), nums[i]);
            res = Math.max(max, res);
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().maxProduct(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}