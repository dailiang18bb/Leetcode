package algorithm.No_0402_Remove_K_Digits;

import com.eclipsesource.json.JsonArray;
import java.io.*;
import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Notes: sliding window
//     public String removeKdigits(String num, int k) {
//         // Edge
//         if(num == null || num.length() == 0 || num.length() == k){
//             return "0";
//         }
//         if(k == 0){
//             return num;
//         }
//         //

//         StringBuilder sb = new StringBuilder();
//         int len = num.length() - k;
//         int left = 0;
//         int right = k;
//         for(int i=0; i < len; i++){
//             int min = 10;
//             int leftTemp = left;
            
//             for(int j = left; j <= right; j++ ){
//                 // System.out.println(j);
//                 int temp = num.charAt(j) - '0';
//                 if(temp < min){
//                     min = temp;
//                     leftTemp = j;
//                 }
//             }
//             left = leftTemp+1;
//             right = right + 1;
//             if(sb.length() != 0 || min != 0){
//                 sb.append(min);
//             }
//         }
//         return sb.length() == 0? "0" : sb.toString();
//     }
    // End of Approach 1
    
    
    
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes:stack
    public String removeKdigits(String num, int k) {
        // Edge
        if(num == null || num.length() == 0 || num.length() == k){
            return "0";
        }
        if(k == 0){
            return num;
        }
        //
        
        Stack<Character> stack = new Stack<>();
        // loop string
        // if curr > peek() => pop()
        // k == 0 end loop
        // stringbuilder => reverse
        // delete leading zero
        
        int i = 0;
        while(k > 0){
            if(i>=num.length()){break;}
            int temp = num.charAt(i) - '0';
            if(stack.isEmpty()){
                stack.push(num.charAt(i));
                i++;
            }else{
                if(temp < stack.peek() - '0'){
                    stack.pop();
                    k--;
                }else{
                    stack.push(num.charAt(i));
                    i++;
                }
            }
        }
        
        while(k > 0){
            stack.pop();
            k--;
        }
        
        while(i < num.length()){
            stack.push(num.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for(char x : stack){
            if(sb.length() != 0 || x != '0'){
                sb.append(x);
            }
        }
        return sb.length() == 0? "0" : sb.toString();
    }
    // End of Approach 2
}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String num = stringToString(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            String ret = new Solution().removeKdigits(num, k);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}