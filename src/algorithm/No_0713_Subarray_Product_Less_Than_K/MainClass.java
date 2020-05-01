package algorithm.No_0713_Subarray_Product_Less_Than_K;


import java.io.*;


class Solution {
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Notes: brute force
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         // Edge
//         //
        
//         int res = 0;
//         for(int i = 0; i < nums.length; i++){
//             int prod = 1;
//             for(int j = i; j < nums.length; j++){
//                 prod *= nums[j];
//                 if(prod < k){
//                     res++;
//                 }else{
//                     break;
//                 }
//             }
//         }
//         return res;
//     }
    // End of Appraoch 1
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity:O(1)
    // Notes: Sliding window
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Edge 
        if(k <= 1){
            return 0;
        }
        //
        
        int prod = 1, res = 0, left = 0;
        for(int right = 0; right < nums.length; right++){
            prod *= nums[right];
            while(prod >= k){
                prod /= nums[left++];
            }
            res += right - left + 1;
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
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            int ret = new Solution().numSubarrayProductLessThanK(nums, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}