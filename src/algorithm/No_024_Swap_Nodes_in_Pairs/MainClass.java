package algorithm.No_024_Swap_Nodes_in_Pairs;

/*
 * 
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

 

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.

*/

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


// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution {

	// Approach 1
	// Time Complexity: O(n)
	// Space Complexity: O(n)
	// Notes: Recursion

//     public ListNode swapPairs(ListNode head) {
//         if(head == null) return null;
//         if(head.next == null) return head;
//         ListNode newHead = new ListNode(0);
//         newHead.next = head;
//         helper(head, newHead);
//         return newHead.next;
//     }

//     private void helper(ListNode n, ListNode prev){
//         if(n == null || n.next == null){return;}
//         ListNode temp = n.next;
//         n.next = n.next.next;
//         temp.next = n;
//         prev.next = temp;
//         helper(n.next, n);
//     }
	// End of Approach 1

	
	// Approach 2
	// Time Compelxity: O(n)
	// Space Complexity: O(n)
	// Notes: return head
	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		return helper(head);
	}

	private ListNode helper(ListNode n) {
		if (n == null || n.next == null) {
			return n;
		}
		ListNode second = n.next;
		n.next = helper(n.next.next);
		second.next = n;
		n = second;
		return n;
	}
	// End of Approach 2
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

	public static String listNodeToString(ListNode node) {
		if (node == null) {
			return "[]";
		}

		String result = "";
		while (node != null) {
			result += Integer.toString(node.val) + ", ";
			node = node.next;
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			ListNode head = stringToListNode(line);

			ListNode ret = new Solution().swapPairs(head);

			String out = listNodeToString(ret);

			System.out.print(out);
		}
	}
}