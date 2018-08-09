package algorithm.No_9_Palindrome_Number;

import java.util.ArrayList;

import java.util.*;

public class Solution {

	public static boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int revertNum = 0;
		while (x > revertNum) {
			revertNum = revertNum * 10 + (x % 10);
			x /= 10;
		}
		return (x == revertNum) || (x == revertNum / 10);
	}
	// Time complexity : O(log10(n)) , We divided the input by 10 for every iteration
	// Space complexity : O(1)
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(isPalindrome(x));
	}
}



// my first approach
// 
/**
 * 
 * 


public static boolean isPalindrome(int x) {
	if (x < 0 ) {
		return false;
	}
	ArrayList<Integer> arrList = new ArrayList<>();
	int n = 0;
	int y = x;
	int z = 0;
	int result = 0;
	
	while (y != 0) {
		n = y % 10;
		y = y / 10;
		arrList.add(n);
	}
	
	for (int i = arrList.size() - 1; i >= 0; i--) {
		try {
			z = Math.multiplyExact(arrList.get(arrList.size() - 1 - i) ,(int) Math.pow(10, i));
		} catch (ArithmeticException e) {
			return false;
		}
		
		result += z;
	}
	return result == x;
}


 */







// easy approach,  but not efficient
// String reverse
/**
 * 

public boolean isPalindrome(int x) {
	String b = String.valueOf(x);
    StringBuilder before = new StringBuilder(b);
    String after = before.reverse().toString();
    return b.equals(after);
}
// Time complexity : 
// Space complexity : 

 * 
 * 
 */


// easy approach,  but not efficient
// two pointers search
/**


	public boolean isPalindrome(int x) {
		String str = String.valueOf(x);
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start++) != str.charAt(end--))
				return false;
		}
		return true;
	}
// Time complexity : 
// Space complexity : 
 
 */

