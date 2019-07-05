package algorithm.No_387_First_Unique_Character_in_a_String;

import java.io.*;
import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Conplexity: O(1) // 'z' - 'a'
        
        // Edge case
        if(s.length() == 0 || s == null){
            return -1;
        }
        
        
        Map<Character, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            int temp = hashmap.getOrDefault(s.charAt(i), 0); 
            hashmap.put(s.charAt(i), temp + 1);
        }
        
        
        for(int k = 0; k < s.length(); k++){
            if(hashmap.get(s.charAt(k)) == 1){
                return k;
            }
        }
        return -1;
        // End of Approach 1
        
        
    }
}

public class MainClass {
//    public static String stringToString(String input) {
//        return JsonArray.readFrom("[" + input + "]").get(0).asString();
//    }
    
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            String s = stringToString(line);
//            
//            int ret = new Solution().firstUniqChar(s);
//            
//            String out = String.valueOf(ret);
//            
//            System.out.print(out);
//        }
    }
}