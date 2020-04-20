package algorithm.No_1008_Construct_Binary_Search_Tree_from_Preorder_Traversal;

import java.io.*;
import java.util.*;

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

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

class Solution {
	// Approach 1
	// Time Complexity:
	// Space Complexity:
	// Notes:
//     public TreeNode bstFromPreorder(int[] preorder) {
//         // Edge
//         if(preorder.length == 1){
//             return new TreeNode(preorder[0]);
//         }
//         //
//         return helper(preorder, 0, preorder.length-1);

//     }

//     private TreeNode helper(int[] arr, int left, int right){
//         if(left > right){
//             return null;
//         }
//         TreeNode root = new TreeNode(arr[left]);
//         int r;
//         for(r=left;r<=right;r++) {
//         if(arr[r] > root.val)
//             break;
//         }
//         System.out.println(root.val);
//         root.left = helper(arr, left + 1, r - 1);
//         root.right = helper(arr, r, right);
//         return root;
//     }
	// End of Approach 1

	// Approach 2
	// Time Complexity: O(n)
	// Space Complexity:
	// Notes:

	int i = 0;

	public TreeNode bstFromPreorder(int[] preorder) {
		return helper(preorder, Integer.MAX_VALUE);
	}

	private TreeNode helper(int[] arr, int max) {
		if (i == arr.length || arr[i] > max) {
			return null;
		}
		TreeNode n = new TreeNode(arr[i++]);
		n.left = helper(arr, n.val);
		n.right = helper(arr, max);
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

	public static String treeNodeToString(TreeNode root) {
		if (root == null) {
			return "[]";
		}

		String output = "";
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);
		while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();

			if (node == null) {
				output += "null, ";
				continue;
			}

			output += String.valueOf(node.val) + ", ";
			nodeQueue.add(node.left);
			nodeQueue.add(node.right);
		}
		return "[" + output.substring(0, output.length() - 2) + "]";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			int[] preorder = stringToIntegerArray(line);

			TreeNode ret = new Solution().bstFromPreorder(preorder);

			String out = treeNodeToString(ret);

			System.out.print(out);
		}
	}
}