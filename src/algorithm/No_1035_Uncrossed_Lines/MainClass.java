package algorithm.No_1035_Uncrossed_Lines;

import java.io.*;
import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(mn) ,m = A.length, n = B.length
    // Space Complexity: O(mn) , dp array
    // public int maxUncrossedLines(int[] A, int[] B) {
    //     int[][] dp = new int[A.length + 1][B.length + 1];
    //     for(int i = 1; i < dp.length; i++){
    //         for(int j = 1; j < dp[0].length; j++){
    //             if(A[i - 1] == B[j - 1]){
    //                 dp[i][j] = dp[i - 1][j - 1] + 1;   
    //             }else{
    //                 dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
    //             }
    //         }
    //     }
    //     return dp[dp.length - 1][dp[0].length - 1];
    // }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity:
    // Space Complexity:
    public int maxUncrossedLines(int[] A, int[] B) {
        int[][] dp = new int[A.length][B.length];
        for(int[] x : dp){
            Arrays.fill(x, -1);
        }
        return helper(A, B, A.length - 1, B.length - 1, dp);
    }
    
    private int helper(int[] A, int[] B, int i, int j, int[][] dp){
        // check bound
        if(i<0 || j<0 ){
            return 0;
        }
        // cache
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        // recursive
        if(A[i] == B[j]){
            dp[i][j] = helper(A, B, i-1, j-1, dp) + 1;
        }else{
            dp[i][j] = Math.max(helper(A, B, i-1, j, dp), helper(A, B, i, j-1, dp));
        }
        return dp[i][j];
    }
    // End of Approach 2
    
}


/*
dp

   " 2 5 1 2 5
"  0 0 0 0 0 0
10 0 0 0 0 0 0
5  0 0 1 1 1 1
2  0 1 1 1 2 2
1  0 1 1 2 2 2
5  0 1 1 2 2 3
2  0 1 1 2 3 3

for(j){
    for(i){
    if(equals){
    dp[i][j] = dp[i-1][j-1] + 1
    }else{
    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j-1])
    }
    }
}

recursion

dp(int[] A, int[] B, int i, int j, int[][] dpArr){
    // check bound
    if(i < 0 || j < 0 || i >= ){}
    
    if(dp[i][j] != -1){
        return dp[i][j];
    }
    
    //
    if(A[i] == B[j]){
      dp[i][j] = dp(A, B, i-1, j - 1, dpArr) + 1;
    }else{
        dp[i][j] = Math.max(dp(A, B, i, j - 1, dpArr), dp(A, B, i-1, j, dpArr));
    }
    return dp[i][j];
    
}


*/

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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] A = stringToIntegerArray(line);
            line = in.readLine();
            int[] B = stringToIntegerArray(line);
            
            int ret = new Solution().maxUncrossedLines(A, B);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}