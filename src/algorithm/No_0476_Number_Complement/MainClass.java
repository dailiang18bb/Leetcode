package algorithm.No_0476_Number_Complement;


import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity:O(n)
    // Space Complexity: O(n)
    // Notes: Integer.toString(num, base), Integer.parseInt(string, base)
    
    // public int findComplement(int num) {
    //     String b2 = Integer.toString(num, 2);
    //     StringBuilder sb = new StringBuilder();
    //     for(char x : b2.toCharArray()){
    //         if(x == '0'){
    //             sb.append('1');
    //         }else{
    //             sb.append('0');
    //         }
    //     }
    //     return Integer.parseInt(sb.toString(), 2);
    // }
    // End of Approach 1
    
    // Approach 2
    // Time Complexity: O(logn)
    // Space Complexity: O(1)
    // Notes: '111' = '101' + '010'
    public int findComplement(int num) {
        int cp = num;
        int sum = 0;
        while(cp > 0){
            cp = cp / 2;
            sum = sum * 2 + 1;
        }
        return sum - num;
    }
    // End of Approach 2

}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            int ret = new Solution().findComplement(num);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
