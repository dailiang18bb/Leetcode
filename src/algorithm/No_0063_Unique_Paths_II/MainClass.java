package algorithm.No_0063_Unique_Paths_II;

import java.io.*;
import com.eclipsesource.json.JsonArray;

class Solution {
    
    
    // Approach 1
    // Time Complexity: O(row * col)
    // Space Complexity: O(row * col)
    // Notes: DP 
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Edge
        if(obstacleGrid == null || obstacleGrid.length == 0){
            return 0;    
        }
        
        int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];
        
        for(int i = 0; i < obstacleGrid[0].length; i++){
            if(obstacleGrid[0][i] == 1){
                arr[0][i] = 0;
                break;
            }else{
                arr[0][i] = 1;
            }
        }
        
        for(int i = 0; i < obstacleGrid.length; i++){
            if(obstacleGrid[i][0] == 1){
                arr[i][0] = 0;
                break;
            }else{
                arr[i][0] = 1;
            }
        }
        
        for(int i = 1; i < arr.length; i++ ){
            for(int k = 1; k < arr[0].length; k++){
                if(obstacleGrid[i][k] == 1){
                    arr[i][k] = 0;
                }else{
                    arr[i][k] = arr[i - 1][k] + arr[i][k - 1];
                }
            }
        }
        return arr[arr.length - 1][arr[0].length - 1];
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
            int[][] obstacleGrid = stringToInt2dArray(line);
            
            int ret = new Solution().uniquePathsWithObstacles(obstacleGrid);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}