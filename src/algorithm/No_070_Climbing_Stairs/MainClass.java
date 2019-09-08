package algorithm.No_070_Climbing_Stairs;

import java.io.*;
import java.util.*;

/*
 * 
 * 

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/

class Solution {
    
    // Approach 1
    // Time Complexity: O(2^n)
    // Space Complexity: O(2^n)
    // Notes: Recursion
    
//     public int climbStairs(int n) {
//         int res = 0;
//         return helper(0, n, res);
//     }
    
//     private int helper(int curr, int n, int res){
//         if(curr == n){
//             return res + 1;
//         }
//         if(curr > n){
//             return res;
//         }
//         for(int i = 1; i <=2; i++){
//             curr = curr + i;
//             res = helper(curr, n, res);
//             curr = curr - i;
//         }
//         return res;
//     }
    // End of Approach 1
    
    
    // Approach 2
    // Notes: F(n) = F(n - 1) + F(n - 2);
    // becase you can only make 1 or 2 steps at a turn
    
    public int climbStairs(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        return helper(n, hm);
        
    }
    private int helper(int n, HashMap<Integer, Integer> hm){
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        if(n < 4){
            return n;
        }
        int val = helper(n - 1, hm) + helper(n - 2, hm);
        hm.put(n, val);
        return val;
    }
    // End of Approach 2
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().climbStairs(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}