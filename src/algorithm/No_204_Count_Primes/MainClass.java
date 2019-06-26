package algorithm.No_204_Count_Primes;

import java.io.*;

class Solution {
	public int countPrimes(int n) {

		// Approach 2
		// Time Complexity:
		// Space Complexity:
		// Notes: Sieve of Eratosthenes

		// Edge check
		if (n <= 2) {
			return 0;
		}

		int[] arr = new int[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (arr[i] == 0) {
				count++;
				if (i < Math.sqrt(n)) {
					for (int k = i * i; k < n; k += i) {
						arr[k] = 1;

					}
				}
			}
		}
		return count;

	}

}

public class MainClass {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			int n = Integer.parseInt(line);

			int ret = new Solution().countPrimes(n);

			String out = String.valueOf(ret);

			System.out.print(out);
		}
	}
}