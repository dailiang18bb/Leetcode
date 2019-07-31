package algorithm.No_155_Min_Stack;

import java.util.*;

class Node{
    int min;
    int val;
    public Node(int x){
        val = x;
        min = x;
    }
}


class MinStack {

    List<Node> data;
    
    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<Node>();
    }
    
    public void push(int x) {
        if(data.isEmpty()){
            data.add(new Node(x));
        }else{
            Node curr = new Node(x);
            Node prev = data.get(data.size()-1);
            curr.min = Math.min(x, prev.min);
            data.add(data.size(), curr);
        }
    }
    
    public void pop() {
        if(data.isEmpty()) return;
        data.remove(data.size()-1);
    }
    
    public int top() {
        if(data.isEmpty()) return -1;
        return data.get(data.size()-1).val;
    }
    
    public int getMin() {
        if(data.isEmpty()) return Integer.MIN_VALUE;
        return data.get(data.size()-1).min;
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */