package algorithm.No_20_Valid_Parentheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        
        // Approach 1
        // Time Complexity: O(n);
        // Space Complexity: O(n);
        
        // Edge check
        if(s.length() % 2 == 1){return false;}
        if(s.length() == 0){ return true;}
        
        Stack<Character> charStack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(charStack.empty()){
                charStack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' && charStack.peek().equals('(')){
                charStack.pop();
            }else if(s.charAt(i) == '}' && charStack.peek().equals('{')){
                charStack.pop();
            }else if(s.charAt(i) == ']' && charStack.peek().equals('[')){
                charStack.pop();
            }else{
                charStack.push(s.charAt(i));
            }
        }
        return charStack.empty();
        // End of Approach 1
        
        
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
//            
//            boolean ret = new Solution().isValid(s);
//            
//            String out = booleanToString(ret);
//            
//            System.out.print(out);
//        }
    }
}