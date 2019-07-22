package algorithm.No_707_Design_Linked_List;

public class MyLinkedList {
    
    class Node{
        int val;
        Node next;
        public Node(int x){
            val = x;
        }
    }

    /** Initialize your data structure here. */
    
    private Node head;
    private int size;
    
    public MyLinkedList() {
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= size || index < 0){return -1;}
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node prev = head;
        head = new Node(val);
        head.next = prev;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        size++;
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size){return;}
        if(index <= 0 ){
            addAtHead(val);
        }else{
            Node temp = head;
            Node curr = new Node(val);
            for(int i = 0; i < index - 1; i ++){
                    temp = temp.next;
            }
            curr.next = temp.next;
            temp.next = curr;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >= size || index < 0){return;}
        size--;
        Node temp = head;
        if(index == 0){
            head = temp.next;
            return;
        }
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


