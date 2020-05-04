package algorithm.No_0383_Ransom_Note;

import com.eclipsesource.json.JsonArray;
import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: Hash Table
//     public boolean canConstruct(String ransomNote, String magazine) {
//         // Edge
//         //
        
//         HashMap<Character, Integer> hm = new HashMap<>();
//         for(Character x : magazine.toCharArray()){
//             hm.put(x, hm.getOrDefault(x, 0) + 1);
//         }
        
//         for(Character y : ransomNote.toCharArray()){
//             if(hm.containsKey(y)){
//                 if(hm.get(y) > 1){
//                     hm.put(y, hm.get(y) - 1);
//                 }else{
//                     hm.remove(y);
//                 }
//             }else{
//                 return false;
//             }
//         }
//         return true;
//     }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity:
    // Space Complexity:
    // Notes: Array
    public boolean canConstruct(String ransomNote, String magazine) {
        //
        
        int[] arr = new int[26];
        for(char x : magazine.toCharArray()){
            arr[x - 'a']++;
        }
        
        for(char y : ransomNote.toCharArray()){
            if(arr[y - 'a'] > 0){
                arr[y - 'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
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
            String ransomNote = stringToString(line);
            line = in.readLine();
            String magazine = stringToString(line);
            
            boolean ret = new Solution().canConstruct(ransomNote, magazine);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}