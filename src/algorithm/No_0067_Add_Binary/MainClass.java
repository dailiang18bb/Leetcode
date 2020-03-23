package algorithm.No_0067_Add_Binary;

import com.eclipsesource.json.JsonArray;
import java.io.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(n), where n is the sum of length a and length b
    // Space Complexity:
    // Notes:
    public String addBinary(String a, String b) {
        // edge none empty
        int aInd = a.length() - 1;
        int bInd = b.length() - 1;
        int carry = 0;
        StringBuilder str = new StringBuilder();
        
        while(aInd >= 0 || bInd >=0){
            int sum = carry;
            if(aInd >= 0){
                sum += a.charAt(aInd) - '0';
            }
            if(bInd >= 0){
                sum += b.charAt(bInd) - '0';
            }
            str.append(sum % 2);
            carry = sum / 2;
            aInd--;
            bInd--;
        }
        if(carry == 1){
            str.append(1);
        }
        return str.reverse().toString();
    }
    // End of approach 1
}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String a = stringToString(line);
            line = in.readLine();
            String b = stringToString(line);
            
            String ret = new Solution().addBinary(a, b);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
