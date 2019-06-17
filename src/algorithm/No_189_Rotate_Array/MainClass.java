package algorithm.No_189_Rotate_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public void rotate(int[] nums, int k) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        // edge check
//         if(k == 0){return;}
//         if(nums.length <= 1){return;}
        
//         int[] re = new int[nums.length];
//         for(int i = 0; i < nums.length; i++){
//             int newIndex = (i+k) % nums.length;
//             re[newIndex] = nums[i];
//         }
//         System.arraycopy(re,0,nums,0,nums.length);
        // End of Approach 1
        
        
        // Approach 2
        // Time complexity: O(n*k)
        // Space Complexity: O(1)
        
        // edge check
//         if(k == 0){return;}
//         if(nums.length <= 1){return;}
        
//         for(int i = 0; i < k; i++){
//             int temp = nums[nums.length -1];
//             for(int j = nums.length-1; j > 0;j--){
//                 nums[j] = nums[j-1];
//             }
//             nums[0] = temp;
//         }
        // End of Approach 2
        
        
        
        // Approach 3
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        // edge check
//         if(k == 0){return;}
//         if(nums.length <= 1){return;}
        
//         List<Integer> re = new LinkedList<>();
//         for(int i = 0; i < nums.length; i++){   
//             re.add(nums[i]);
//         }
        
//         List sub = re.subList(nums.length - k%nums.length, nums.length);
//         re.addAll(0, sub);
        
//         for(int j = 0; j < nums.length; j++){
//             nums[j] = re.get(j).intValue();
//         }
        // End of Approach 3
        
        
        // Approach 4 
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
        // edge check
//         k %= nums.length;
//         if(k == 0){return;}
//         if(nums.length <= 1){return;}
        
//         reverseArray(nums,0,nums.length - 1);
//         reverseArray(nums, 0, k - 1);
//         reverseArray(nums, k, nums.length - 1);
        // End of Approach 4
        
        
        
        // Approach 5
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
        // edge check
        k %= nums.length;
        if(k == 0){return;}
        if(nums.length <= 1){return;}
        
        int count = 0;
        for(int i = 0; count < nums.length; i++){
            int start = i;
            int current = i;
            int prev = nums[current];
            do{
                if(count >= nums.length){return;}
                int ind = (current + k) % nums.length;
                int temp = nums[ind];
                nums[ind] = prev;
                prev = temp;
                current = ind;
                count++;
            }while(start != current);
        }
        // End of Approach 5
    }
    
    // Helper for Approach 4
    // public void reverseArray(int[] arr, int start, int end){
    //     while(start < end){
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }
    // End of the helper
    
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
            int k = Integer.parseInt(line);
            
            new Solution().rotate(nums, k);
            String out = integerArrayToString(nums);
            
            System.out.print(out);
        }
    }
}