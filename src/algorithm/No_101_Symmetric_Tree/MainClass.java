package algorithm.No_101_Symmetric_Tree;

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
    // Notes: Recursive
//     public boolean isSymmetric(TreeNode root) {
//         //Edge
//         if(root == null){return true;}
//         return helper(root,root);
//     }
    
//     private boolean helper(TreeNode t1, TreeNode t2){
//         if(t1 == null && t2 == null){return true;}
//         if(t1 == null || t2 == null){return false;}
//         return (t1.val == t2.val)&&helper(t1.left,t2.right) && helper(t1.right,t2.left);
//     }
    // End of Approach 1
    
    
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: iterative
    public boolean isSymmetric(TreeNode root) {
        TreeNode t1 = root;
        TreeNode t2 = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(t1);
        q.add(t2);
        while(!q.isEmpty()){
            t1 = q.poll();
            t2 = q.poll();
            if(t1 == null & t2 == null){continue;}
            if(t1 == null || t2 == null){return false;}
            if(t1.val != t2.val){return false;}
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
        // End of Approach 2
    }
    

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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            
            boolean ret = new Solution().isSymmetric(root);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}