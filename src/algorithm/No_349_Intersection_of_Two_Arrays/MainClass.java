package algorithm.No_349_Intersection_of_Two_Arrays;


import java.util.*;
import java.io.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
//         // Edge check:
//         if(nums1.length == 0 || nums2.length == 0){
//             return new int[0];
//         }
        
//         Set<Integer> hs1 = new HashSet<>();
//         Set<Integer> hs2 = new HashSet<>();
//         List<Integer> re = new ArrayList<>();
        
//         for(Integer x : nums1){
//             hs1.add(x);
//         }
        
//         for(Integer x : nums2){
//             hs2.add(x);
//         }
        
//         for(Integer x : hs1){
//             if(hs2.contains(x)){
//                 re.add(x);
//             }
//         }
        
//         int[] result = new int[re.size()];
//         for(int i = 0; i < result.length; i++){
//             result[i] = re.get(i).intValue();
//         }
        
//         return result;
//         // End of Approach 1
        
        // Approach 2
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // Notes: Use Java Set, retainAll()
        
        // Edge check:
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        
        for(Integer x : nums1){
            hs1.add(x);
        }
        
        for(Integer x : nums2){
            hs2.add(x);
        }
        
        hs1.retainAll(hs2);
        int[] re = new int[hs1.size()];
        int ind = 0;
        for(int x : hs1){
            re[ind++] = x;
        }
        return re;
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
            int[] nums1 = stringToIntegerArray(line);
            line = in.readLine();
            int[] nums2 = stringToIntegerArray(line);
            
            int[] ret = new Solution().intersection(nums1, nums2);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}