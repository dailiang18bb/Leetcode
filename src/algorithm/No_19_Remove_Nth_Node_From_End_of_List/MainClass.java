package algorithm.No_19_Remove_Nth_Node_From_End_of_List;

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity:O(1)
        // Notes: brute force
        
//         // Edge
//         if(head == null) return null;
        
//         int length = 0;
//         ListNode curr = head;
//         ListNode prev = head;
//         while(curr != null){
//             length++;
//             curr = curr.next;
//         }
//         length = length - n;
//         curr = head;
//         while (length >0){
//             prev = curr;
//             curr = curr.next;
//             length--;
//         }
//         if(curr == head){
//             head = head.next;
//             return head;
//         }
//         prev.next = curr.next;
//         return head;
//         // End of Approach 1
        
        
        // Approach 2
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Notes: one pass
        
//         // Edge
//         if(head == null) return null;
        
//         ListNode ptr1 = head;
//         ListNode ptr2 = head;
//         ListNode prev = head;
        
//         // Align
//         for(int i = 0; i < n; i++){
//             ptr2 = ptr2.next;
//         }
        
//         // move
//         while(ptr2 != null){
//             prev = ptr1;
//             ptr1 = ptr1.next;
//             ptr2 = ptr2.next;
//         }
//         if(ptr1 == head){
//             head = head.next;
//             return head;
//         }
//         prev.next = ptr1.next;
//         return head;
//         // End of Approach 2
        
        
        // Approach 3
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode ptr1 = temp;
        ListNode ptr2 = temp;
        
        for(int i = 0; i < n + 1; i++){
            ptr2 = ptr2.next;
        }
        while(ptr2 != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        ptr1.next = ptr1.next.next;
        return temp.next;
        // End of Approach 3
    }
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
            int n = Integer.parseInt(line);
            
            ListNode ret = new Solution().removeNthFromEnd(head, n);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}