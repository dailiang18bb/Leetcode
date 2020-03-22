package algorithm.No_0035_Search_Insert_Position;

import java.io.*;

class Solution {
    
    // Approach 1:
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    // Notes: recursive binary search
//     public int searchInsert(int[] nums, int target) {
//         //edge
//         if(nums == null || nums.length == 0){
//             return 0;
//         }
//         return helper(nums, target, 0, nums.length - 1);
//     }
    
    
//     public int helper(int[] nums, int target, int left, int right){
//         if(left > right){
//             return left;
//         }
        
//         int mid = left + ((right - left) / 2);
//         if(nums[mid] == target){
//             return mid;
//         }else if(nums[mid] < target){
//             return helper(nums, target, mid + 1, right);
//         }else{
//             return helper(nums, target, left, mid - 1);
//         }
//     }
    // End of Approach 1
    
    
    // Approach 2:
    // Time Complexity: O(logn)
    // Space Complexity:
    // Notes: iteritive binary search
    
    public int searchInsert(int[] nums, int target) {
        //edge
        if(nums == null || nums.length == 0){
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
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
            int target = Integer.parseInt(line);
            
            int ret = new Solution().searchInsert(nums, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}