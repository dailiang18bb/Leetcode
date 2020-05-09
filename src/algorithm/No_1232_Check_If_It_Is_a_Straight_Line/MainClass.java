package algorithm.No_1232_Check_If_It_Is_a_Straight_Line;

import com.eclipsesource.json.JsonArray;
import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Notes: brute force
    public boolean checkStraightLine(int[][] coordinates) {
        // Edge
        // 
        double prev = 0;
        double temp;
        for(int i = 1; i < coordinates.length; i++){
            if(coordinates[i][0] - coordinates[0][0] == 0){
                temp = coordinates[i][0] - coordinates[0][0];
            }else{
                temp = (double)(coordinates[i][1] - coordinates[0][1]) / (coordinates[i][0] - coordinates[0][0]);
            }
            if(i >=2 && temp != prev){
                return false;
            }
            prev = temp;
        }
        return true;
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[][] coordinates = stringToInt2dArray(line);
            
            boolean ret = new Solution().checkStraightLine(coordinates);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}