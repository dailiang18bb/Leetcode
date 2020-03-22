package algorithm.No_1389_Create_Target_Array_in_the_Given_Order;

import java.io.*;
import java.util.*;


class Solution {
    
    
    // Approach 1
    // Time Complexity: O(n), where n is the length of nums or index
    // Space Complexity: O(n)
    // Notes:
    public int[] createTargetArray(int[] nums, int[] index) {
        // edge
        if(nums.length == 1){
            return nums;
        }
        
        int[] res = new int[nums.length];
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            li.add(index[i], nums[i]);
        }
        // Iterator<Integer> iter = li.iterator();
        for(int i = 0; i < res.length; i++){
            // res[i] = iter.next().intValue();
            res[i] = li.get(i);
        }
        return res;
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
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int[] index = stringToIntegerArray(line);
            
            int[] ret = new Solution().createTargetArray(nums, index);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}