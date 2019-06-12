package algorithm.No_412_Fizz_Buzz;

import java.util.*;
import java.io.*;
import java.sql.Time;


class Solution {
    public List<String> fizzBuzz(int n) {
    	
    	//my code
        // edge check
        if(n<1){
            return null;
        }
        
        ArrayList<String> re = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0){
                re.add("FizzBuzz");
            }else if(i%3 == 0){
                re.add("Fizz");
            }else if(i%5 == 0){
                re.add("Buzz");
            }else{
                re.add(String.valueOf(i));
            }
        }
        return re;
        
        // end of my code
        
        // Time complexity O(n)
        // Space complexity O(1)
    }
}

public class MainClass {
    public static String stringListToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            List<String> ret = new Solution().fizzBuzz(n);
            
            String out = stringListToString(ret);
            
            System.out.print(out);
        }
    }
}