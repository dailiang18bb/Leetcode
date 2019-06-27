package algorithm.No_242_Valid_Anagram;

import java.io.*;
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
    
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
//         // Edge check
//         if(s.length() == 0 || t.length() == 0){
//             return true;
//         }
//         if(s.length() != t.length()){
//             return false;
//         }
        
//         Map<Character, Integer> ht1 = new Hashtable<>();
//         Map<Character, Integer> ht2 = new Hashtable<>();
        
//         for(Integer i = 0; i < s.length(); i++){
//             Character c = s.charAt(i);
//             ht1.put(c, ht1.getOrDefault(c,0) + 1);
//         }
        
//         for(Integer i = 0; i < t.length(); i++){
//             Character c = t.charAt(i);
//             ht2.put(c, ht2.getOrDefault(c ,0) + 1);
//         }
//         return ht1.equals(ht2);
//         // End of Approach 1
        
        
        // Approach 2
        // Notes: sorting
        // Time Complexity: O(nlogn)
        // Space Complexity: O(1)
        
//         // Edge check
//         if(s.length() != t.length()){
//             return false;
//         }
        
//         char[] chs = s.toCharArray();
//         char[] cht = t.toCharArray();
//         Arrays.sort(chs);
//         Arrays.sort(cht);
        
//         return Arrays.equals(chs,cht);
//         // End of Approach 2
        
        
        
        // Approach 3
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
        
        //Edge check
        if(s.length() != t.length()){return false;}
        
        int[] dic = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            dic[s.charAt(i) - 'a']++;
            dic[t.charAt(i) - 'a']--;
        }
        
        for(int x : dic){
            if(x != 0){ return false;}
        }
        return true;
        
        // End of Approach 3
        
        
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
//            boolean ret = new Solution().isAnagram(s, t);
//            
//            String out = booleanToString(ret);
//            
//            System.out.print(out);
//        }
    }
}