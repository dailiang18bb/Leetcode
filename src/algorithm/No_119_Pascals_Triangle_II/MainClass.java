package algorithm.No_119_Pascals_Triangle_II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        //Approach 1
        // time out
        
//         //edge check
//         List<Integer> re = new ArrayList<>();

//         if(rowIndex == 0){
//             re.add(1);
//             return re;
//         }
//         if(rowIndex == 1){
//             re.add(1);
//             re.add(1);
//             return re;
//         }
        
//         for(int i = 0; i < rowIndex+1; i++){
//             if(i == 0 || i == rowIndex){
//                 re.add(i,1);
//             }else{
//                 int sum = getRow(rowIndex-1).get(i-1) + getRow(rowIndex-1).get(i);
//                 re.add(i,sum);
//             }
//         }
//         return re;
        // End of Approach 1
        
        // Approach 2
        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
        // Notes : Add to the end of an ArrayList,cost(O(1)), then use backward search
        
        // List<Integer> row = new ArrayList<>();
        // for(int i = 0; i < rowIndex + 1; i++){
        //     row.add(1);
        //     for(int k = row.size()-2; k > 0; k--){
        //         row.set(k, row.get(k-1) + row.get(k));
        //     }
        // }
        // return row;
        // End of Approach 2
        
        
        // Approach 3
        // Time Complexity : O(n^2)
        // Space Complexity: O(n)
        // Notes: Add to the anywhere of a LinkedList cost(O(1)), the use positive search
        List<Integer> row = new LinkedList<>();
        for(int i = 0; i < rowIndex + 1; i++){
            row.add(0,1);
            for(int k = 1; k < row.size()-1; k++){
                row.set(k, row.get(k) + row.get(k+1));
            }
        }
        return row;
        // End of Approach 3
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int rowIndex = Integer.parseInt(line);
            
            List<Integer> ret = new Solution().getRow(rowIndex);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}