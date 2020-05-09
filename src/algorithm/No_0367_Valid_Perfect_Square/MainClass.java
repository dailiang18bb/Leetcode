package algorithm.No_0367_Valid_Perfect_Square;

import java.io.*;

class Solution {
	// Approach 1
	// Time Complexity:
	// Space Complexity:
	// Notes: binary search
//     public boolean isPerfectSquare(int num) {
// 		// Edge
// 		if (num <= 0) {
// 			return false;
// 		}
// 		//Integer.MAX_VALUE = 2^32 - 1;
// 		//square root = 2^16
// 		int left = 1;
// 		int right = num;
// 		long overflow = 0;
// 		double gap = Math.pow(2, 16);

// 		while (left <= right) {
// 			int mid = (right - left) / 2 + left;
// 			// System.out.println("MID:::" + mid);
// 			if(mid > gap) {
// 				right = mid - 1;
// 				continue;
// 			}
// 			overflow = (long)mid * (long)mid;
// 			// System.out.println("OVERFLOW:::" + overflow);
// 			if (overflow == num) {
// 				return true;
// 			}
// 			if (overflow > Integer.MAX_VALUE || overflow > num) {
// 				right = mid - 1;
// 			}
// 			if (overflow < num) {
// 				left = mid + 1;
// 			}
// 		}
// 		return false;
// 	}
	// End of Approach 1

	// Approach 2
	// Time Complexity:O(logn)
	// Space Complexity:
	// Notes: Binary search, avoid overflow
	public boolean isPerfectSquare(int num) {
		// Edge
		if (num <= 0) {
			return false;
		}

		int left = 1;
		int right = num;
		while (left <= right) {
			int mid = (right - left) / 2 + left;
			if (num / mid <= mid) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left * left == num;
	}
	// End of Approach 2
}

public class MainClass {
	public static String booleanToString(boolean input) {
		return input ? "True" : "False";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			int num = Integer.parseInt(line);

			boolean ret = new Solution().isPerfectSquare(num);

			String out = booleanToString(ret);

			System.out.print(out);
		}
	}
}