package algorithm.No_784_Letter_Case_Permutation;

import java.io.*;
import com.eclipsesource.json.*;
import java.util.*;

class Solution {

	// Approach 1
	// Time Complexity: O(n^2)
	// Space Complexity: O(n^2)
	// Notes: DPS

	public List<String> letterCasePermutation(String S) {
		// Edge case
		if (S == null) return new ArrayList<>();

		List<String> res = new ArrayList<>();
		helper(0, S.toCharArray(), res);
		return res;
	}

	private void helper(int pos, char[] path, List<String> res) {
		if (pos == path.length) {
			res.add(new String(path));
			return;
		} else {
			if (Character.isLetter(path[pos])) {
				path[pos] = Character.toUpperCase(path[pos]);
				helper(pos + 1, path, res);
				path[pos] = Character.toLowerCase(path[pos]);
			}
			helper(pos + 1, path, res);

		}
	}
}

public class MainClass {
	public static String stringToString(String input) {
		return JsonArray.readFrom("[" + input + "]").get(0).asString();
	}

	public static String stringListToString(List<String> stringList) {
		StringBuilder sb = new StringBuilder("[");
		for (String item : stringList) {
			sb.append(item);
			sb.append(",");
		}

		sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			String S = stringToString(line);

			List<String> ret = new Solution().letterCasePermutation(S);

			String out = stringListToString(ret);

			System.out.print(out);
		}
	}
}