package algorithm.No_142_Linked_List_Cycle_II;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        // Approach 1
        // Time Complexity:O(n)
        // Space Complexity: O(n)
        // Notes: Hashtable
        
//         // edge
//         if(head == null||head.next == null) return null;
        
//         Set<ListNode> hashset = new HashSet<>();
//         ListNode curr = head;
//         while(curr.next != null){
//             if(!hashset.add(curr)) return curr;
//             curr = curr.next;
//         }
//         return null;
//         // End of Approach 1
        
        
        // Approach 2
        // Time Complexity:  O(n)
        // Space Complexity: O(1)
        // Notes: two pointers
        
        // edge
        if(head == null||head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){ // cycle detected
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                    if(fast == slow){
                        return fast;
                    }
                }
                return fast;
            }
        }
        return null;

        // End of Approach 2
        
        
    }
    
    // For MainClass
    public ListNode detectCycle(ListNode head, int pos) {
    	return null;
    }
}