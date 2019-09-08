package algorithm.No_509_Fibonacci_Number;

import java.io.*;

/*
 * 
 * 
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).
 

Example 1:

Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Note:

0 ≤ N ≤ 30.

*/

class Solution {

	// Approach 1
	// Time Complexity: O(N)
	// Space Complexity: O(N)
	// Notes: Recursion

//     public int fib(int N) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         return helper(N, hm);
//     }

//     private int helper(int num, HashMap<Integer, Integer> hm){
//         if(hm.containsKey(num)){
//             return hm.get(num);
//         }
//         int val = 0;
//         if(num < 2){
//             return num;
//         }else{
//             val = helper(num - 1, hm) + helper(num - 2, hm);
//         }
//         hm.put(num, val);
//         return val;
//     }
	// End of Approach 1

	// Approach 2
	// Time Complexity: O(1)
	// Space Complexity: O(1)
	// Notes: Binet's Formula for the nth Fibonacci number
	public int fib(int N) {
		return (int) ((Math.pow((1 + Math.sqrt(5)) / 2, N) - Math.pow((1 - Math.sqrt(5)) / 2, N)) / Math.sqrt(5));
	}
	// End of Approach 2

}

public class MainClass {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			int N = Integer.parseInt(line);

			int ret = new Solution().fib(N);

			String out = String.valueOf(ret);

			System.out.print(out);
		}
	}
}