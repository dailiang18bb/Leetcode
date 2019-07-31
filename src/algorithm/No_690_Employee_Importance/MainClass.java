package algorithm.No_690_Employee_Importance;

/*
//Employee info
class Employee {
 // It's the unique id of each node;
 // unique id of this employee
 public int id;
 // the importance value of this employee
 public int importance;
 // the id of direct subordinates
 public List<Integer> subordinates;
};
*/

import java.util.*;

//Employee info
class Employee {
	// It's the unique id of each node;
	// unique id of this employee
	public int id;
	// the importance value of this employee
	public int importance;
	// the id of direct subordinates
	public List<Integer> subordinates;
}

class Solution {
 public int getImportance(List<Employee> employees, int id) {
     
     
     // Approach 1
     // N is the length of the List employees
     // Time Complexity: O(N)
     // Space Complexity: O(N)
     // Notes: BFS
     
     // Edge
     if(employees == null) return 0;
     
     int totalVal = 0;
     Queue<Employee> queue = new LinkedList<>();
     Map<Integer, Employee> map = new HashMap<>();
     for(Employee x : employees){
         map.put(x.id, x);
     }
     queue.add(map.get(id));
     while(!queue.isEmpty()){
         int size = queue.size();
         for(int i = 0; i < size; i++){
             Employee curr = queue.poll();
             totalVal += curr.importance;
             for(Integer x : curr.subordinates){
                 queue.add(map.get(x));
             }
         }   
     }
     return totalVal;
     // End of Approach 1
     
     
 }
}

public class MainClass {
	public static void main(String[] args) {
		
	}

}
