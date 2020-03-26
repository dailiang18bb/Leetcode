package algorithm.No_0100_Same_Tree;

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

//Definition for a binary tree node.


import java.io.*;
import java.util.*;

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
	// Time Complexity: O(m + n), where m, n is the number of node in p and q
	// Space Complexity: O(m + n), stack
	// Notes: DFS, recurrsion

	public boolean isSameTree(TreeNode p, TreeNode q) {
		// edge...
		return helper(p, q);
	}

	public boolean helper(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}

		boolean res = q.val == p.val ? true : false;
		return helper(p.left, q.left) && helper(p.right, q.right) && res;
	}
	// End of approach 1

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
			TreeNode p = stringToTreeNode(line);
			line = in.readLine();
			TreeNode q = stringToTreeNode(line);

			boolean ret = new Solution().isSameTree(p, q);

			String out = booleanToString(ret);

			System.out.print(out);
		}
	}
}