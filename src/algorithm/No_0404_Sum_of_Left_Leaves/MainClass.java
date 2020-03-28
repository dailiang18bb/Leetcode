package algorithm.No_0404_Sum_of_Left_Leaves;

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


import java.util.*;
import java.io.*;

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
	// Notes: DFS

	public int sumOfLeftLeaves(TreeNode root) {
		// edge
		if (root == null) {
			return 0;
		}
		return helper(root, false);
	}

	private int helper(TreeNode node, boolean leftFlag) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null && leftFlag) {
			return node.val;
		}
		return helper(node.left, true) + helper(node.right, false);
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

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			TreeNode root = stringToTreeNode(line);

			int ret = new Solution().sumOfLeftLeaves(root);

			String out = String.valueOf(ret);

			System.out.print(out);
		}
	}
}