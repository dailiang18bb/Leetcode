package algorithm.No_0974_Subarray_Sums_Divisible_by_K;


import java.io.*;
import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Notes: Brute force
    // public int subarraysDivByK(int[] A, int K) {
    //     // Edge
    //     //
    //     int res = 0;
    //     for(int i = 0; i < A.length; i++){
    //         int sum = 0;
    //         for(int j = i; j < A.length; j++){
    //             sum += A[j];
    //             if(sum % K == 0){
    //                 res++;
    //             }
    //         }
    //     }
    //     return res;
    // }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Sapce Complexity: O(n)
    // Notes: prefix sum
    public int subarraysDivByK(int[] A, int K) {
        //
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum = 0, res = 0; 
        for(int i = 0; i < A.length; i++){
            sum+= A[i];
            int temp = (sum % K + K) % K; // prevent negative sum
            
            if(hm.containsKey(temp)){
                res += hm.get(temp);
            }
            hm.put(temp, hm.getOrDefault(temp, 0) + 1);
        }
        return res;
    }
    // Approach 2

}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] A = stringToIntegerArray(line);
            line = in.readLine();
            int K = Integer.parseInt(line);
            
            int ret = new Solution().subarraysDivByK(A, K);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}