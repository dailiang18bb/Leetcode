package algorithm.No_167_TwoSumII;

import java.util.HashMap;
import java.util.Map;


//class Solution {
//	public int[] twoSum(int[] numbers, int target) {
//		Map<Integer, Integer> numMap = new HashMap<>();
//
//		for (int i = 0; i < numbers.length; i++) {
//			int complement = target - numbers[i];
//			if (numMap.containsKey(complement)) {
//				return new int[] { numMap.get(complement) + 1, i + 1 };
//			}
//			numMap.put(numbers[i], i);
//		}
//		throw new IllegalArgumentException("No two sum solution");
//	}
//}
//Time complexity : O(n)
//Space complexity : O(n) 

class Solution {
	
    public int[] twoSum(int[] numbers, int target) {
    
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[] {start +1, end +1};
            }else if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        return null;
    }
}

//Time complexity : O(n)
//Space complexity : O(1) 




