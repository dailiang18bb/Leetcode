package algorithm.No_040_Combination_Sum_II;

import java.util.*;
import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(2^n)
    // Space Complexity: O(n^2)
    // Notes: backtracking
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0) return new ArrayList();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, new ArrayList<Integer>(), 0, res);
        return res;
    }
    
    private void helper(int[] candidates,
                        int target, 
                        int currSum,
                        List<Integer> path,
                        int start,
                        List res){
        
        if( currSum == target){
            res.add(new ArrayList(path));
        }else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i - 1]){
                    continue;
                }
                if(currSum + candidates[i] > target){
                    return;
                }
                currSum += candidates[i];
                path.add(candidates[i]);
                helper(candidates, target, currSum, path, i+1, res);
                currSum -= candidates[i];
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
            int[] candidates = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            List<List<Integer>> ret = new Solution().combinationSum2(candidates, target);
            
            String out = int2dListToString(ret);
            
            System.out.print(out);
        }
    }
}