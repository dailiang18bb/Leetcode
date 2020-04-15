package algorithm.No_0213_House_Robber_II;

import java.io.*;

class Solution {
    
    // Appraoch 1
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: divided into two sub-problem, rob(0, nums.length-2), rob(1, nums.length - 1)
    public int rob(int[] nums) {
        // Edge
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length== 1){
            return nums[0];
        }
        //
        
        int[] memoZero = new int[nums.length];
        int[] memoOne = new int[nums.length];
        memoZero[0] = nums[0];
        for(int i = 1; i < nums.length - 1; i++){
            if(i < 2){
                memoZero[i] = Math.max(nums[i - 1], nums[i]);
            }else{
                memoZero[i] = Math.max(memoZero[i - 2] + nums[i], memoZero[i-1]);
            }
        }
        memoOne[1] = nums[1];
        for(int i = 2; i < nums.length ; i++ ){
            if(i < 3){
                memoOne[i] = Math.max(nums[i-1], nums[i]);
            }else{
            memoOne[i] = Math.max(memoOne[i - 2] + nums[i], memoOne[i-1]);
            }
        }
        return Math.max(memoZero[nums.length - 2], memoOne[nums.length - 1]);
    }
    // End of Appraoch 1
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
            
            int ret = new Solution().rob(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}