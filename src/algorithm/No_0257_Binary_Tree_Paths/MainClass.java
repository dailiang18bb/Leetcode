package algorithm.No_0257_Binary_Tree_Paths;

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

import java.util.*;
import java.io.*;

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
	// Space Complexity: O(nlogn)
	// Notes:
	public List<String> binaryTreePaths(TreeNode root) {
		// edge
		if (root == null) {
			return new ArrayList<>();
		}
		List<String> res = new ArrayList<>();
		helper(root, res, "");
		return res;
	}

	public void helper(TreeNode node, List<String> list, String path) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			list.add(path + node.val);
		}
		helper(node.left, list, path + node.val + "->");
		helper(node.right, list, path + node.val + "->");
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

	public static String stringListToString(List<String> stringList) {
		StringBuilder sb = new StringBuilder("[");
		for (String item : stringList) {
			sb.append(item);
			sb.append(",");
		}

		sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			TreeNode root = stringToTreeNode(line);

			List<String> ret = new Solution().binaryTreePaths(root);

			String out = stringListToString(ret);

			System.out.print(out);
		}
	}
}