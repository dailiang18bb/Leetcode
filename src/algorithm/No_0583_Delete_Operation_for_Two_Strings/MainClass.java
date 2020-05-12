package algorithm.No_0583_Delete_Operation_for_Two_Strings;

import com.eclipsesource.json.JsonArray;
import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(mn)
    // Space Complexity: O(mn)
    // Notes: lcs
    
    public int minDistance(String word1, String word2) {
        int lcs = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for(int i = 0; i < len1 + 1; i++){
            for(int j = 0; j < len2 + 1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else {
                    if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }else{
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        lcs = dp[len1][len2];
        return len1 + len2 - lcs * 2;
    }
    // End of Approach 1
    
}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String word1 = stringToString(line);
            line = in.readLine();
            String word2 = stringToString(line);
            
            int ret = new Solution().minDistance(word1, word2);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}