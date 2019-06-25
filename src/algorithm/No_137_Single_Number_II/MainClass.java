package algorithm.No_137_Single_Number_II;

import java.io.*;

class Solution {
    public int singleNumber(int[] nums) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        
//         // Edge check
//         if(nums.length == 1){ return nums[0];}
        
//         Set<Long> ss = new HashSet<>();
//         long sumSet = 0;
//         long sumArray = 0;
        
//         for(long x : nums){
//             ss.add(x);
//             sumArray += x;
//         }
        
//         Iterator<Long> itr = ss.iterator();
        
//         while(itr.hasNext()){
//             sumSet += itr.next()*3L;
//         }
                
//         return (int)((sumSet - sumArray) / 2L);
//         // End of Approach 1
        
        
        // Approach 2
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        
        int one = 0;
        int two = 0;
        
        for(int x : nums){
            one = (one ^ x) & ~two;
            two = (two ^ x) & ~one;
        }
        
        return one;
        // End of Approach 2
        
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
            
            int ret = new Solution().singleNumber(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}