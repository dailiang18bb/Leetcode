package algorithm.No_0637_Average_of_Levels_in_Binary_Tree;

import java.util.*;
import java.io.*;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

}

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
	// Time Complexity: O(n), where n is the number of nodes in the tree,
	// Space Complexity: O(m), where m is the maximum size of queue
	// Notes: BFS

	public List<Double> averageOfLevels(TreeNode root) {
		// edge, non-empty tree

		List<Double> res = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int qSize = q.size();
			double avgSum = 0;
			for (int i = 0; i < qSize; i++) {
				TreeNode curr = q.poll();
				avgSum += curr.val;
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
			res.add(avgSum / qSize);
		}
		return res;
	}
	// End of Approach 1
}
