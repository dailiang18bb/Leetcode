package algorithm.No_724_Find_Pivot_Index;

class Solution {
	public int pivotIndex(int[] nums) {

		if (nums == null)
			return -1;
		
		int sum = 0, leftSum = 0;
		for (int n : nums) {
			sum += n;
		} // sum the whole array
		
		for (int i = 0; i < nums.length; i++) {
			if (leftSum == sum - nums[i] - leftSum)
				return i;
			leftSum += nums[i];
		}
		return -1;
	}
}
// 
// Runtime: 37 ms
// Beats: 85.43%






/*
 * My first attempt
 * 


class Solution {
	public int pivotIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int sumLeft = 0;
			int sumRight = 0;
			if (i == 0) {
				for (int k = i; k < nums.length - 1; k++) {
					sumRight = sumRight + nums[k + 1];
				}
			} else if (i == nums.length -1) {
				for (int j = i; j > 0; j--) {
					sumLeft = sumLeft + nums[j - 1];
				}
			} else {
				for (int j = i; j > 0; j--) {
					sumLeft = sumLeft + nums[j - 1];
				}
				for (int k = i; k < nums.length -1; k++) {
					sumRight = sumRight + nums[k + 1];
				}
			}
			if (sumLeft == sumRight) {
				return i;
			}
		}
		return -1;
	}
}

// Runtime: 538 ms
// Beats 2.97%


 * 
 */


/*
 *  Second shot
 *  it's clunky, it should calculate from left

public class Solution {
	public int pivotIndex(int[] nums) {
		int sum = 0, rightSum = 0;
		int it = -1;

		for (int n : nums) {
			sum += n;
		} // sum the whole array
		for (int i = nums.length - 1; i >= 0; i--) {
			if (rightSum == sum - nums[i] - rightSum) {
				it = i;
			}
			rightSum += nums[i];
		}
		if (it == -1) {
			return -1;
		} else {
			return it;
		}
	}

}

// Runtime: 40 ms
// Beats: 62.03%



 */



/**
 * Answer Key
 * 

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}

// Complexity Analysis
// Time Complexity: O(N), where N is the length of nums.
// Space Complexity: O(1), the space used by leftsum and S.

*/
