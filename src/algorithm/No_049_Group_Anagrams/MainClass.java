package algorithm.No_049_Group_Anagrams;


import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Approach 1
        // n = strs.length
        // m = longest length of a string in strs
        // Time Complexity: O(n * mlogm)
        // Space Complexity: O(n * m)
        
//         // Edge case
//         if(strs == null || strs.length == 0){
//             return new ArrayList();
//         }
        
        
//         Map<String,List<String>> mHashtable = new Hashtable<>();
//         for(int i = 0; i < strs.length; i++){
//             char[] temp = strs[i].toCharArray();
//             Arrays.sort(temp);
//             String tempString = new String(temp);
            
//             if(mHashtable.containsKey(tempString)){
//                 mHashtable.get(tempString).add(strs[i]);
//             }else{
//                 List<String> tempList = new ArrayList<>();
//                 tempList.add(strs[i]);
//                 mHashtable.put(tempString, tempList);
//             }
//         }
        
//         return new ArrayList(mHashtable.values());
//         // End of Approach 1
        
        
        
        // Approach 2
        // n = strs.length
        // m = longest length of a string in strs
        // Time Complexity: O( n*m)
        // Space Complexity: O( n*m )
        
        // Edge case
        if(strs == null || strs.length == 0){
            return new ArrayList<List<String>>();
        }
        
        
        Map<String, List> mHashMap = new HashMap<>();
        for(String x: strs){
            char[] temp = x.toCharArray();
            int[] charArr = new int[26];
            Arrays.fill(charArr,0);
            for(char k: temp){
                charArr[k - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i< 26;i++){
                sb.append(charArr[i]);
            }
            String key = sb.toString();
            
            if(mHashMap.containsKey(key)){
                mHashMap.get(key).add(x);
            }else{
                List<String> tempList = new ArrayList<>();
                tempList.add(x);
                mHashMap.put(key, tempList);
            }
            
        }
        return new ArrayList(mHashMap.values());
        // End of Approach 2
        
    }
}


public class MainClass {

}
