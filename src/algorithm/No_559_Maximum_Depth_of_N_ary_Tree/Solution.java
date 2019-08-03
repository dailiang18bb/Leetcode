package algorithm.No_559_Maximum_Depth_of_N_ary_Tree;


import java.util.*;


//Definition for a Node.
class Node {
 public int val;
 public List<Node> children;

 public Node() {}

 public Node(int _val,List<Node> _children) {
     val = _val;
     children = _children;
 }
};

class Solution {
 
 
 // Approach 1
 // Time Complexity: O(N)
 // Space Complexity: O(N)
 // Notes: Top-Down
 
 
//  public int maxDepth(Node root) {
//      if(root == null) return 0;
//      return helper(root, 1, 1);
//  }
 
//  public int helper(Node node, int depth, int maxDep){
//      if(node == null) return maxDep;
//      if(node.children.size() == 0){
//          return Math.max(depth, maxDep);
//      }
     
//      for(Node n : node.children){
//          maxDep = helper(n , depth + 1 , maxDep);
//      }
//      return maxDep;
//  }
 // End of Approach 1
 
 
 
 // Approach 2
 // Time Complexity: O(N)
 // Space Complexity: O(N)
 // Notes: Bottom-up
 
 public int maxDepth(Node root) {
     if(root == null) return 0;
     return helper(root);
 }
 
 public int helper(Node node){
     if(node == null) return 0;
     int maxRow = 0;
     for(Node n : node.children){
         maxRow = Math.max(maxRow, helper(n));
     }
     return maxRow + 1;
 }
 // End of Approach 2
 
}