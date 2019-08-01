package algorithm.No_150_Evaluate_Reverse_Polish_Notation;


import java.util.*;
import java.io.*;
import com.eclipsesource.json.*;

class Solution {
    public int evalRPN(String[] tokens) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // Notes: Stack
        
        // Edge 
        if(tokens == null || tokens.length == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        for(String x: tokens){
            if(x.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if(x.equals("-")){
                int a2 = stack.pop();
                int b2 = stack.pop();
                stack.push(b2 - a2);
            } else if(x.equals("*")){
                stack.push(stack.pop() * stack.pop());
            } else if(x.equals("/")){
                int a4 = stack.pop();
                int b4 = stack.pop();
                stack.push(b4/a4);
            } else{
                stack.push(Integer.parseInt(x));
            }
        }
        return stack.peek();
        // End of Approach 1
        
        
        
        // Approach 2
        // Time Complexity:
        
    }
}

public class MainClass {
    public static String[] stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String[] tokens = stringToStringArray(line);
            
            int ret = new Solution().evalRPN(tokens);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}