package algorithm.No_1413_Minimum_Value_to_Get_Positive_Step_by_Step_Sum;


import java.io.*;


class Solution {
    
    
    // Approach 1
    // Time Complexity:
    // Space Complexity:
    // Notes: follow 
    
    // public int minStartValue(int[] nums) {
    //     // Edge
    //     //
    //     int i = 1;
    //     boolean flag = true;
    //     while(flag){
    //         int sum = i;
    //         for(int k = 0; k < nums.length; k++){
    //             sum += nums[k];
    //             if(sum < 1){
    //                 i++;
    //                 break;
    //             }
    //             if(k == nums.length - 1 && sum >= 1){
    //                 flag = false;
    //             }
    //         }
    //     }
    //     return i;
    // }
    // End of Appraoch 1
    
    
    // Approach 2
    // Time Complextiy: O(n)
    // Space Complexity: O(1)
    // Notes: make initial num equals to k, find the min value
    public int minStartValue(int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int sum = 0;
        for(int x : nums){
            sum += x;
            if(sum < minValue){
                minValue = sum;
            }
        }
        return (1 - minValue) < 1? 1: 1 - minValue;
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
            
            int ret = new Solution().minStartValue(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}