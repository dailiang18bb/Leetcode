package algorithm.No_160_Intersection_of_Two_Linked_Lists;

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		// Approach 1
		// n = length of list A
		// m = length of list B
		// Time Complexity: O(n + m)
		// Space Complexity: O(Max(m,n))
		// Notes: Hashtable

//         // Edge
//         if(headA == null || headB == null) return null;

//         Set<ListNode> hashSet = new HashSet<>();
//         ListNode ptr1 = headA;
//         ListNode ptr2 = headB;

//         while(ptr1 != null){
//             hashSet.add(ptr1);
//             ptr1 = ptr1.next;
//         }
//         while(ptr2 != null){
//             if(hashSet.contains(ptr2)){
//                 return ptr2;
//             }else{
//                 ptr2 = ptr2.next;
//             }
//         }
//         return null;
//         // End of Approach 1

		// Approach 2
		// n = length of list A
		// m = length of list B
		// Time Complexity: O(n + m)
		// Space Complexity: O(1)
		// Notes: Two pointers, trim the longer list first.

//         // Edge
//         if(headA == null || headB == null) return null;

//         ListNode ptr1 = headA;
//         ListNode ptr2 = headB;
//         int sizeA = 0;
//         int sizeB = 0;
//         while(ptr1 != null){
//             sizeA++;
//             ptr1 = ptr1.next;
//         }
//         while(ptr2 != null){
//             sizeB++;
//             ptr2 = ptr2.next;
//         }

//         int diff = 0;
//         if(sizeA >= sizeB){
//             ptr1 = headA;
//             ptr2 = headB;
//             diff = sizeA - sizeB;
//         }else{
//             ptr1 = headB;
//             ptr2 = headA;
//             diff = sizeB - sizeA;
//         }

//         for(int i = 0; i < diff; i++){
//             ptr1 = ptr1.next;
//         }

//         while(ptr1 != null){
//             if(ptr1 == ptr2) return ptr1;
//             ptr1 = ptr1.next;
//             ptr2 = ptr2.next;
//         }
//         return null;
//         // End of Approach 2

		// Approach 3
		// n = length of list A
		// m = length of list B
		// Time Complexity: O(n + m)
		// Space Complexity: O(1)
		// Notes: Two pointers, iteration twice, make them move the same length

		// Edge
		if (headA == null || headB == null)
			return null;

		ListNode ptr1 = headA;
		ListNode ptr2 = headB;

		while (ptr1 != ptr2) {
			ptr1 = ptr1 == null ? headB : ptr1.next;
			ptr2 = ptr2 == null ? headA : ptr2.next;
		}
		return ptr1;
		// End of Approach 3

	}
	
	
	// For the MainClass
	public ListNode getIntersectionNode(int intersectVal, ListNode listA, ListNode listB, int skipA, int skipB) {
		return null;
	}
}
