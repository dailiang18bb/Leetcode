package algorithm.No_1414_Find_the_Minimum_Number_of_Fibonacci_Numbers_Whose_Sum_Is_K;

import java.io.*;
import java.util.*;

class Solution {
    
    
    // Approach 1
    // Time Complexity:
    // Space Complexity:
    // Notes: DP, 
    public int findMinFibonacciNumbers(int k) {
        // Edge
        //
        HashSet<Integer> fib = new HashSet<>();
        int prev = 1;
        int curr = 1;
        fib.add(prev);
        fib.add(curr);
        while(prev + curr <= k){
            int temp = prev + curr;
            fib.add(temp);
            prev = curr;
            curr = temp;
        }
        
        return helper(k, fib);
        
    }
    
    private int helper(int k, HashSet<Integer> fib){
        if(fib.contains(k)){
            return 1;
        }
        int prev = 1;
        int curr = 1;
        while(prev + curr < k){
            int temp = prev + curr;
            prev = curr;
            curr = temp;
        }
        return helper(k - curr, fib) + 1;
    }
    // End of Approach 1
    
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int k = Integer.parseInt(line);
            
            int ret = new Solution().findMinFibonacciNumbers(k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}