package algorithm.No_0028_Implement_strStr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.eclipsesource.json.JsonArray;

class Solution {
    
    // Approach 1
    // Time complexity: O(n) where n is the longest string length from haystack and needle
    // Space Complexity: O(n)
    // Notes:
// public int strStr(String haystack, String needle) {
//     // Edge case
//     if(needle == null || needle.isEmpty()){
//         return 0;
//     }
//     if(haystack == null || haystack.isEmpty()){
//         return -1;
//     }

    
//     int hayLen = haystack.length();
//     int neeLen = needle.length();
//     char[] hayArr = haystack.toCharArray();
//     char[] neeArr = needle.toCharArray();
//     for(int i = 0; i < hayLen - neeLen + 1; i++){
//         if(hayArr[i] == neeArr[0]){
//             if(neeLen == 1){
//                 return i;
//             }
//             for(int j = i + 1, k = 1; k < neeLen; j++, k++){
//                 if(hayArr[j] == neeArr[k] && k == neeLen - 1){
//                     return i;
//                 }
//                 if(hayArr[j] != neeArr[k]){
//                     break;
//                 }
//             }
//         }
//     }
//     return -1;
// }
// End of Approach 1

// Approach 2
// Notes: 
// public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle);
//     }
// End of Approach 2


// Approach 3
// Time complexity: O(n)
// Space complexity: O(1)
// Notes: put condition inside for loop, save a break condition

public int strStr(String haystack, String needle) {
    // Edge case
    if(needle == null || needle.isEmpty()){
        return 0;
    }
    if(haystack == null || haystack.isEmpty()){
        return -1;
    }
    
    for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
        for(int j = 0; j < needle.length() && haystack.charAt(i + j) == needle.charAt(j); j++){
            if(j == needle.length() - 1){
                return i;
            }
        }
    }
    return -1;
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
        String haystack = stringToString(line);
        line = in.readLine();
        String needle = stringToString(line);
        
        int ret = new Solution().strStr(haystack, needle);
        
        String out = String.valueOf(ret);
        
        System.out.print(out);
    }
}
}