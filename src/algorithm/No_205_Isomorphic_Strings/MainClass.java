package algorithm.No_205_Isomorphic_Strings;

import java.util.*;
import java.io.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        
//         for(int k = 0; k < 2; k++){
//             Map<Character, Character> hs = new Hashtable<>();
//             for(int i = 0; i < s.length(); i++){
//                 if(!hs.containsKey(s.charAt(i))){
//                     hs.put(s.charAt(i), t.charAt(i));
//                 }else if(!hs.get(s.charAt(i)).equals(t.charAt(i))){
//                     return false;
//                 }
//             }
//             String temp = s;
//             s = t;
//             t = temp;
//         }
        
//         return true;
//         // End of Approach 1
        
        
        // Approach 2
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        // Edge check
        if(s.length() != t.length()){return false;}
        if(s.length() == 0){return true;}
        
        Map<Character, Integer> htS = new Hashtable<>();
        Map<Character, Integer> htT = new Hashtable<>();
        
        for(Integer i = 0; i < s.length(); i++){
            if(htS.put(s.charAt(i), i) != htT.put(t.charAt(i),i)){
                return false;
            }
        }
        return true;
        // End of Approach 2
    }
}

public class MainClass {
//    public static String stringToString(String input) {
//        return JsonArray.readFrom("[" + input + "]").get(0).asString();
//    }
//    
//    public static String booleanToString(boolean input) {
//        return input ? "True" : "False";
//    }
    
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            String s = stringToString(line);
//            line = in.readLine();
//            String t = stringToString(line);
//            
//            boolean ret = new Solution().isIsomorphic(s, t);
//            
//            String out = booleanToString(ret);
//            
//            System.out.print(out);
//        }
    }
}
