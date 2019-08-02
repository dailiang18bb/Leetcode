package algorithm.No_429_N_ary_Tree_Level_Order_Traversal;

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

//  public List<List<Integer>> levelOrder(Node root) {
//      List<List<Integer>> res = new ArrayList<>();
//      if(root == null) return res;
//      helper(root, res, 0);
//      return res;
//  }

//  public void helper(Node node, List<List<Integer>> list, int level){
//      if(node != null){
//          if( level >= list.size()){
//              List<Integer> lvl = new ArrayList<>();
//              list.add(lvl);
//          }
//          list.get(level).add(node.val);
//          for(Node n: node.children){
//              helper(n, list, level + 1);
//          }
//      }
//  }
	
	// End of Approach 1

	
	
	
	// Approach 2
	// Time Complexity: O(N)
	// Space Complexity: O(N)
	// Notes: Iterative

	public List<List<Integer>> levelOrder(Node root) {

		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}

		Queue<Node> queue = new LinkedList<>();
		int level = 0;
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> row = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				Node curr = queue.poll();
				queue.addAll(curr.children);
				row.add(curr.val);
			}
			res.add(row);
		}
		return res;
	}
	// End of Approach 2

}
