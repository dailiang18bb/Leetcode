package algorithm.No_046_Permutations;

import java.util.*;
import java.io.*;

class Solution {
    
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity: O(n!)
    // Notes: backtracking
    
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();        
        helper(nums, new boolean[nums.length], new ArrayList<Integer>(), res);
        return res;
    }
    
    private void helper(int[] nums, boolean[] visited, List<Integer> path, List<List<Integer>> res){
        
        if(path.size() == nums.length ){
            res.add(new ArrayList(path));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(visited[i]){
                    continue;
                }
                path.add(nums[i]);
                visited[i] = true;
                helper(nums, visited, path, res);
                visited[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
    // End of Approach 1
    
    
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
    
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            List<List<Integer>> ret = new Solution().permute(nums);
            
            String out = int2dListToString(ret);
            
            System.out.print(out);
        }
    }
}