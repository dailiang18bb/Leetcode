package algorithm.No_173_Binary_Search_Tree_Iterator;

import java.util.*;

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

// Approach 1
// Time Complexity: O(N)
// Space Complexity: O(N)

class BSTIterator {

	List<Integer> list;

	public BSTIterator(TreeNode root) {
		list = new LinkedList<Integer>();
		inOrderHelper(root);
	}

	private void inOrderHelper(TreeNode n) {
		if (n != null) {
			inOrderHelper(n.left);
			list.add(n.val);
			inOrderHelper(n.right);
		}
	}

	/** @return the next smallest number */
	public int next() {
		if (!list.isEmpty()) {
			int res = list.get(0);
			list.remove(0);
			return res;
		}
		return -1;
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !list.isEmpty();
	}
}

/**
 * Your BSTIterator object will be instantiated and called as such: BSTIterator
 * obj = new BSTIterator(root); int param_1 = obj.next(); boolean param_2 =
 * obj.hasNext();
 */

public class MainClass {

}
