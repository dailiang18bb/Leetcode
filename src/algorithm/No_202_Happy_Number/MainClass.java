package algorithm.No_202_Happy_Number;

import java.util.*;
import java.io.*;

class Solution {
	public boolean isHappy(int n) {
        
        // Approach 1
        // Time Complexity:
        // Space Complexity:
        
//         // edge check
        
//         Map<Integer, Integer> ht = new Hashtable<>();
//         Set<Integer> hs = new HashSet<>();
//         int tempNum = n;
        
//         while(tempNum != 1){
//             int tempSum = 0;
//             while(tempNum != 0){
//                 int digit = tempNum % 10;
//                 tempNum /= 10;
//                 int numPow = 0;
//                 if(ht.containsKey(digit)){
//                     numPow = ht.get(digit);
//                 }else{
//                     numPow = (int) Math.pow(digit,2);
//                     ht.put(digit, numPow);
//                 }
//                 tempSum += numPow;
//             }
            
//             if(tempSum == 1){
//                 return true;
//             }else if(!hs.add(tempSum)){
//                 return false;
//             }
//             tempNum = tempSum;
//         } 
//         return true;
//         // End of Approach 1
        
        
        // Approach 2
        // Time Complexity: 
        // Space Complexity:
        
        Set<Integer> hs = new HashSet<>();
        while(n != 1 && hs.add(n)){
            int sum = 0;
            while(n > 0){
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
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
            int n = Integer.parseInt(line);
            
            boolean ret = new Solution().isHappy(n);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}