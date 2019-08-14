package algorithm.No_700_Search_in_a_Binary_Search_Tree;

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
	// Time Complexity: O(logn) height of the tree
	// Space Complexity: O(logn)
	// Notes: Recursive

//     public TreeNode searchBST(TreeNode root, int val) {
//         if(root == null) return null;
//         return helper(root, val);
//     }

//     public TreeNode helper(TreeNode n, int target){
//         if(n == null) return null;
//         TreeNode curr = null;
//         if(n.val > target){
//             curr = helper(n.left, target);
//         }else if(n.val < target){
//             curr = helper(n.right, target);
//         }else{
//             return n;
//         }
//         return  curr;
//     }
	// End of Approach 1

	// Approach 2
	// Time Complexity: O(logn) height of the tree
	// Space Complexity: O(1)
	// Notes: Iterative

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null)
			return null;
		TreeNode n = root;
		while (n != null) {
			if (n.val > val) {
				n = n.left;
			} else if (n.val < val) {
				n = n.right;
			} else {
				return n;
			}
		}
		return null;
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
			TreeNode root = stringToTreeNode(line);
			line = in.readLine();
			int val = Integer.parseInt(line);

			TreeNode ret = new Solution().searchBST(root, val);

			String out = treeNodeToString(ret);

			System.out.print(out);
		}
	}
}