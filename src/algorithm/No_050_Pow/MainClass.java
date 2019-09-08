package algorithm.No_050_Pow;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

/*
 * 
 * 
Implement pow(x, n), which calculates x raised to the power n (xn).

Example 1:

Input: 2.00000, 10
Output: 1024.00000
Example 2:

Input: 2.10000, 3
Output: 9.26100
Example 3:

Input: 2.00000, -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
Note:

-100.0 < x < 100.0
n is a 32-bit signed integer, within the range [−231, 231 − 1]
*/

class Solution {
//  public double myPow(double x, int n) {
//      HashMap<Integer, Double> hm = new HashMap<>();
//      if(n < 0){
//          return negativeHelper(x, n, hm);
//      }else{
//          return helper(x,n, hm);
//      }

//  }

//  private double helper(double x, int n, HashMap<Integer, Double> hm){
//      if(hm.containsKey(n)){
//          return hm.get(n);
//      }
//      if(n == 0){
//          return 1;
//      }
//      if(n == 1){
//          return x;
//      }
//      if(n == 2){
//          return x * x;
//      }
//      if(n == 3){
//          return x*x*x;
//      }
//      double val = 1;
//      int size = (int)Math.floor(Math.sqrt(n));
//      System.out.println(size);
//      for(int i = 0; i < size; i++){
//          // System.out.println(n/size);
//          val *= helper(x, n / size, hm);
//      }
//      if(n % size != 0){
//          val *= helper(x, n % size, hm);
//      }
//      hm.put(n, val);
//      return val;
//  }

//  private double negativeHelper(double x, int n, HashMap<Integer, Double> hm){
//      if(hm.containsKey(n)){
//          return hm.get(n);
//      }
//      if(n == -1){
//          return 1/x;
//      }
//      if(n == -2){
//          return 1 / (x * x);
//      }
//      if(n == -3){
//          return 1 / (x*x*x);
//      }
//      double val = 1;
//      if(n == Integer.MIN_VALUE){
//          n = n + 1;
//      }
//      int size = (int)Math.floor(Math.sqrt(-n));
//      System.out.println(size);
//      for(int i = 0; i < size; i++){
//          // System.out.println(n/size);
//          val *= negativeHelper(x, n / size, hm);
//      }
//      if(n % size != 0){
//          val *= negativeHelper(x, n % size, hm);
//      }
//      hm.put(n, val);

//      return val;
//  }

	// Approach 2
	// time Complexity:O(logn)
	// Space Complexity: O(logn)
	// Notes: divided by 2
	public double myPow(double x, int n) {
		return helper(x, n);
	}

	private double helper(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		if (n == -1) {
			return 1 / x;
		}
		double temp = helper(x, n / 2);
		if (n % 2 == 1) {
			return temp * temp * x;
		} else if (n % 2 == -1) {
			return temp * temp * 1 / x;
		} else {
			return temp * temp;
		}
	}
}

public class MainClass {
	public static String doubleToString(double input) {
		return new DecimalFormat("0.00000").format(input);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			double x = Double.parseDouble(line);
			line = in.readLine();
			int n = Integer.parseInt(line);

			double ret = new Solution().myPow(x, n);

			String out = doubleToString(ret);

			System.out.print(out);
		}
	}
}