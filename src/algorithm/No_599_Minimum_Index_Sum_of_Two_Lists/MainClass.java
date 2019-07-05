package algorithm.No_599_Minimum_Index_Sum_of_Two_Lists;

import java.io.IOException;
import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        // Approach 1
        // Time Complexity: O(l1 + l2)
        // Space Complexity: O(l1 + l2)
        
        // Edge check
        
        Map<String, Integer> hashmap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        
        // put list1 into hashmap
        for(Integer i =0; i < list1.length; i++){
            hashmap.put(list1[i], i);
        }
        
        // check duplicate
        for(int k = 0; k < list2.length && k <= min; k++){
            if(hashmap.containsKey(list2[k])){
                int sumInd = hashmap.get(list2[k]) + k;
                if(sumInd < min){
                    res.clear();
                    res.add(list2[k]);
                    min = sumInd;
                }else if(sumInd == min){
                    res.add(list2[k]);
                }
            }
        }
        
        return res.toArray(new String[res.size()]);
        // End of Approach 1
        
        
//         // Approach 2
//         // Time Complexity: O(l1 * l2 * x)
//         // Space Complexity: O(l1 * l2 * x)
        
        
//         Map<Integer, List<String>> hashmap = new HashMap<>();
//         int min = 2000;
        
//         for(int i = 0; i < list1.length; i++){
//             for(int k = 0; k < list2.length; k++){
//                 if(list2[k].equals(list1[i])){
//                     int sum = i + k;
//                     min = min > sum? sum: min;
//                     if(hashmap.containsKey(sum)){
//                         hashmap.get(sum).add(list2[k]);
//                     }else{
//                         List<String> temp = new ArrayList<>();
//                         temp.add(list2[k]);
//                         hashmap.put(sum, temp);
//                     }
//                 }
//             }
//         }
//         return hashmap.get(min).toArray(new String[hashmap.get(min).size()]);
//         // End of Approach 2
        
    }
}

public class MainClass{

	public static void main(String[] args) {
		
	}
}