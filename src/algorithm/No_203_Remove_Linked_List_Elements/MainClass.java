package algorithm.No_203_Remove_Linked_List_Elements;

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
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

import java.io.*;


class Solution {
    
    // Approach 1
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Notes: Iteratively
//     public ListNode removeElements(ListNode head, int val) {
//         // Edge
//         if(head == null) return null;
        
//         ListNode curr = head;
//         ListNode prev = head;
//         while(curr != null){
//             if(curr.val == val){
//                 if(prev == curr){
//                     head = prev.next;
//                     prev = prev.next;
//                 }else{
//                     prev.next = curr.next;
//                 }
//                 curr = curr.next;
//             }else{
//                 prev = curr;
//                 curr = curr.next;
//             }
//         }
//         return head;
//     }
    // End of Approach 1
    
    
    
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: Recursively
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        return helper(head, val);
    }
    
    public ListNode helper(ListNode node, int val){
        if(node == null) return node;
        ListNode curr = helper(node.next, val);
        if(node.val == val) return curr;
        node.next = curr;
        return node;
    }
    
    // End of Approach 2
    
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);
            line = in.readLine();
            int val = Integer.parseInt(line);
            
            ListNode ret = new Solution().removeElements(head, val);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}