package algorithm.No_0058_Length_of_Last_Word;

import com.eclipsesource.json.JsonArray;
import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity:
    // Space Complexity:
    // Notes:
//     public int lengthOfLastWord(String s) {
//         // edge
//         if(s == null || s.length() == 0){
//             return 0;
//         }
        
//         int startInd = 0;
//         int endInd = 0;
//         char prev = ' ';
//         for(int i = 0; i < s.length(); i ++){
//                 if(s.charAt(i) == ' ' && prev != ' '){
//                     endInd = i - 1;
//                 }else if(s.charAt(i) != ' ' && prev == ' '){
//                     startInd = i;
//                 }
//             prev = s.charAt(i);
//         }
        
//         int res = endInd - startInd;
//         return res > 0? endInd - startInd: s.length() - startInd;
//     }
    
    
    
    // Approach 2
    // Time Complexity: O(n), where n is the length of string s
    // Space Complexity:
    // Notes:
    // public int lengthOfLastWord(String s) {
    //      // edge
    //     if(s == null || s.length() == 0){
    //         return 0;
    //     }
    //     String[] arr = s.split(" ");
    //     return arr.length == 0 ? 0: arr[arr.length - 1].length();
    // }
    // End of Approach 2
    
    
    // Approach 3
    // Time Complexity: O(n) where n is the length of string s
    // Space Comlexity: O(1)
    // Notes:
    
    public int lengthOfLastWord(String s) {
        // edge
        if(s == null || s.length() == 0){
            return 0;
        }
        int res = 0;
        for(int i = s.length() - 1; i >=0; i-- ){
            if(s.charAt(i) != ' '){
                res++;    
            }else if(res != 0){
                break;
            }
        }
        return res;
    }
    // End of Approach 3
    
    
}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            int ret = new Solution().lengthOfLastWord(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}