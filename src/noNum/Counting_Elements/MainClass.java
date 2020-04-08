package noNum.Counting_Elements;

import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: O(nlogn) sort
    // Space Complexity: O(n)
    // Notes: HashMap
    // public int countElements(int[] arr) {
    //     // Edge
    //     if(arr == null || arr.length == 0 || arr.length == 1){
    //         return 0;
    //     }
    //     Arrays.sort(arr);
    //     HashMap<Integer, Integer> hm = new HashMap<>();
    //     for(int i = 0; i < arr.length; i++){
    //         if(hm.containsKey(arr[i])){
    //             hm.put(arr[i],hm.get(arr[i]) + 1);
    //         }else{
    //             hm.put(arr[i], 1);
    //         }
    //     }
    //     int sum = 0;
    //     for(int k = 0; k < arr.length; k++){
    //         if(hm.containsKey(arr[k]) && hm.containsKey(arr[k] + 1)){
    //             sum += hm.get(arr[k]);
    //             hm.remove(arr[k]);
    //         }
    //     }
    //     return sum;    
    // }
    // End of Approach 1
    
    
    // Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Notes: HashSet
    public int countElements(int[] arr) {
        // Edge
        if(arr == null || arr.length == 0 || arr.length == 1){
            return 0;
        }
        
        Set<Integer> hs = new HashSet<>();
        for(int x: arr){
            hs.add(x);
        }
        int res = 0;
        for(int x: arr){
            if(hs.contains(x + 1)){
                res++;
            }
        }
        return res;
    }
    // End of Approach 2
    
    
}
