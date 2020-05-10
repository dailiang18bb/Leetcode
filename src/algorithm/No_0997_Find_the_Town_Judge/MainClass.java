package algorithm.No_0997_Find_the_Town_Judge;

import com.eclipsesource.json.JsonArray;
import java.io.*;
import java.util.*;


class Solution {
    
    // Approach 1
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: Graph
    
    public int findJudge(int N, int[][] trust) {
        // Edge
        if(N == 1){
            return 1;
        }
        HashSet<Integer> hs = new HashSet<>();
        int[] count = new int[N + 1];
        int temp = 0;
        for(int i = 0; i < trust.length; i++){
            hs.add(trust[i][0]);
            count[trust[i][1]]++;
            if(count[trust[i][1]] == N - 1){
                temp = trust[i][1];
            }
        }
        return hs.contains(temp)? -1 : temp==0 ? -1: temp;
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
            int N = Integer.parseInt(line);
            line = in.readLine();
            int[][] trust = stringToInt2dArray(line);
            
            int ret = new Solution().findJudge(N, trust);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}