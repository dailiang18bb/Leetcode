package algorithm.No_034_Find_First_and_Last_Position_of_Element_in_Sorted_Array;


import java.io.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Notes: Linear search
        
        
        // Edge
//         if(nums == null || nums.length == 0) return new int[]{-1,-1};
        
//         int left = nums.length;
//         int right = 0;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == target){
//                 if( i < left){
//                     left = i;
//                 } 
//                 if(i > right){
//                     right = i;
//                 }
//             }
//         }
//         if(left == nums.length && right == 0) return new int[]{-1,-1};
//         return new int[]{left, right};
        // End of Approach 1
        
        
        
        // Approach 2
        // Time Complexity:
        // Space Complexity:
        // Notes: Binary Search
        
        // Edge
        
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= target){
                right = mid;
            } else{
                left = mid + 1;
            }
        }
        if(nums[left] != target) return new int[]{-1,-1};
        int leftInd = left;
        
        right = nums.length - 1;
        
        while(left + 1 < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target){
                right = mid;
            }else{
                left = mid;
            }
        }
        
        if(nums[right] == target) return new int[]{leftInd, right};
        return new int[]{leftInd, left};
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
            int[] nums = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int[] ret = new Solution().searchRange(nums, target);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}