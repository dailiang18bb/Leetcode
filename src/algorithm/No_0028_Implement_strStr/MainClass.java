package algorithm.No_0028_Implement_strStr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.eclipsesource.json.JsonArray;

class Solution {
    public int strStr(String haystack, String needle) {
        // Approach 1
        // Time complexity:
        // Space Complexity:
        // Notes:
        
        // Edge case
        if(needle == null || needle.isEmpty()){
            return 0;
        }
        if(haystack == null || haystack.isEmpty()){
            return -1;
        }
        
        int hayLen = haystack.length();
        int neeLen = needle.length();
        char[] hayArr = haystack.toCharArray();
        char[] neeArr = needle.toCharArray();
        for(int i = 0; i< hayLen - neeLen + 1; i++){
            if(hayArr[i] == neeArr[0]){
                for(int j = i, k = 1; k < neeLen; j++, k++){
                    if(hayArr[j] == neeArr[k] && k == neeLen - 1){
                        return i;
                    }
                    if(hayArr[j] != neeArr[k]){
                        break;
                    }
                }
            }
        }
        return -1;
        
    }
}

public class MainClass {

    
    public static void main(String[] args) throws IOException {

            String haystack = "mississippi";
            String needle = "mississippi";
            int ret = new Solution().strStr(haystack, needle);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
}