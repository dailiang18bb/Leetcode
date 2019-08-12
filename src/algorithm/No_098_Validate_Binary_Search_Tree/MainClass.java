package algorithm.No_098_Validate_Binary_Search_Tree;

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

	class Solution {

		// Approach 1
		// Time Complexity: O(N)
		// Space Complexity: O(N)
		// Notes: Draw a tree map to figure out the valid value range

//     public boolean isValidBST(TreeNode root) {
//         if(root == null) return true;
//         return helper(root,null,null);
//     }

//     // Helper
//     public boolean helper(TreeNode n, Integer lower, Integer upper){
//         if(n == null) return true;

//         int val = n.val;
//         if(lower != null && val <=lower) return false;
//         if(upper != null && val >=upper) return false;
//         boolean left = helper(n.left, lower, val);
//         boolean right = helper(n.right, val, upper);
//         return left && right;
//     }
		// End of Approach 1

		// Approach 2
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		// Notes: Inorder search

		public boolean isValidBST(TreeNode root) {
			if (root == null)
				return true;

			Stack<TreeNode> stack = new Stack<>();
			Integer pVal = null;
			TreeNode curr = root;
			while (curr != null || !stack.isEmpty()) {
				while (curr != null) {
					stack.push(curr);
					curr = curr.left;
				}
				curr = stack.pop();
				if (pVal != null && curr.val <= pVal)
					return false;
				pVal = curr.val;
				curr = curr.right;
			}
			return true;
		}

	}

	public class MainClass {
		public TreeNode stringToTreeNode(String input) {
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

		public String booleanToString(boolean input) {
			return input ? "True" : "False";
		}

		public void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line = in.readLine()) != null) {
				TreeNode root = stringToTreeNode(line);

				boolean ret = new Solution().isValidBST(root);

				String out = booleanToString(ret);

				System.out.print(out);
			}
		}
	}
}