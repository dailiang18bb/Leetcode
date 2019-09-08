package algorithm.No_090_Subsets_II;

import java.util.*;
import java.io.*;


/*
 * 
 * 
Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
*/

class Solution {

	// Approach 1
	// Time Complexity: O(2^n)
	// Sapce Complexity: O(2^n)
	// Notes: backtracking
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		if (nums == null || nums.length == 0)
			return new ArrayList();
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		helper(nums, 0, new ArrayList<Integer>(), res);
		return res;
	}

	private void helper(int[] nums, int start, List<Integer> path, List<List<Integer>> res) {
		res.add(new ArrayList(path));
		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i - 1]) {
				continue;
			}
			path.add(nums[i]);
			helper(nums, i + 1, path, res);
			path.remove(path.size() - 1);
		}
	}
	// End of Approach 1

	// Approach 2
	// Time Complexity:
	// Space Complexity:
	// Notes: backtracking, Not accept

//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         if(nums == null || nums.length == 0) return new ArrayList();
//         List<List<Integer>> res = new ArrayList<>();
//         dfs(nums, 0 , new ArrayList<Integer>(), res, true);
//         return res;
//     }

//     private void dfs(int[] nums, int index, List<Integer> path, List<List<Integer>> res, boolean choosePre){
//         if(index >= nums.length){
//             res.add(new ArrayList(path));

//         }else{
//             path.add(new Integer(nums[index]));
//             dfs(nums, index + 1, path, res, true);
//             path.remove(new Integer(nums[index]));
//             if(index >0 && nums[index] == nums[index - 1] && choosePre){
//                 return;
//             }
//             dfs(nums, index + 1, path, res, false);
//         }
//     }
	// End of Approach 2

}

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

	public static String integerArrayListToString(List<Integer> nums, int length) {
		if (length == 0) {
			return "[]";
		}

		String result = "";
		for (int index = 0; index < length; index++) {
			Integer number = nums.get(index);
			result += Integer.toString(number) + ", ";
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static String integerArrayListToString(List<Integer> nums) {
		return integerArrayListToString(nums, nums.size());
	}

	public static String int2dListToString(List<List<Integer>> nums) {
		StringBuilder sb = new StringBuilder("[");
		for (List<Integer> list : nums) {
			sb.append(integerArrayListToString(list));
			sb.append(",");
		}

		sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			int[] nums = stringToIntegerArray(line);

			List<List<Integer>> ret = new Solution().subsetsWithDup(nums);

			String out = int2dListToString(ret);

			System.out.print(out);
		}
	}
}