package algorithm.No_0111_Minimum_Depth_of_Binary_Tree;

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
	// Space Complexity: O(nlogn)
	// Notes: Top-down
//     public int minDepth(TreeNode root) {
//         // edge
//         if(root == null){
//             return 0;
//         }

//         return helper(root, 0);
//     }

//     public int helper(TreeNode node, int level){
//         if(node == null){
//             return level;
//         }
//         level++;
//         int left = helper(node.left, level);
//         int right = helper(node.right, level);
//         if(node.left == null || node.right == null){
//             return Math.max(left, right);
//         }
//         return Math.min(left, right);
//     }
	// End of Approach 1

	// Approach 2
	// Notes: Bottom-up
	public int minDepth(TreeNode root) {
		return helper(root);
	}

	public int helper(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = helper(node.left);
		int right = helper(node.right);
		if (node.left == null || node.right == null) {
			return Math.max(left, right) + 1;
		}
		return Math.min(left, right) + 1;
	}
	// End of Approach 2

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

			int ret = new Solution().minDepth(root);

			String out = String.valueOf(ret);

			System.out.print(out);
		}
	}
}