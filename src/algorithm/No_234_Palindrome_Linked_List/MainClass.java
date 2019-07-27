package algorithm.No_234_Palindrome_Linked_List;

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
    // Space Complexity: O(n)
    // Notes:
//     public boolean isPalindrome(ListNode head) {
//         // Edge
//         if(head == null || head.next == null) return true;
        
//         // Get the middle point
//         ListNode slow = head;
//         ListNode fast = head;
//         Stack<Integer> stack = new Stack<>();
//         while(fast != null && fast.next != null){
//             stack.push(slow.val);
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         // Align the slow pointer
//         if( fast != null){
//             slow = slow.next;
//         }
        
//         // check the stack with the latter half
//         while(slow != null){
//             if(!stack.pop().equals(slow.val)){
//                 return false;
//             }
//             slow = slow.next;
//         }
//         return true;
//     }
    // End of Approach 1
    
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Notes: Without stack
    // Approach 2
    public boolean isPalindrome(ListNode head) {
        // Edge
        if(head == null || head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while(fast != null && fast.next != null){
            ListNode temp = prev;
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            prev.next = temp;
        }
        
        if(fast != null) slow = slow.next;
        
        while(slow!= null){
            if(slow.val != prev.val){
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);
            
            boolean ret = new Solution().isPalindrome(head);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}