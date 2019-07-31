package algorithm.No_994_Rotting_Oranges;

import java.util.*;
import java.io.*;
import com.eclipsesource.json.*;


class Solution {
    public int orangesRotting(int[][] grid) {
        
        // Approach 1
        // N is the number of cells in the grid
        // Time Complexity: O(N)
        // Space Complexity: O(N)
        // Nortes: BFS
        
        // Edge
        if(grid == null) return 0;
        
        // get all rotten oranges
        Queue<Integer> queue = new LinkedList<>();
        int mins = 0;
        int numOne = 0;
        int size = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    numOne++;
                }else if(grid[i][j] == 2){
                    queue.add(i);
                    queue.add(j);
                }
            }
        }
        if(numOne == 0) return 0;
        
        
        // Process rotten
        size = queue.size() / 2;
        while(!queue.isEmpty()){
            mins++;
            size = queue.size() / 2;
            for(int k = 0; k < size; k++){
                int a = queue.poll();
                int b = queue.poll();
                numOne = infect(grid, numOne, queue, a - 1, b); // top
                numOne = infect(grid, numOne, queue, a, b - 1); // left
                numOne = infect(grid, numOne, queue, a, b + 1); // right
                numOne = infect(grid, numOne, queue, a + 1, b); // bottom                
                if(numOne == 0) return mins;
            }
        }
        return -1;
    }
    
    // helper
    public int infect(int[][] grid, int numOne, Queue<Integer> queue, int a, int b){
        int height = grid.length;
        int width = grid[0].length;
        if(a>=0 && a<height && b>=0 && b<width && grid[a][b]==1){
            grid[a][b] = 2;
            numOne--;
            queue.add(a);
            queue.add(b);
        }
        return numOne;
    }
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
            
            int ret = new Solution().orangesRotting(grid);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}