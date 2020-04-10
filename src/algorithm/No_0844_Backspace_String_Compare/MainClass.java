package algorithm.No_0844_Backspace_String_Compare;

import com.eclipsesource.json.JsonArray;
import java.io.*;
import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n+m)
    // Space Complexity: O(n+m)
    // Notes: Stack
    
    public boolean backspaceCompare(String S, String T) {
        // Edge, have constrains
        if(S.equals(T)){
            return true;
        }
        return helper(S).equals(helper(T));
    }
    
    private Stack<Character> helper(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '#'){
                s.push(str.charAt(i));
            }else if(!s.isEmpty()){
                s.pop();
            }
        }
        return s;
        // return String.valueOf(s);
    }
    // End of Approach 1
    
    
    
    // Approach 2
    // Time Complexity:
    // Space Complexity:
    // Notes:
    
//     public boolean backspaceCompare(String S, String T) {
//         // Edge
//         if(S.equals(T)){
//             return true;
//         }
//         int sp = S.length() - 1;
//         int tp = T.length() - 1;
//         while(sp < S.length() - 1 && tp < T.length() - 1){
//             if(S.charAt(sp) == '#'){
//                 sp -= 2;
//                 continue;
//             }
//             if(T.charAt(tp) == '#'){
//                 tp -= 2;
//                 continue;
//             }
            
            
//             if(S.charAt(sp) != T.charAt(tp)){
//                 return false;
//             }
//         }
//         return true;
//     }
    // End of Approach 2
}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String S = stringToString(line);
            line = in.readLine();
            String T = stringToString(line);
            
            boolean ret = new Solution().backspaceCompare(S, T);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}