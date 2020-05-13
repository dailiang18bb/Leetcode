package algorithm.No_0921_Minimum_Add_to_Make_Parentheses_Valid;

import com.eclipsesource.json.JsonArray;
import java.io.*;

class Solution {
    // Approach 1
    // Time Complexity: O(N), where N is the length of the String S
    // Space Complexity: O(N)
    // Notes: Stack
    // public int minAddToMakeValid(String S) {
    //     // Edge
    //     if(S == null || S.length() == 0){
    //         return 0;
    //     }
    //     if(S.length() == 1){
    //         return 1;
    //     }
    //     //
    //     Stack<Character> stack = new Stack<>();
    //     for(Character x : S.toCharArray()){
    //         if(stack.isEmpty()){
    //             stack.push(x);
    //         }else if(stack.peek() == '(' && x == ')'){
    //             stack.pop();
    //         }else{
    //             stack.push(x);
    //         }
    //     }
    //     return stack.size();
    // }
    // End of Approach 1
    
    // Approach 2
    // Time Complexity:
    // Space Complexity:
    // Notes:constant space
//     public int minAddToMakeValid(String S) {
//         // Edge
//         if(S == null || S.length() == 0){
//             return 0;
//         }
//         if(S.length() == 1){
//             return 1;
//         }
//         //
        
//         int cOpen = 0;
//         int cClose = 0;
//         // track invalid )
//         for(char x : S.toCharArray()){
//             if(cOpen == 0){
//                 if(x == ')'){
//                     cClose++;
//                 }else{
//                     cOpen++;
//                 }
//             }else{
//                 if(x == ')'){
//                     cOpen--;
//                 }else{
//                     cOpen++;
//                 }
//             }
//         }
//         return cOpen+cClose;
//     }
    // End of Approach 2

    
    
    // Approach 3
    // Notes: Shorten the for loop
    public int minAddToMakeValid(String S) {
        // Edge
        if(S == null || S.length() == 0){
            return 0;
        }
        if(S.length() == 1){
            return 1;
        }
        //
        
        int cOpen = 0;
        int cClose = 0;
        // track invalid )
        for(char x : S.toCharArray()){
            if(cOpen == 0 && x == ')'){
                    cClose++;
            }else if(x == ')') {
                    cOpen--;
            }else{
                    cOpen++;
            }
        }
        return cOpen+cClose;
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
            String S = stringToString(line);
            
            int ret = new Solution().minAddToMakeValid(S);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}