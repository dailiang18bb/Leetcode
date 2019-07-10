package algorithm.No_094_Binary_Tree_Inorder_Traversal;

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

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;
import java.io.*;


class Solution {
    
    // Approach 1
    // n = number of nodes in the tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Method: Recursive
    // Notes: Inorder => left > current > right
    
    
//     public List<Integer> inorderTraversal(TreeNode root) {
        
//         // Edge case
//         if(root==null){return new LinkedList();}

//         List<Integer> res = new LinkedList<>();
//         inorderTraversalHelper(root, res);
//         return res;
//     }
    
//     // Helper function
//     private void inorderTraversalHelper(TreeNode node, List treeList){
//         if(node != null){
//             inorderTraversalHelper(node.left, treeList);
//             treeList.add(node.val);
//             inorderTraversalHelper(node.right, treeList);
//         }
//     }
    
    // End of Approach 1
    
    
    // Approach 2
    // n = number of nodes in the tree
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Method:iterative, Stack
    
    public List<Integer> inorderTraversal(TreeNode root) {
        // Edge case
        if(root == null){ return new LinkedList();}
        
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode visit = root;
        while(visit != null || !treeStack.empty()){
            while(visit != null){
                treeStack.push(visit);
                visit = visit.left;
            }
            visit = treeStack.pop();
            res.add(visit.val);
            visit = visit.right;
        }
        return res;
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
        while(!nodeQueue.isEmpty()) {
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
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            
            List<Integer> ret = new Solution().inorderTraversal(root);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}