package algorithm.No_0733_Flood_Fill;

import com.eclipsesource.json.JsonArray;
import java.io.*;
import java.util.*;

class Solution {
    
    
    // Approach 1
    // Time Complexity:  O(N)
    // Space Complexity: O(N)
    // Notes: bfs
//     public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
//         Queue<Point> q = new LinkedList<>();
//         q.add(new Point(sr,sc));
//         int oldColor = image[sr][sc];
//         int[][] visited = new int[image.length][image[0].length];
//         while(!q.isEmpty()){
//             int len = q.size();
//             for(int i = 0; i < len; i++){
//                 Point curr = q.poll();
//                 image[curr.x][curr.y] = newColor;
//                 if(isValid(image, visited, curr.x+1, curr.y, oldColor)){
//                     q.add(new Point(curr.x+1, curr.y));
//                     visited[curr.x+1][curr.y] = 1;
//                 }
//                 if(isValid(image, visited, curr.x-1, curr.y, oldColor)){
//                     q.add(new Point(curr.x-1, curr.y));
//                     visited[curr.x-1][curr.y] = 1;
//                 }
//                 if(isValid(image, visited, curr.x, curr.y+1, oldColor)){
//                     q.add(new Point(curr.x, curr.y+1));
//                     visited[curr.x][curr.y+1] = 1;
//                 }
//                 if(isValid(image, visited, curr.x, curr.y-1, oldColor)){
//                     q.add(new Point(curr.x, curr.y-1));
//                     visited[curr.x][curr.y-1] = 1;
//                 }
//             }
//         }
//         return image;
//     }
    
//     private boolean isValid(int[][] image, int[][] visited,int x, int y, int oldColor){
//         if(x<0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] != oldColor || visited[x][y] == 1){
//             return false;
//         }else{
//             return true;
//         }
//     }
    
//     class Point{
//         int x;
//         int y;
//         Point(int x, int y){
//             this.x = x;
//             this.y = y;
//         }
//     }
    // End of Approach 1
    
    
    
    // Approach 2
    // Time Complexity: O(mn)
    // Space Complexity: O(mn)
    // Notes: DFS, no need for visited array, cus color changed.
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int sameColor = image[sr][sc];
        if(sameColor == newColor){
            return image; // if the start color equals new color, then the image stays the same.
        }
        helper(image, sr, sc, newColor, sameColor);
        return image;
    }
    
    private void helper(int[][] image, int x, int y, int newColor, int sameColor){
        if(x<0 || y<0 || x >= image.length || y>= image[0].length || image[x][y] != sameColor){
            return;
        }
        image[x][y] = newColor;
        helper(image, x+1, y, newColor, sameColor);
        helper(image, x-1, y, newColor, sameColor);
        helper(image, x, y+1, newColor, sameColor);
        helper(image, x, y-1, newColor, sameColor);
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
    
    public static String int2dArrayToString(int[][] array) {
        if (array == null) {
            return "null";
        }
        if (array.length == 0) {
            return "[]";
        }
    
        StringBuilder sb = new StringBuilder("[");
        for (int[] item : array) {
            //sb.append(Integer.toString(item));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[][] image = stringToInt2dArray(line);
            line = in.readLine();
            int sr = Integer.parseInt(line);
            line = in.readLine();
            int sc = Integer.parseInt(line);
            line = in.readLine();
            int newColor = Integer.parseInt(line);
            
            int[][] ret = new Solution().floodFill(image, sr, sc, newColor);
            
            String out = int2dArrayToString(ret);
            
            System.out.print(out);
        }
    }
}