package algorithm.No_0110_Balanced_Binary_Tree;


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
	// Time Complexity: O(n)
	// Space Complexity: O(n)
	// Notes: bottom-up

	static final int WORNG_VALUE = -18;

	public boolean isBalanced(TreeNode root) {
		// edge
		if (root == null) {
			return true;
		}
		return helper(root) != WORNG_VALUE;
	}

	public int helper(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int left = helper(node.left);
		int right = helper(node.right);
		if (left == WORNG_VALUE || right == WORNG_VALUE || Math.abs(left - right) > 1) {
			return WORNG_VALUE;
		}
		return Math.max(left, right) + 1;
	}
	// End of Approach 1
}

public class MainClass {
	public static TreeNode stringToTreeNode(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return null;
		}

		String[] parts = input.split(",");
		String item = parts[0];
		TreeNode root = new TreeNode(Integer.parseInt(item));
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);

		int index = 1;
		while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int leftNumber = Integer.parseInt(item);
				node.left = new TreeNode(leftNumber);
				nodeQueue.add(node.left);
			}

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int rightNumber = Integer.parseInt(item);
				node.right = new TreeNode(rightNumber);
				nodeQueue.add(node.right);
			}
		}
		return root;
	}

	public static String booleanToString(boolean input) {
		return input ? "True" : "False";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			TreeNode root = stringToTreeNode(line);

			boolean ret = new Solution().isBalanced(root);

			String out = booleanToString(ret);

			System.out.print(out);
		}
	}
}
