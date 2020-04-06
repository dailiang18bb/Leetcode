package algorithm.No_0122_Best_Time_to_Buy_and_Sell_Stock_II;


import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n)
    // Sapce Complexity: O(1)
    // Notes:
    
    public int maxProfit(int[] prices) {
        // Edge
        if(prices == null || prices.length == 0){
            return 0;
        }
        
        int res = 0;
        for(int i = 0; i < prices.length - 1; i++){
            int sum = prices[i + 1] - prices[i];
            if(sum > 0){
                res += sum;
            }
        }
        return res;
    }
    // End of Approach 1
    
    
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
            int[] prices = stringToIntegerArray(line);
            
            int ret = new Solution().maxProfit(prices);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}