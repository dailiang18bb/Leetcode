package algorithm.No_118_Pascals_Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        // Approach 1
        // Time Complexity: O(numRows^2)
        // Space Complexity:O(numRows^2)
        
        List<List<Integer>> re = new ArrayList<>();
        //edge check
        if(numRows == 0){ return re;}
        
        for(int i = 0; i< numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int k = 0; k <= i; k++){
                if(k == 0 || k == i){
                    row.add(k,1);
                }else{
                    int sum = re.get(i-1).get(k-1) + re.get(i-1).get(k);
                    row.add(k,sum);
                }
            }
            re.add(row);
        }
        return re;
        // End of Approach 1
        
        
        
    }
}

public class MainClass {
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
            int numRows = Integer.parseInt(line);
            
            List<List<Integer>> ret = new Solution().generate(numRows);
            
            String out = int2dListToString(ret);
            
            System.out.print(out);
        }
    }
}