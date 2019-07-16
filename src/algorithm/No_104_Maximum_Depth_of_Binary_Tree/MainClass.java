package algorithm.No_104_Maximum_Depth_of_Binary_Tree;

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
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: Top-Down
    
//     public int maxDepth(TreeNode root) {
//         // Edge Case
//         if(root==null){return 0;}
//         return maxDepthHelper(root, 1, 1);
//     }
    
//     // Helper function
//     private int maxDepthHelper(TreeNode node, int depth, int maxDep){
//         if(node == null){return maxDep;}
//         if(node.left == null && node.right == null){
//             maxDep = Math.max(depth, maxDep);
//         }
        
//         maxDep = maxDepthHelper(node.left, depth + 1, maxDep);
//         maxDep = maxDepthHelper(node.right, depth + 1, maxDep);   
//         return maxDep;
//     }
    // End of Approach 1
    
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: Bottom-Up
    
    public int maxDepth(TreeNode root) {
        // Edge case
        if(root == null){return 0;}
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
        
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            
            int ret = new Solution().maxDepth(root);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}