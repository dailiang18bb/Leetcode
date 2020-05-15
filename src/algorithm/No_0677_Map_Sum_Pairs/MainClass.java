package algorithm.No_0677_Map_Sum_Pairs;


import java.util.*;



//class Node{
//String key;
//int value;
//int sumValue;
//HashMap<Character, Node> children;
//public Node(){
//  children = new HashMap<>();
//}
//}

//class MapSum {
//Node root;
///** Initialize your data structure here. */
//public MapSum() {
//  root = new Node();
//}

//public void insert(String key, int val) {
//  Node curr = root;
//  for(Character x : key.toCharArray()){
//      if(!curr.children.containsKey(x)){
//          curr.children.put(x, new Node());
//      }
//      curr.sumValue += val;
//      curr = curr.children.get(x);
//  }
//  curr.key = key;
//  curr.value = val;
//  curr.sumValue = val;
//}

//public int sum(String prefix) {
//  Node curr = root;
//  for(Character x : prefix.toCharArray()){
//      if(!curr.children.containsKey(x)){
//          return 0;
//      }
//      curr = curr.children.get(x);
//  }
//  //dfs
//  return dfs(curr);
//}

//private int dfs(Node n){
//  if(n == null){
//      return 0;
//  }
//  int sum = n.value;
//  for(Character c : n.children.keySet()){
//      sum += dfs(n.children.get(c));
//  }
//  return sum;
//}
//}


//Approach 1

class MapSum {
HashMap<String, Integer> hm;
/** Initialize your data structure here. */
public MapSum() {
 hm = new HashMap<String,Integer>();
}

// Time Complexity: O(1)
// Space Complexity: O(1)
public void insert(String key, int val) {
 hm.put(key,val);
}

// Time Complexity: O(n * p) n is the size of the hashmap, p is the length of prefix
// Space Complexity: O(1)
public int sum(String prefix) {
 int count = 0;
 for(String x : hm.keySet()){
     if(x.startsWith(prefix)){
         count += hm.get(x);
     }    
 }
 return count;
}
}

/**
* Your MapSum object will be instantiated and called as such:
* MapSum obj = new MapSum();
* obj.insert(key,val);
* int param_2 = obj.sum(prefix);
*/



public class MainClass {

}
