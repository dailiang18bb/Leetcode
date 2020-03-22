package algorithm.No_1390_Four_Divisors;

import java.io.*;
import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n^2) where n is the length of the array nums
    // Space Complexity:O(10^5) cache, O(1) without cache
    // Notes:
    
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        int[] cache = new int[100001]; //Constraints: 1 <= nums[i] <= 10^5
        Arrays.fill(cache, -1);
        for(int x : nums){
            int divSum = 0;
            if(cache[x] != -1){
                divSum = cache[x];
            }else{
                divSum = helper(x);
            }
            res += divSum;
        }
        return res;
    }
    
    public int helper(int n){
        int count = 0;
        int sum = 1 + n;
        for(int i = 2; i <= Math.sqrt(n) && count <=2 ; i++){
            if(n % i == 0){
                if(n / i == i){
                    count++;
                    sum += i;
                }else{
                    count +=2;
                    sum = sum + i + n/i;
                }
            }
        }
        return count == 2? sum : 0;
    }
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
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().sumFourDivisors(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}