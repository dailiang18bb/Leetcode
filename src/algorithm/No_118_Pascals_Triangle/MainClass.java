package algorithm.No_118_Pascals_Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.


Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

*/

class Solution {

	// Approach 1
	// Time Complexity: O(numRows^2)
	// Space Complexity:O(numRows^2)
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> re = new ArrayList<>();
//         //edge check
//         if(numRows == 0){ return re;}

//         for(int i = 0; i< numRows; i++){
//             List<Integer> row = new ArrayList<>();
//             for(int k = 0; k <= i; k++){
//                 if(k == 0 || k == i){
//                     row.add(k,1);
//                 }else{
//                     int sum = re.get(i-1).get(k-1) + re.get(i-1).get(k);
//                     row.add(k,sum);
//                 }
//             }
//             re.add(row);
//         }
//         return re;
//     }
	// End of Approach 1

	// Approach 2
	// Time Complexity: O(numRows^2)
	// Space Complexity: O(numRows^2)
	// Notes: Recursion
	public List<List<Integer>> generate(int numRows) {
		// Edge
		if (numRows < 1)
			return new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		helper(res, 0, numRows - 1);
		return res;
	}

	private void helper(List<List<Integer>> res, int row, int numRows) {
		if (row == numRows + 1) {
			return;
		}
		ArrayList<Integer> rowList = new ArrayList<>();
		for (int i = 0; i <= row; i++) {
			if (i == 0 || i == row) {
				rowList.add(1);
			} else {
				int val = res.get(row - 1).get(i - 1) + res.get(row - 1).get(i);
				rowList.add(val);
			}
		}
		res.add(rowList);
		helper(res, row + 1, numRows);
	}
	// End of Approach 2

}

public class MainClass {
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
			int numRows = Integer.parseInt(line);

			List<List<Integer>> ret = new Solution().generate(numRows);

			String out = int2dListToString(ret);

			System.out.print(out);
		}
	}
}