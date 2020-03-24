package algorithm.No_0083_Remove_Duplicates_from_Sorted_List;

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
	// Time Complexity: O(n), where n is the length of the List
	// Space Complexity:
	// Notes:

//     public ListNode deleteDuplicates(ListNode head) {
//         // Edge
//         if(head == null){
//             return head;
//         }

//         ListNode res = new ListNode();
//         ListNode oriInd = head;
//         ListNode resInd = res;
//         resInd.next = new ListNode(oriInd.val);
//         int prev = oriInd.val;
//         oriInd = oriInd.next;
//         resInd = resInd.next;
//         while(oriInd != null){
//             if(oriInd.val != prev){
//                 resInd.next = new ListNode(oriInd.val);
//                 prev = oriInd.val;
//                 oriInd = oriInd.next;
//                 resInd = resInd.next;

//             }else{
//                 oriInd = oriInd.next;
//             }
//         }
//         return res.next;
//     }

	// End of Approach 1

	// Approach 2
	// Time Complexity: O(n), where n is the number of node in the List
	// Space Complexity: O(n)
	// Notes: Recursive

//     public ListNode deleteDuplicates(ListNode head) {
//         // Edge
//         if(head == null || head.next == null){
//             return head;
//         }
//         return helper(head);
//     }

//     public ListNode helper(ListNode node){
//         if(node == null || node.next == null) return node;

//         node.next = helper(node.next);

//         if(node.val == node.next.val){
//             return node.next;
//         }else{
//             return node;
//         }
//     }

	// End of Approach 2

	// Approach 3
	// Time Complexity:
	// Space Complexity:
	// Notes: iteritive
	public ListNode deleteDuplicates(ListNode head) {
		// edge
		if (head == null || head.next == null) {
			return head;
		}

		ListNode curr = head;
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return head;
	}
	// End of Approach 3

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

			ListNode ret = new Solution().deleteDuplicates(head);

			String out = listNodeToString(ret);

			System.out.print(out);
		}
	}
}