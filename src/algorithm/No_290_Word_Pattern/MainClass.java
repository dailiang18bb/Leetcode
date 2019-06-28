package algorithm.No_290_Word_Pattern;

import java.io.*;
import java.util.*;

class Solution {
	public boolean wordPattern(String pattern, String str) {

		// Approach 1
		// Time Complexity: O(n^2)
		// Space Complexity: O(n)

//         // Edge check:
//         if(pattern.length() == 0 || str.length() == 0){return false;}

//         String[] splitStr = str.split("\\s");
//         if(pattern.length() != splitStr.length){return false;}

//         Map<Character, String> hm = new HashMap<>();
//         for(int i = 0; i < pattern.length(); i++){
//             char c = pattern.charAt(i);
//             if(hm.containsKey(c)){
// 				if (!splitStr[i].equals(hm.get(c))) {
//                     return false;
//                 }
//             }else{
//                 if(hm.containsValue(splitStr[i])){
//                     return false;
//                 }
//                 hm.put(c, splitStr[i]);
//             }
//         }
//         return true;
//         // End of Approach 1

		
		// Approach 2
		// Time Complexity: O(n)
		// Space Complexity: O(n)
		// Notes: put everything into one HashMap

		// Edge check:
		if (pattern.length() == 0 || str.length() == 0) {
			return false;
		}

		String[] splitStr = str.split("\\s");
		if (pattern.length() != splitStr.length) {
			return false;
		}

		Map<Object, Integer> hm = new HashMap<>();
		for (Integer i = 0; i < pattern.length(); i++) {
			if (hm.put(pattern.charAt(i), i) != hm.put(splitStr[i], i)) {
				return false;
			}
		}
		return true;
		// End of Approach 2
	}
}

public class MainClass {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		line = in.readLine();
		String pattern = line;
		line = in.readLine();
		String str = line;

		boolean ret = new Solution().wordPattern(pattern, str);

		System.out.print(ret);

	}
}