package algorithm.No_263_Ugly_Number;

import java.io.*;

class Solution {
    public boolean isUgly(int num) {
        
        // Approach 1
        // Time Complexity: O(Math.sqrt(n))
        // Space Complexity: O(1)
        
        
//         // Edge check
//         if(num == 0){return false;}
//         if(num == 1){return true;}
        
//         int temp = num;
//         while(temp != 1){
//             if(temp % 2 == 0){
//                 temp /= 2;
//             } else if(temp % 3 == 0){
//                 temp /= 3;
//             } else if(temp % 5 == 0){
//                 temp /= 5;
//             } else{
//                 return false;
//             }
//         }
//         return true;
//         // End of Approach 1
        
        
        // Approach 2
        // Time Complexity:
        // Space Complexity:
        
        // Edge check
        if(num == 0){return false;}
        if(num == 1){return true;}
        
        
        while(num % 2 == 0){
            num /= 2;
        }
        while(num % 3 == 0){
            num /= 3;
        }
        while(num % 5 == 0){
            num /= 5;
        }
        
        return num == 1;
        // End of Approach 2
    }
}

public class MainClass {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            boolean ret = new Solution().isUgly(num);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
