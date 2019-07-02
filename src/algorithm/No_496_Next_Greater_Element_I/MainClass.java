package algorithm.No_496_Next_Greater_Element_I;

import java.io.*;
import java.util.*;

class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {

		// Approach 1
		// Time Complexity: O(nums1.length * nums2.length)
		// Space Complexity: O(nums1.length)

//         // Edge check

//         int[] result = new int[nums1.length];
//         Arrays.fill(result, -1);

//         for(int i = 0; i < nums1.length; i++){
//             int temp = nums1[i];
//             int index = 0;
//             for(int j = 0; j < nums2.length; j++){
//                 if(temp == nums2[j]){
//                     index = j;
//                     break;
//                 }
//             }
//             for(int k = index; k < nums2.length; k++){
//                 if(nums2[k] > temp){
//                     result[i] = nums2[k];
//                     break;
//                 }
//             }
//         }
//         return result;
//         // End of Approach 1

		// Approach 2
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)

//         int[] result = new int[nums1.length];
//         Map<Integer, Integer> ht = new Hashtable<>();

//         for(int i = 0; i < nums2.length; i++){
//             int temp = nums2[i];
//             for(int j = i + 1; j < nums2.length; j++){
//                 if(nums2[j] > temp){
//                     ht.put(nums2[i], nums2[j]);
//                     break;
//                 }
//             }
//             if(!ht.containsKey(nums2[i])){
//                 ht.put(nums2[i], -1);
//             }
//         }

//         for(int k = 0; k < result.length; k++){
//             result[k] = ht.get(nums1[k]);
//         }
//         return result;
//         // End of Approach 2

		// Approach 3
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)
		// Notes: Use stack to tracking the next large element

		int[] result = new int[nums1.length];
		Map<Integer, Integer> ht = new Hashtable<>();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < nums2.length; i++) {
			while (!stack.empty() && nums2[i] > stack.peek()) {
				ht.put(stack.pop(), nums2[i]);
			}
			stack.push(nums2[i]);
		}

		for (int k = 0; k < result.length; k++) {
			result[k] = ht.getOrDefault(nums1[k], -1);
		}

		return result;
		// End of Approach 3

	}
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
			int[] nums1 = stringToIntegerArray(line);
			line = in.readLine();
			int[] nums2 = stringToIntegerArray(line);

			int[] ret = new Solution().nextGreaterElement(nums1, nums2);

			String out = integerArrayToString(ret);

			System.out.print(out);
		}
	}
}