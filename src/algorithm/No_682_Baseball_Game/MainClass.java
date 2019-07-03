package algorithm.No_682_Baseball_Game;

import java.io.*;
import java.util.*;

class Solution {
    public int calPoints(String[] ops) {

        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
        // Edge check:
        if(ops.length == 0 || ops == null){return 0;}
        
        Stack<Integer> myStack = new Stack<>();
        int re = 0;
        
        for(String x : ops){
            switch(x){
                case "+":
                    int temp = myStack.pop();
                    int sum = temp + myStack.peek();
                    myStack.push(temp);
                    myStack.push(sum);
                    re += sum;
                    break;
                case "D":
                    int tempD = myStack.peek() * 2;
                    myStack.push(tempD);
                    re += tempD;
                    break;
                case "C":
                    int tempC = myStack.pop();
                    re -= tempC;
                    break;
                default:
                    int tempN = Integer.parseInt(x);
                    myStack.push(tempN);
                    re += tempN;
            }
        }
        return re;
        // End of Approach 1
        
    }
}

public class MainClass {
//    public static String[] stringToStringArray(String line) {
//        JsonArray jsonArray = JsonArray.readFrom(line);
//        String[] arr = new String[jsonArray.size()];
//        for (int i = 0; i < arr.length; i++) {
//          arr[i] = jsonArray.get(i).asString();
//        }
//        return arr;
//    }
    
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            String[] ops = stringToStringArray(line);
//            
//            int ret = new Solution().calPoints(ops);
//            
//            String out = String.valueOf(ret);
//            
//            System.out.print(out);
//        }
    }
}