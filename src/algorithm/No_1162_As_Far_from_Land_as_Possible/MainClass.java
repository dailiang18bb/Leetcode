package algorithm.No_1162_As_Far_from_Land_as_Possible;

import com.eclipsesource.json.JsonArray;
import java.util.*;
import java.io.*;


class Solution {
    
    // Approach 1
    // Time Complexity:O(n^4)
    // Space Complexity: O(n^2)
    // Notes: BFS, run bfs on every water cell
//     public int maxDistance(int[][] grid) {
//         //Edge
//         if(grid.length == 1 && grid[0].length == 1){
//             return -1;
//         }
        
//         int max = -1;
//         for(int i = 0; i < grid.length; i++){
//             for(int j = 0; j < grid[0].length; j++){
//                 if(grid[i][j] == 0){
//                     int t = bfs(grid, new int[grid.length][grid[0].length], new Point(i,j));
//                     max = Math.max(max, t);
//                 }
//             }
//         }
//         return max;
//     }
    
//     class Point{
//         int x;
//         int y;
//         Point(int x, int y){
//             this.x = x;
//             this.y = y;
//         }
//     }
//     public int bfs(int[][] grid, int[][] visit, Point root){
//         Queue<Point> q = new LinkedList<>();
//         q.add(root);
//         visit[root.x][root.y] = 1;
//         while(!q.isEmpty()){
//             int len = q.size();
//             for(int i = 0; i < len; i++){
//                 Point curr = q.poll();
//                 //visit
//                 if(grid[curr.x][curr.y] == 1){
//                     return Math.abs(root.x - curr.x) + Math.abs(root.y - curr.y);
//                 }
//                 // add q
//                 if(curr.x - 1 >=0 && visit[curr.x - 1][curr.y] == 0){
//                     q.add(new Point(curr.x - 1, curr.y));
//                     visit[curr.x - 1][curr.y] = 1;
//                 }
//                 if(curr.y - 1 >=0 && visit[curr.x][curr.y - 1] == 0){
//                     q.add(new Point(curr.x, curr.y - 1));
//                     visit[curr.x][curr.y - 1] = 1;
//                 }
//                 if(curr.x + 1 < grid.length && visit[curr.x + 1][curr.y] == 0){
//                     q.add(new Point(curr.x + 1, curr.y));
//                     visit[curr.x + 1][curr.y] = 1;
//                 }
//                 if(curr.y + 1 < grid[0].length && visit[curr.x][curr.y + 1] == 0){
//                     q.add(new Point(curr.x, curr.y + 1));
//                     visit[curr.x][curr.y + 1] = 1;
//                 }
//             }
//         }
//         return -1;
//     }
    // End of Approach 1
    
    
    
    // Approach 2
    // Time Complexity: O(mn)
    // Space Complexity: O(mn)
    // Notes: BFS, just once
    public int maxDistance(int[][] grid) {
        Queue<Point> q = new LinkedList<>();
        int[][] visit = new int[grid.length][grid[0].length];
        // add all land
        for(int i = 0; i < grid.length; i++){
            for(int j = 0;j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    q.add(new Point(i,j));
                    visit[i][j] = 1;
                }
            }
        }
        // bfs steps
        int steps = -1;
        while(!q.isEmpty()){
            int len = q.size();
            steps++;
            for(int k = 0; k < len; k++){
                Point curr = q.poll();
                //visit
                //q.add
                if(curr.x - 1 >=0 && visit[curr.x - 1][curr.y] == 0){
                    q.add(new Point(curr.x - 1, curr.y));
                    visit[curr.x - 1][curr.y] = 1;
                }
                if(curr.y - 1 >=0 && visit[curr.x][curr.y - 1] == 0){
                    q.add(new Point(curr.x, curr.y - 1));
                    visit[curr.x][curr.y - 1] = 1;
                }
                if(curr.x + 1 < grid.length && visit[curr.x + 1][curr.y] == 0){
                    q.add(new Point(curr.x + 1, curr.y));
                    visit[curr.x + 1][curr.y] = 1;
                }
                if(curr.y + 1 < grid[0].length && visit[curr.x][curr.y + 1] == 0){
                    q.add(new Point(curr.x, curr.y + 1));
                    visit[curr.x][curr.y + 1] = 1;
                }
            }
        }
        // max steps
        return steps == 0? -1 : steps;
    }
    
    
    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
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
            
            int ret = new Solution().maxDistance(grid);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}