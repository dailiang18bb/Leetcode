package algorithm.No_747_Largest_Number_At_Least_Twice_of_Others.copy;

import java.util.Arrays;

class Solution {
	public int dominantIndex(int[] nums) {
		int largest = 0;
		int index = 0;
		int secondLargest = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				secondLargest = largest;
				largest = nums[i];
				index = i;
			} else if (nums[i] > secondLargest) {
				secondLargest = nums[i];
			}
		}
		return largest >= 2 * secondLargest ? index : -1;
	}
}

// Runtime: 18 ms
// Beats: 77.28%




/**
 * Answer Key
 * 
 * 


class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (maxIndex != i && nums[maxIndex] < 2 * nums[i])
                return -1;
        }
        return maxIndex;
    }
}





*/
