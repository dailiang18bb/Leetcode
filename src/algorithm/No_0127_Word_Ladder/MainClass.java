package algorithm.No_0127_Word_Ladder;

import com.eclipsesource.json.JsonArray;
import java.util.*;
import java.io.*;


class Solution {

	// Approach 1
	// Time Complexity: O(n * 26^l)
	// Space Complexity: O(n)
	// Notes: BFS
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		HashSet<String> hs = new HashSet<>(wordList);
        if(!hs.contains(endWord)){
            return 0;
        }
        
		int wLen = beginWord.length();
		Queue<String> q = new LinkedList<>();
		q.add(beginWord);
		int steps = 0;
		while (!q.isEmpty()) {
			int len = q.size();
			++steps;
			for (int i = 0; i < len; i++) {
				String curr = q.poll();
                if(curr.equals(endWord)){
                    return steps;
                }
                char[] wordArr = curr.toCharArray();
                for(int k = 0; k < wLen; k++){
                    char temp = wordArr[k];
                    for(char c = 'a'; c <= 'z'; c++){
                        if(c == temp) continue;
                        wordArr[k] = c;
                        String sNew = new String(wordArr);
                        if(hs.contains(sNew)){
                            q.add(sNew);
                            hs.remove(sNew);
                        }
                    }
                    wordArr[k] = temp;
                }
			}
		}
        return 0;
	}
    // End of Approach 1

}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String[] stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String beginWord = stringToString(line);
            line = in.readLine();
            String endWord = stringToString(line);
            line = in.readLine();
//            List<String> wordList = stringToStringList(line);
            
//            int ret = new Solution().ladderLength(beginWord, endWord, wordList);
            
//            String out = String.valueOf(ret);
            
//            System.out.print(out);
        }
    }
}