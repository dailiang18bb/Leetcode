package algorithm.No_1_TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        
        for(int i = 0; i<numbers.length; i++){
            int complement = target - numbers[i];
            if(numMap.containsValue(complement)){
                return new int[] {numMap.get(complement)+1, i+1};
            }
            numMap.put(numbers[i],i);
            throw new IllegalArgumentException("No solution find.");
        }
        return null;
        
    }
            


    
}

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        
//        for(int i = 0; i<nums.length;i++){
//            int complement = target - nums[i];
//            if (map.containsKey(complement)){
//                return new int[] { map.get(complement), i };
//            }
//            map.put(nums[i],i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//}



//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = 0; i<nums.length;i++){
//            int complement = target - nums[i];
//            if (arr.contains(complement)){
//                return new int[] { arr.indexOf(complement), i };
//            }
//            arr.add(nums[i]);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//}
//
//class Solution {
//
//    public int[] twoSum(int[] nums, int target) {
//        
//        int[] result = new int[2];
//        
//        for(int i=0;i< nums.length - 1;i++){
//            for(int j = i + 1; j<nums.length ; j++){
//                if (nums[i] + nums[j] == target){
//                    result[0] = i;
//                    result[1] = j;
//                    break;
//                }
//            }
//        }
//        
//        return result;
//        
//    }
//}

// Time complexity : O(n^2)
// Space complexity : O(1) 


/**
 * 
 */

/* Approach 1: Brute Force
 * 
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
*/


/*
 * Approach 2: Two-pass Hash Table

public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
// Time complexity : O(n)
// Space complexity : O(n) 

*/

/*
 * Approach 3: One-pass Hash Table
 * 
 * 

public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
// Time complexity : O(n)
// Space complexity : O(n) 

 * 
 */

