package algorithm.No_622_Design_Circular_Queue;

public class MyCircularQueue {

	
	
	// Approach 1
    // Time Complexity: 
    // Space Complexity:
    // Notes: ArrayList
    
    
//     private List<Integer> data;
//     private int frontPtr;
//     private int rearPtr;
//     private int size;
//     private int leftSize;
    

//     /** Initialize your data structure here. Set the size of the queue to be k. */
//     public MyCircularQueue(int k) {
//         data = new ArrayList<Integer>(k);
//         size = k;
//         leftSize = k;
//         frontPtr = 0;
//         rearPtr = -1;
//     }
    
//     /** Insert an element into the circular queue. Return true if the operation is successful. */
//     public boolean enQueue(int value) {
//         if(isFull()) return false;
//         rearPtr = (rearPtr + 1) % size;
//         try{
//             data.get(rearPtr);
//             data.set(rearPtr, value);
//         }catch( IndexOutOfBoundsException e){
//             data.add(rearPtr, value);
//         }
//         leftSize--;
//         return true;
//     }
    
//     /** Delete an element from the circular queue. Return true if the operation is successful. */
//     public boolean deQueue() {
//         if(isEmpty()) return false;
//         frontPtr = (frontPtr + 1) % size;
//         leftSize++;
//         return true;
//     }
    
//     /** Get the front item from the queue. */
//     public int Front() {
//         if(isEmpty()) return -1;
//         return data.get(frontPtr);
//     }
    
//     /** Get the last item from the queue. */
//     public int Rear() {
//         if(isEmpty()) return -1;
//         return data.get(rearPtr);
//     }
    
//     /** Checks whether the circular queue is empty or not. */
//     public boolean isEmpty() {
//         return leftSize == size;
//     }
    
//     /** Checks whether the circular queue is full or not. */
//     public boolean isFull() {
//         return leftSize == 0;
//     }
    // End of Approach 1
    
    
    
    
    // Approach 2
    // Notes: Array
    int[] arr;
    int len;
    int front = 0;
    int rear = 0;
    
    

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        arr = new int[k];
        len = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) return false;
        arr[rear] = value;
        rear = (rear + 1) % arr.length;
        len--;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) return false;
        front = (front + 1) % arr.length;
        len++;
        return true;

    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()) return -1;
        return arr[(rear + arr.length - 1) % arr.length];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return len == arr.length;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return len == 0;
    }
    
    // End of Approach 2
    
}



/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */