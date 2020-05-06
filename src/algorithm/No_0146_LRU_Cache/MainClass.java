package algorithm.No_0146_LRU_Cache;

import java.util.*;

class LRUCache {

    
    private LinkedList queue;
    private Map hm;
    private int cap;
    public LRUCache(int capacity) {
        queue = new LinkedList<Integer>();
        hm = new HashMap<Integer, Integer>(capacity);
        cap = capacity;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            queue.remove(new Integer(key));
            queue.add(key);
            return (int)hm.get(key);
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
                hm.put(key, value);
                queue.remove(new Integer(key));
                queue.add(key);
        }else if(hm.size() == cap){
            hm.remove(queue.poll());
            hm.put(key, value);
            queue.add(key);
        }else{
            hm.put(key, value);
            queue.add(key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

public class MainClass {

}
