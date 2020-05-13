package algorithm.No_0540_Single_Element_in_a_Sorted_Array;


import java.io.*;


class Solution {
    
    // Approach 1
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    // Notes: Binary Search
    public int singleNonDuplicate(int[] nums) {
        // Edge
        if(nums.length == 1){
            return nums[0];
        }
        //
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(mid % 2 == 0 ){ // even
                if(nums[mid] == nums[mid+1]){
                    left = mid + 2;
                }else{
                    right = mid - 1;
                }
            }else{ //odd
                if(nums[mid] == nums[mid - 1]){
                    left = mid + 1;
                }else{
                    right = mid -2;
                }
            }
        }
        return nums[left];
    }
    // End of Approach 1
    
    
    
    // Approach 2
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    // Notes: brute force
//     public int singleNonDuplicate(int[] nums) {
        
//         for(int i = 0; i < nums.length; i++){
//             if(i == nums.length - 1){
//                 return nums[i];
//             }
//             if(nums[i] == nums[i+1]){
//                 i++;
//             }else{
//                 return nums[i];
//             }
//         }
//         return nums[0];
//     }
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
            
            int ret = new Solution().singleNonDuplicate(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}