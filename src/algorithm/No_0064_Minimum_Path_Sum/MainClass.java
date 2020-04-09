package algorithm.No_0064_Minimum_Path_Sum;


import java.io.*;
import com.eclipsesource.json.JsonArray;


class Solution {
    
    // Approach 1
    // Time Complexity: O(row * col)
    // Space Complexity: O(row * col)
    // Notes: DP, current min + current value
    
//     public int minPathSum(int[][] grid) {
//         // Edge
//         if(grid == null || grid.length == 0){
//             return 0;
//         }
        
//         int[][] res = new int[grid.length][grid[0].length];
//         res[0][0] = grid[0][0];
//         for(int i = 1; i < grid[0].length; i++){
//             res[0][i] = res[0][i - 1] + grid[0][i];
//         }
//         for(int i = 1; i < grid.length; i++){
//             res[i][0] = res[i - 1][0] + grid[i][0];
//         }
        
//         for(int i = 1 ; i < grid.length; i++){
//             for(int k = 1; k < grid[0].length; k++){
//                 res[i][k] = Math.min(res[i-1][k], res[i][k-1]) + grid[i][k];
//             }
//         }
//         return res[res.length - 1][res[0].length -1];
        
//     }
    // End of Approach 1
    
    
    // Approach 2
    // Notes: Recursive
    public int minPathSum(int[][] grid) {
        //Edge
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        return helper(grid, new int[grid.length][grid[0].length], grid.length - 1, grid[0].length -1);
    }
    
    private int helper(int[][] grid, int[][] res, int row, int col){
        if(row < 0 || col < 0){
            return 0;
        }
        if(row == 0){
            res[row][col] = helper(grid, res, row, col - 1) + grid[row][col];
        }
        if(col == 0){
            res[row][col] = helper(grid, res, row - 1, col) + grid[row][col];
        }
        if(res[row][col] == 0){
            res[row][col] = grid[row][col] + Math.min(helper(grid,res,row - 1, col), helper(grid, res, row, col - 1));
        }
        
        return res[row][col];
    }
    
    // End of Approach 2

    
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
    
    public static int[][] stringToInt2dArray(String input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray.size() == 0) {
          return new int[0][0];
        }
    
        int[][] arr = new int[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
          JsonArray cols = jsonArray.get(i).asArray();
          arr[i] = stringToIntegerArray(cols.toString());
        }
        return arr;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[][] grid = stringToInt2dArray(line);
            
            int ret = new Solution().minPathSum(grid);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}