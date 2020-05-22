package algorithm.No_1277_Count_Square_Submatrices_with_All_Ones;

import com.eclipsesource.json.JsonArray;
import java.io.*;


class Solution {
    // Approach1
    // Exceed time limit
//     public int countSquares(int[][] matrix) {
        
//         int result = 0;
//         int r = matrix.length;
//         int c = matrix[0].length;
//         int min = Math.min(r,c);
        
//         for(int k = 1; k <= min; k++){
//             for(int i = 0; i < r; i++){
//                 for(int j = 0; j < c; j++){
//                     if(matrix[i][j] == 1){
//                         result += helper(matrix, i, j, k);
//                     }
//                 }
//             }
//         }
//         return result;
//     }
    
//     private int helper(int[][] matrix, int i, int j, int side){
//         for(int x = i; x < i + side; x++){
//             for(int y = j; y < j + side; j++){
//                 if(x > matrix.length || y > matrix[0].length || matrix[x][y] != 1){
//                     return 0;
//                 }
//             }
//         }
//         return 1;
//     }
    // End of Approach 1
    
    
    // Approach 2
    public int countSquares(int[][] matrix) {
        int result = 0;
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length; c++){
                if(r == 0 || c == 0){
                    result += matrix[r][c];
                }else if(matrix[r][c] == 1){
                    matrix[r][c] = Math.min(matrix[r-1][c], Math.min(matrix[r-1][c-1], matrix[r][c-1])) + matrix[r][c];
                    result += matrix[r][c];
                }
            }
        }
        return result;
    }
/*
[ 
  [0,0,0],
  [0,1,0],
  [0,1,0],
  [1,1,1],
  [1,1,0]
  ]
  
  [ 
  [0,0,0],
  [0,1,0],
  [0,1,0],
  [1,1,1],
  [1,2,0]
  ]
*/

    
    
}



/*
Job
find total number of squares which full of 1s

Example:
Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
side 1 =>
side 2 =>
side 3 =>

Input: matrix = 
[
  [1,1,0],
  [1,1,1],
  [0,1,1]
]
side 1


Algo=>
n is the row length,
m is the col length
side from 1 to min(n,m)
sum all
O(m*n*min(n,m)*side^2)

for(k [1, min(n,m)])){
    for(i [0,m]){
        for(j [0,n]){
            //found 1, search the square    
            // count += helper(matrix, r, c, side);
        }
    }
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
            int[][] matrix = stringToInt2dArray(line);
            
            int ret = new Solution().countSquares(matrix);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
