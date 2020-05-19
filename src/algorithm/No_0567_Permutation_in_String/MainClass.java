package algorithm.No_0567_Permutation_in_String;

import com.eclipsesource.json.JsonArray;
import java.io.*;
import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n!)
    // Space Complexity: O(n!)
    // Notes: brute force
//     public boolean checkInclusion(String s1, String s2) {
//         //Edge
//         if(s2.length() < s1.length()){
//             return false;
//         }
//         //
//         //init check
//         HashMap<Character, Integer> hMap = new HashMap<>();
//         for(Character c : s2.toCharArray()){
//             hMap.put(c, hMap.getOrDefault(c, 0) + 1);    
//         }
        
//         for(Character c : s1.toCharArray()){
//             if(!hMap.containsKey(c) || hMap.get(c) == 0){
//                 return false;
//             }
//             hMap.put(c, hMap.get(c) - 1);
//         }
//         if(s1.length()== s2.length()){
//             return true;
//         }
        
//         List<String> permu = new ArrayList<>();
//         helper(s1, "", permu);
//         for(String x : permu){
//             if(s2.contains(x)){
//                 return true;
//             }
//         }
//         return false;
//     }
    
//     private void helper(String s, String path, List<String> permu){
//         if(s.length() == 0){
//             permu.add(path);
//         }
//         for(int i = 0; i < s.length();i++){
//             helper(s.substring(0,i) + s.substring(i+1), path + s.charAt(i), permu);
//         }
//     }
    // End of Approach 1
    
    
    
    
    // Approach 2
    // Time Complexity: O(maxLength(s1,s2))
    // Space Complexity: O(1)
    // Noets: sliding window
    
    
    public boolean checkInclusion(String s1, String s2) {
        // Edge
        if(s2.length() < s1.length()){ return false;}
        //
        int[] s1Arr = new int[26];
        int[] window = new int[26];
        int len1 = s1.length();
        int len2 = s2.length();
        for(int i = 0; i < len1; i++){
            s1Arr[s1.charAt(i) - 'a'] += 1;
            window[s2.charAt(i) - 'a'] += 1;
        }
        
        for(int i = 0; i < len2 - len1 + 1; i++){
            // System.out.println(Arrays.toString(window));
            if(Arrays.equals(s1Arr, window)){
                return true;
            }
            window[s2.charAt(i) - 'a'] -= 1;
            if(i < len2 - len1){
                window[s2.charAt(len1 + i) - 'a'] += 1;
            }
        }
        return false;
    }
    // End of Approach 2
    
}


/*
job:
26 a - z
s2 contains any permutation of s1
Edge 
s2.length() < s1.length() return false;
test case
s1 = "app"
s2 = "bearcspapdge"
return true


Algo:
1. brute force
generate all permutation of s1
loop the permutation, check if s2 contains the permutation
O(n!), find permutationO(), check containsO(1)
length of s1 = 2, permu = 2, n!
len(s1) = 3, permu = 6
len(s1) = 4, permu = 24

*/

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
            String s1 = stringToString(line);
            line = in.readLine();
            String s2 = stringToString(line);
            
            boolean ret = new Solution().checkInclusion(s1, s2);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}