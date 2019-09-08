package algorithm.no_344_Reverse_String;

/*
 * 
 * Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

*/

public class Solution {

	// Approach 1
//	public void reverseString(char[] s) {
//		for (int i = 0; i < s.length / 2; i++) {
//			swap(s, i);
//		}
//	}
//
//	public char[] swap(char[] org, int n) {
//		char temp;
//		temp = org[n];
//		org[n] = org[org.length - n - 1];
//		org[org.length - n - 1] = temp;
//		return org;
//	}
	// End of Approach 1

	// Approach 2
//	public void reverseString(char[] s) {
//		for (int i = 0; i < s.length / 2; i++) {
//			char temp;
//			temp = s[i];
//			s[i] = s[s.length - i - 1];
//			s[s.length - i - 1] = temp;
//		}
//	}
	// End of Approach 2
	
	// Approach 3
//	public void reverseString(char[] s) {
//		int left = 0;
//		int right = s.length - 1;
//		while (left < right) {
//			char temp;
//			temp = s[left];
//			s[left] = s[right];
//			s[right] = temp;
//			left++;
//			right--;
//		}
//	}
	// End of Approach 3
	
	
	// Approach 4
	// where n is the length of the array
    // Time Complexity: O(n/2)
    // Space Complexity: O(n/2)
    // Notes: Recursion
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
    
    private void helper(char[] s, int left, int right){
        if(left >= right){
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        helper(s, left + 1, right - 1);
    }
    // End of Approach 4
}