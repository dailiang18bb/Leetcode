package algorithm.No_0053_Maximum_Subarray;


import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity:
    // Space Complexity:
    // Notes: Time out
    
//     public int maxSubArray(int[] nums) {
//         // Edge
//         if(nums == null || nums.length == 0){
//             return 0;    
//         }
//         if(nums.length == 1){
//             return nums[0];
//         }
        
//         int res = nums[0];
        
//         for(int i = 1; i < nums.length + 1; i++){
//             for(int j = 0; j <= nums.length - i; j++){
//                 int sum = 0;
//                 int k = i;
//                 int g = j;
//                 while(k > 0){
//                     sum += nums[g++];
//                     k--;
//                 }
//                 // System.out.println(sum);
//                 if(sum > res){
//                     res = sum;
//                 }
//             }
//         }
//         return res;
        
//     }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Notes:
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int maxPoint = nums[0];
        
        for(int i = 1; i < nums.length ; i++){
            maxPoint = Math.max(nums[i], maxPoint + nums[i]);
            res = Math.max(maxPoint, res);
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
            
            int ret = new Solution().maxSubArray(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}