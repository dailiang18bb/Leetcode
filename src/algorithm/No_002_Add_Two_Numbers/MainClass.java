package algorithm.No_002_Add_Two_Numbers;

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

import java.util.*;
import java.io.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        // Approach 2
        // m,n is the length of l1,l2 respectively
        // Time Complexity: O(Max(m,n))
        // Space Complexity: O(Max(m,n))
        // Notes: 
        
        // Edge case:
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        
        
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode resNode = new ListNode(0);
        ListNode curr = resNode;
        int carry = 0;
        
        while(p1 != null || p2 != null){
            // get the val
            int num1 = p1 == null? 0 : p1.val; 
            int num2 = p2 == null? 0 : p2.val; 
            
            // calculate the sum
            int sum = num1 + num2 + carry;

            // for Next loop
            carry = sum / 10;
            
            // build the next result node
            curr.next = new ListNode(sum % 10);
            // move the result pointer
            curr = curr.next;
            
            // move the nodes pointer
            p1 = p1 == null? null: p1.next; 
            p2 = p2 == null? null: p2.next;
        }
        
        if(carry == 1){
            curr.next = new ListNode(1);
        }
        // return the next;
        return resNode.next;
        // End of Approach 2
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
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);
            
            ListNode ret = new Solution().addTwoNumbers(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}