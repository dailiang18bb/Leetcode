package algorithm.No_1290_Convert_Binary_Number_in_a_Linked_List_to_Integer;
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

// Definition for singly-linked list.

import java.io.*;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution {

	// Approach 1
	// Time Complexity: O(n), where n is the number of node in the list
	// Space Complexity: O(1)
	// Notes: Using array
//     public int getDecimalValue(ListNode head) {
//         // Edge
//         if(head.next == null){
//             return head.val;
//         }

//         int[] arr = new int[30];
//         ListNode curr = head;
//         int i = 0;
//         while(curr != null){
//             arr[i++] = curr.val;
//             curr = curr.next;
//         }

//         int res = 0;
//         for(int j = 0; j < i; j++){
//             res += arr[j] * (int)Math.pow(2, i - 1 - j);
//         }
//         return res;
//     }
	// End of Approach 1

	// Approach 2
	// Time Complexity: O(n),
	// Space Complexity: O(n) , n stack
	// Notes:
	public int getDecimalValue(ListNode head) {
		// Edge
		if (head.next == null) {
			return head.val;
		}
		int res = 0;
		return helper(head, 0);
	}

	public int helper(ListNode node, int sum) {
		if (node == null)
			return sum;
		sum = sum * 2 + node.val;
		return helper(node.next, sum);
	}
	// End of approach 2

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
		for (int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
		}
		return output;
	}

	public static ListNode stringToListNode(String input) {
		// Generate array from the input
		int[] nodeValues = stringToIntegerArray(input);

		// Now convert that list into linked list
		ListNode dummyRoot = new ListNode(0);
		ListNode ptr = dummyRoot;
		for (int item : nodeValues) {
			ptr.next = new ListNode(item);
			ptr = ptr.next;
		}
		return dummyRoot.next;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			ListNode head = stringToListNode(line);

			int ret = new Solution().getDecimalValue(head);

			String out = String.valueOf(ret);

			System.out.print(out);
		}
	}
}