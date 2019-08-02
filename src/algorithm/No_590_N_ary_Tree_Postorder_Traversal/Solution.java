package algorithm.No_590_N_ary_Tree_Postorder_Traversal;

import java.util.*;

//Definition for a Node.
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
	// Time Complexity: O(N)
	// Space Complexity: O(N)
	// Notes: Recursive

//  public List<Integer> postorder(Node root) {
//      List<Integer> list = new ArrayList<>();
//      if(root == null) return list;
//      helper(root, list);
//      list.add(root.val);
//      return list;
//  }

//  public void helper(Node node, List<Integer> list){
//      if(node != null){
//          for(Node n: node.children){
//              helper(n, list);
//              list.add(n.val);
//          }
//      }
//  }
	// End of Approach 1

	// Approach 2
	// Time Complexity: O(N)
	// Space Complexity: O(N)
	// Notes: Iterative, reverse the preorder list
	public List<Integer> postorder(Node root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;

		Stack<Node> stack = new Stack<>();
		stack.add(root);
		while (!stack.isEmpty()) {
			Node curr = stack.pop();
			List<Node> child = curr.children;
			for (int i = 0; i < child.size(); i++) {
				stack.add(child.get(i));
			}
			list.add(0, curr.val);

		}
		return list;
		// End of Approach 2
	}
}