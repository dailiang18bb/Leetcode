package algorithm.No_0771_Jewels_and_Stones;


import java.io.*;
import java.util.*;

import com.eclipsesource.json.JsonArray;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes:
//     public int numJewelsInStones(String J, String S) {
//         // Edge
//         if(J == null || J.length() == 0 || S == null || S.length() == 0){
//             return 0;
//         }
//         //
        
//         HashMap<Character, Integer> hm = new HashMap<>();
//         for(Character x : S.toCharArray()){
//             hm.put(x, hm.getOrDefault(x, 0) + 1);
//         }
//         int res = 0;
//         for(Character y : J.toCharArray()){
//             res += hm.getOrDefault(y, 0);
//         }
//         return res;
//     }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity:
    // Space Complexity:
    // Notes:
    public int numJewelsInStones(String J, String S) {
        // Edge
        if(J == null || J.length() == 0 || S == null || S.length() == 0){
            return 0;
        }
        //
        HashSet<Character> hs = new HashSet<>();
        for(Character x : J.toCharArray()){
            hs.add(x);
        }
        int res = 0;
        for(char y : S.toCharArray()){
            if(hs.contains(y)){
                res++;
            }
        }
        return res;
    }
    // End of Approach 2
}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String J = stringToString(line);
            line = in.readLine();
            String S = stringToString(line);
            
            int ret = new Solution().numJewelsInStones(J, S);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}