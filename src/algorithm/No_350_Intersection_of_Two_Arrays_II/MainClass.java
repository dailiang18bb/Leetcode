package algorithm.No_350_Intersection_of_Two_Arrays_II;

import java.io.*;
import java.util.*;


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // Approach 2
        // m = nums1.length
        // n = nums2.length
        // Time Complexity: O(m + n)
        // Space Complexity: O(m + n)
        // Notes: sort
        
        // Edge case
        if(nums1.length == 0 || nums1 == null || nums2.length == 0 || nums2 == null){
            return new int[0];
        }
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while(i<nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                res.add(nums1[i]);
                i++;
                j++;
            }
        }

        // collect result
        int ind = 0;
        int[] result = new int[res.size()];
        for(int x: res){
            result[ind++] = x;
        }
        return result;
        // End of Approach 2
        
        
        
        // Approach 3
        // Time Complexity: O(m + n)
        // Space Complexity: O(m + n)
        
//         // Edge case
//         if(nums1.length == 0 || nums1 == null || nums2.length == 0 || nums2 == null){
//             return new int[0];
//         }
        
//         Map<Integer,Integer> myMap1 = new HashMap<>();
//         List<Integer> res = new ArrayList<>();

//         for(Integer i = 0; i < nums1.length; i++){
//             myMap1.put(nums1[i], myMap1.getOrDefault(nums1[i],0) + 1);
//         }
        
//         for(int k = 0; k < nums2.length; k++){
//             if(myMap1.containsKey(nums2[k])){
//                 res.add(nums2[k]);
//                 int temp = myMap1.get(nums2[k]);
//                 myMap1.put(nums2[k],temp - 1);
//                 myMap1.remove(nums2[k],0);
//             }
//         }
        
//         int[] result = new int[res.size()];
//         int index = 0;
//         for(int x: res){
//             result[index++] = x;
//         }
//         return result;
//         // End of Approach 3
        
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
            
            int[] ret = new Solution().intersect(nums1, nums2);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}