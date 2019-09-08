package algorithm.No_119_Pascals_Triangle_II;

import java.io.*;
import java.util.*;


/*
 * 
 * 
Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 3
Output: [1,3,3,1]
		
		
Follow up:

Could you optimize your algorithm to use only O(k) extra space?

*/

import java.awt.Point;
class Solution {
    // public List<Integer> getRow(int rowIndex) {
        
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
        // List<Integer> row = new LinkedList<>();
        // for(int i = 0; i < rowIndex + 1; i++){
        //     row.add(0,1);
        //     for(int k = 1; k < row.size()-1; k++){
        //         row.set(k, row.get(k) + row.get(k+1));
        //     }
        // }
        // return row;
        // End of Approach 3
    // }
    
    
    // Approach 4
    // Notes: Recursion
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0){return new ArrayList<>();}
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Point, Integer> hm = new HashMap<>();
        for(int i = 0; i <= rowIndex; i++){
            int val = helper(rowIndex, i, hm);
            res.add(val);
        }
        return res;
    }
    
    private int helper(int row, int col, HashMap<Point, Integer> hm){
        if(row == 0 || row == 1){
            return 1;
        }
        if(col == 0 || col == row){
            return 1;
        }
        int one = 0;
        int two = 0;
        if(hm.containsKey(new Point(row - 1, col - 1))){
            one = hm.get(new Point(row - 1, col - 1));
        }else{
            one = helper(row - 1, col - 1, hm);
            hm.put(new Point(row - 1, col - 1), one);
        }
        
        if(hm.containsKey(new Point(row - 1, col))){
            two = hm.get(new Point(row - 1, col));
        }else{
            two = helper(row - 1, col, hm);
            hm.put(new Point(row - 1, col), two);
        }
        return one + two;
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