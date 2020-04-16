package algorithm.No_0120_Triangle;

import com.eclipsesource.json.JsonArray;
import java.util.*;
import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity:
    // Notes: Top down
    
//     public int minimumTotal(List<List<Integer>> triangle) {
//         // Edge
//         if(triangle == null || triangle.size() == 0){
//             return 0;
//         }
//         if(triangle.size() == 1){
//             return triangle.get(0).get(0);
//         }
//         //
        
//         List<Integer> prev = new ArrayList<>();
//         prev.add(0, triangle.get(0).get(0));
//         for(int i = 1; i < triangle.size(); i++){
//             List<Integer> curr = new ArrayList<>();
//             for(int k = 0; k < triangle.get(i).size(); k++){
//                 int sum = 0;
//                 if(k > 0 && k < triangle.get(i).size()-1){
//                     sum = Math.min(prev.get(k) + triangle.get(i).get(k), prev.get(k - 1) + triangle.get(i).get(k));
//                 }else if(k == 0){
//                     sum = prev.get(k) + triangle.get(i).get(k);
//                 }else{
//                     sum = prev.get(k - 1) + triangle.get(i).get(k);
//                 }
//                 curr.add(sum);
//             }
//             prev = curr;
//         }
        
//         int min = Integer.MAX_VALUE;
//         for(int x : prev){
//             if(x < min){
//                 min = x;
//             }
//         }
//         return min;
//     }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity:
    // Space Complexity:
    // Notes: Bottom-up
    public int minimumTotal(List<List<Integer>> triangle) {
        // Edge
        if(triangle == null || triangle.size() == 0){
            return 0;
        }
        
        
        int[] arr = new int[triangle.get(triangle.size() - 1).size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = triangle.get(triangle.size() - 1).get(i);
        }
        
        for(int i = triangle.size() - 1; i > 0; i--){
            for(int k = 0; k < i; k++ ){
                arr[k] = triangle.get(i - 1).get(k) + Math.min(arr[k], arr[k+1]);
            }
        }
        return arr[0];
    }
    // End of Approach 2


    
}

public class MainClass {
    private static List<Integer> stringToIntegerList(String input) {
      JsonArray jsonArray = JsonArray.readFrom(input);
      List<Integer> arr = new ArrayList<>(jsonArray.size());
      for (int i = 0; i < jsonArray.size(); i++) {
        arr.add(jsonArray.get(i).asInt());
      }
      return arr;
    }
    
    public static List<List<Integer>> stringToInt2dList(String input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray.size() == 0) {
          return new ArrayList<List<Integer>>();
        }
    
        List<List<Integer>> list = new ArrayList<>(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++) {
          JsonArray cols = jsonArray.get(i).asArray();
          list.add(stringToIntegerList(cols.toString()));
        }
        return list;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            List<List<Integer>> triangle = stringToInt2dList(line);
            
            int ret = new Solution().minimumTotal(triangle);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
