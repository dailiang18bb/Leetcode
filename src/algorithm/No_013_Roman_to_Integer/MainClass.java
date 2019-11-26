package algorithm.No_013_Roman_to_Integer;

import java.io.*;
import java.util.*;

import com.eclipsesource.json.*;

class Solution {
    
    
    // Approach 1
    // Time Complexity: O(n), where n is the length of the String s.
    // Space Complexity: O(n)
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        char arr[] = s.toCharArray();
        for(int i = 1; i < arr.length; i++){
            if(hm.get(arr[i - 1]) < hm.get(arr[i])){
                result -= hm.get(arr[i - 1]);
            }else{
                result += hm.get(arr[i - 1]);
            }
        }
        result += hm.get(arr[arr.length - 1]);
        return result;
    }
    // End of Approach 1
    
    
//     // Approach 2
//     // Time Complexity:
//     // Space Complexity:
//     public int romanToInt(String s) {
//         int result = 0;
//         char arr[] = s.toCharArray();
//         for(int i = 1; i < arr.length; i++){
//             switch(arr[i]){
//                 case 'I':
                    
//             }
//         }
//         return result;
//     }
//     // End of Approach 2
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
            
            int ret = new Solution().romanToInt(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}