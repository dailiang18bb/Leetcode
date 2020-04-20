package algorithm.No_0113_Path_Sum_II;


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
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		// Edge
		if (root == null) {
			return new ArrayList<>();
		}
		//
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		helper(root, new ArrayList<Integer>(), sum, res);
		return res;
	}

	private void helper(TreeNode node, List<Integer> path, int sum, List<List<Integer>> res) {
		if (node == null) {
			return;
		}
		sum = sum - node.val;
		List<Integer> tempList = new ArrayList<>(path);
		tempList.add(node.val);
		helper(node.left, tempList, sum, res);
		helper(node.right, tempList, sum, res);

		if (node.left == null && node.right == null && sum == 0) {
			// find
			res.add(tempList);
		}
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

	public static String integerArrayListToString(List<Integer> nums, int length) {
		if (length == 0) {
			return "[]";
		}

		String result = "";
		for (int index = 0; index < length; index++) {
			Integer number = nums.get(index);
			result += Integer.toString(number) + ", ";
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static String integerArrayListToString(List<Integer> nums) {
		return integerArrayListToString(nums, nums.size());
	}

	public static String int2dListToString(List<List<Integer>> nums) {
		StringBuilder sb = new StringBuilder("[");
		for (List<Integer> list : nums) {
			sb.append(integerArrayListToString(list));
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
			line = in.readLine();
			int sum = Integer.parseInt(line);

			List<List<Integer>> ret = new Solution().pathSum(root, sum);

			String out = int2dListToString(ret);

			System.out.print(out);
		}
	}
}