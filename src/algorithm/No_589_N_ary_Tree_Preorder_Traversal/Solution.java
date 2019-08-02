package algorithm.No_589_N_ary_Tree_Preorder_Traversal;

import java.util.*;

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};

class Solution {

	// Approach 1
	// N is the number of element in the tree
	// Time Complexity: O(N)
	// Space Complexity: O(N)
	// Notes: Recursive
//  public List<Integer> preorder(Node root) {
//      List<Integer> list = new ArrayList<>();
//      if(root == null) return list;
//      list.add(root.val);
//      helper(root, list);
//      return list;
//  }

//  // Helper
//  public void helper(Node node, List<Integer> list){
//      if(node != null){
//          for(Node n : node.children){
//              list.add(n.val);
//              helper(n, list);
//          }
//      }
//  }
	// End of Approach 1

	// Approach 2
	// N is the number of element in the tree
	// Time Complexity: O(N)
	// Space Complexity: O(N)
	// Notes: Iteratively

	public List<Integer> preorder(Node root) {

		List<Integer> list = new ArrayList<>();
		// Edge
		if (root == null)
			return list;

		Stack<Node> stack = new Stack<>();
		stack.add(root);
		while (!stack.isEmpty()) {
			Node curr = stack.pop();
			list.add(curr.val);
			List<Node> child = curr.children;
			for (int i = child.size() - 1; i >= 0; i--) {
				stack.add(child.get(i));
			}
		}
		return list;
		// End of Approach 2
	}
}