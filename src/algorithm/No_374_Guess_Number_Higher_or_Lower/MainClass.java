package algorithm.No_374_Guess_Number_Higher_or_Lower;

import java.io.*;

/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

//class Solution extends GuessGame {
class Solution {
	
	// dummy function
	public static int guess(int a) {
		return a;
	}
	
    public int guessNumber(int n) {
        
        // Approach 1
        // Time Complexity: O(logn)
        // Space Complexity: O(1)
        // Notes: Binary Search
        
        // Edge
        if(n < 1) return 0;
        
        int mid = n / 2;
        int left = 1;
        int right = n;
        while(left <= right){
            switch (guess(mid)){
                case -1:
                    right = mid - 1;
                    break;
                case 1:
                    left = mid + 1;
                    break;
                case 0:
                    return (int)mid;
            }
            System.out.println(mid);
            mid = left + (right - left)/2;
        }
        return -1;
        // End of Approach 1
        
        // Approach 2
        // Time Complexity: O(log3(n))
        // Space Complexity: O(1)
        // Notes: Ternary Search
        
//         int left = 0;
//         int right = n;
//         while(left <= right){
//             int mid1 = left + (right - left)/3;
//             int mid2 = right - (right - left)/3;
//             int res1 = guess((int)mid1);
//             int res2 = guess((int)mid2);
//             if(res1 == 0){
//                 return mid1;
//             }else if(res2 == 0){
//                 return mid2;
//             }else if(res1 < 0){
//                 right = mid1 - 1;
//             }else if(res2 > 0){
//                 left = mid2 + 1;
//             }else{
//                 right = mid2 - 1;
//                 left = mid1 + 1;
//             }
//         }
//         return -1;
        // End of Approach 2
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            int pick = Integer.parseInt(line);
            
//            int ret = new Solution().guessNumber(n, pick);
            
//            String out = String.valueOf(ret);
            
//            System.out.print(out);
        }
    }
}
