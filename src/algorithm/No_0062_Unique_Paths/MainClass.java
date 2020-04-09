package algorithm.No_0062_Unique_Paths;

import java.io.*;
class Solution {
    
    // Approach 1
    // Time Complexity: O(mn)
    // Space Complexity: O(mn)
    // Notes: DP, Memoization

//     public int uniquePaths(int m, int n) {
//         // Edge
//         if(m == 1 && n ==1){
//             return 1;
//         }
//         return helper(n - 1, m - 1, new HashMap<Point, Integer>());
//     }
    
//     private int helper(int row, int col, HashMap<Point, Integer> memo){
//         if(row < 0 || col < 0){
//             return 0;
//         }
//         if(row == 0 || col == 0){
//             return 1;
//         }
//         Point p = new Point(row, col);
//         if(!memo.containsKey(p)){
//             memo.put(p, helper(row - 1, col, memo) + helper(row, col - 1, memo));
//         }
//         return memo.get(p);
//     }
    // End of Approach 1
    
    
    
    // Approach 2
    // Notes: Use 2D array to store the value
//     public int uniquePaths(int m, int n) {
//         // Edge
//         if(m == 1 && n ==1){
//             return 1;
//         }
//         return helper(n - 1, m - 1, new int[n][m]);
//     }
    
//     private int helper(int row, int col, int[][] memo){
//         if(row < 0 || col < 0){
//             return 0;
//         }
//         if(row == 0 || col == 0){
//             return 1;
//         }
        
//         if(memo[row][col] == 0){
//             memo[row][col] = helper(row - 1, col, memo) + helper(row, col - 1, memo);
//         }
//         return memo[row][col];
//     }
    // End of Approach 2
    
    
    
    // Approach 3
    // Time Complexity: O(mn)
    // Space Complexity: O(mn)
    // Notes: 
    public int uniquePaths(int m, int n) {
        // Edge
        if(m == 1 && n ==1){
            return 1;
        }
        
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr[0].length; i++){
            arr[0][i] = 1;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i][0] = 1;
        }
        
        for(int i = 1; i < arr.length; i++){
            for(int k = 1; k < arr[0].length; k++ ){
                arr[i][k] = arr[i - 1][k] + arr[i][k - 1];
            }
        }
        return arr[n - 1][m -1];
    }
    
    
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int m = Integer.parseInt(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            int ret = new Solution().uniquePaths(m, n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
