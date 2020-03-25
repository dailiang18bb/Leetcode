package algorithm.No_0445_Add_Two_Numbers_II;

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


// Definition for singly-linked list.

import java.io.*;
import java.util.*;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class Solution {
    // Approach 1
    // Time Complexity: 
    // Space Complexity:
    // Notes:
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // edge, no
        
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode res = new ListNode(0);
        Stack<Integer> ll1 = new Stack<>();
        Stack<Integer> ll2 = new Stack<>();
        while(n1 != null){
            ll1.push(n1.val);
            n1 = n1.next;
        }
        while(n2 != null){
            ll2.push(n2.val);
            n2 = n2.next;
        }
        int carry = 0;
        while( !ll1.isEmpty() || !ll2.isEmpty()){
            int sum = 0;
            if(!ll1.isEmpty()){
                sum += ll1.pop();
            }
            if(!ll2.isEmpty()){
                sum += ll2.pop();
            }
            sum += carry;
            carry = sum / 10;
            ListNode temp = res.next;
            res.next = new ListNode(sum % 10);
            res.next.next = temp;
        }
        
        if(carry == 1){
            ListNode temp = res.next;
            res.next = new ListNode(1);
            res.next.next = temp;
        }
        return res.next;
        
        
    }
    // End of Approach 1
    
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