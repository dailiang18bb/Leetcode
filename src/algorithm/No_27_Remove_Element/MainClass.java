package algorithm.No_27_Remove_Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

	// my code
	public int removeElement(int[] nums, int val) {
		int result = 0;
		int startPointer = 0;
		int backPointer = nums.length - 1;

		// arrary length <= 1 check
		if (nums.length <= 0) {
			return 0;
		} else if (nums.length == 1 && nums[0] == val) {
			return 0;
		} else if (nums.length == 1 && nums[0] != val) {
			return 1;
		}

		while (startPointer <= backPointer) {
			if (nums[startPointer] == val) {
				result++;
				swap(nums, startPointer, backPointer);
				backPointer--;
				if (backPointer < 0) {
					return nums.length - result;
				}
			} else {
				startPointer++;
			}
		}
		return nums.length - result;
	}

	private void swap(int[] nums, int firstNum, int secondNum) {
		int temp = nums[firstNum];
		nums[firstNum] = nums[secondNum];
		nums[secondNum] = temp;
	}
	// end of my code
	// time complexity O(n)
	// space complexity O(1)
	
//  Solution 2 
//	public int removeElement(int[] nums, int val) {
//		// edge case check
//		if (nums == null || nums.length == 0) {
//			return 0;
//		}
//
//		int pOne = 0;
//		int pTwo = 0;
//		while (pTwo < nums.length) {
//			if (nums[pTwo] == val) {
//				pTwo++;
//			} else {
//				nums[pOne] = nums[pTwo];
//				pOne++;
//				pTwo++;
//			}
//		}
//		return pOne;
//	}
	
	
	
	
//	Solution3
//    public int removeElement(int[] nums, int val) {
//        // edge case check
//        if(nums == null || nums.length == 0){
//            return 0;
//        }
//        
//        int left = 0;
//        int right = nums.length -1;
//        while(left <= right){
//            if(nums[left] == val){
//                nums[left] = nums[right];
//                right--;
//            }else{
//                left++;
//            }
//        }
//        return left;
//    }

}

// Question intro
public class MainClass {
	public static int[] stringToIntegerArray(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new int[0];
		}

		String[] parts = input.split(",");
		int[] output = new int[parts.length];
		for (int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
		}
		return output;
	}

	public static String integerArrayToString(int[] nums, int length) {
		if (length == 0) {
			return "[]";
		}

		String result = "";
		for (int index = 0; index < length; index++) {
			int number = nums[index];
			result += Integer.toString(number) + ", ";
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static String integerArrayToString(int[] nums) {
		return integerArrayToString(nums, nums.length);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			int[] nums = stringToIntegerArray(line);
			line = in.readLine();
			int val = Integer.parseInt(line);

			int ret = new Solution().removeElement(nums, val);
			String out = integerArrayToString(nums, ret);

			System.out.print(out);
		}
	}
}
