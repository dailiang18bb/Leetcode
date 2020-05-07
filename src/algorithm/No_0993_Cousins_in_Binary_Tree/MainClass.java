package algorithm.No_0993_Cousins_in_Binary_Tree;

import java.util.*;
import java.io.*;

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

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Solution {
    

    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: BFS
	public boolean isCousins(TreeNode root, int x, int y) {
		//
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		boolean found = false;
		List<Integer> ind = new ArrayList<>();
		while (!q.isEmpty()) {
			int length = q.size();
			for (int i = 0; i < length; i++) {
				TreeNode n = q.poll();
				if (n == null)
					continue;
				if (n.val == x || n.val == y) {
					found = true;
					ind.add(i);
				}
				q.add(n.left);
				q.add(n.right);
			}
			if (found) {
				if (ind.size() == 2 && ind.get(0) / 2 != ind.get(1) / 2) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            line = in.readLine();
            int x = Integer.parseInt(line);
            line = in.readLine();
            int y = Integer.parseInt(line);
            
            boolean ret = new Solution().isCousins(root, x, y);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}