package algorithm.No_069_Sqrt_x;

import java.io.*;

class Solution {
    public int mySqrt(int x) {
        
        // Approach 1
        // Time Complexity: O(N^(1/2))
        // Space Complexity: O(1)
        // Notes:
        
//         // Edge
//         if(x == 0) return 0;
//         if(x == 1) return 1;
        
//         long res = 1;
//         while((res * res) <= x){
//             res++;
//         }
//         return (int)res - 1;
        // End of Approach 1
        
        
        
        // Approach 2
        // Time Complexity: O(logx)
        // Space Complexity: O(1)
        // Notes:Binary Search
        
        // Edge
//         if(x == 0) return 0;
//         if(x == 1) return 1;
        
//         int left = 0;
//         int right = x;
//         long pivot = 0;
//         long power = 0;
//         while(left <= right){
//             pivot = (left + right)/2;
//             power = pivot * pivot;            
//             if(power > x){
//                 right = (int)pivot - 1;
//             }else if(power < x){
//                 left = (int)pivot + 1;
//             }else{
//                 return (int)pivot;
//             }
//         }
//         return power > x ? (int)pivot - 1: (int)pivot;
        // End of Approach 2
        
        // Approach 3
        // Time Complexity: O(logx)
        // Space Complexity: O(1)
        // Notes:
        
        // Edge
        if(x == 0) return 0;
        if(x == 1) return 1;      
        
        double half = x/2;
        double temp = 0;
        while(Math.abs(half - temp) >= 1){
            temp = half;
            half = (temp + (double)x/temp) / 2;
        }
        return (int)Math.floor(half);
        // End of Approach 3
        
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().mySqrt(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}