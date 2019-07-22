package algorithm.No_141_Linked_List_Cycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // Approach 1
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Notes: Floyd's Cycle Detection Algorithm
        
        if(head == null || head.next == null){return false;}
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){return true;}
        }
        return false;
        // End of Approach 1
        
        
        // Approach 2
        // Time Complexity: O(n);
        // Space Complexity: O(n)
        // Notes: HashSet
        
        // if(head == null || head.next == null){return false;}
        // Set<ListNode> mySet = new HashSet<>();
        // while(head.next != null){
        //     if(!mySet.add(head)){return true;}
        //     head = head.next;
        // }
        // return false;
        // End of Approach 2
        
        
    }
}