package noNum.Perform_String_Shifts;

import java.util.*;

class Solution {
    
    // Approach 1
    // Time Complexity: 
    // Space Complexity:
    // Notes:
//     public String stringShift(String s, int[][] shift) {
//         //Edge
//         if(s.length() == 1){
//             return s;
//         }
        
//         List<Character> li = new ArrayList<>();
//         for(char x : s.toCharArray()){
//             li.add(x);
//         }
        
//         for(int i = 0 ; i < shift.length; i++){
//             if(shift[i][0] == 0){
//                 for(int j = 0; j < shift[i][1]; j++){
//                     char temp = li.get(0);
//                     li.remove(0);
//                     li.add(temp);
//                 }
//             }else{
//                 for(int j = 0; j < shift[i][1]; j++){
//                     char temp = li.get(li.size() - 1);
//                     li.remove(li.size() - 1);
//                     li.add(0, temp);
//                 }
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         for(char x : li){
//             sb.append(x);
//         }
//         return sb.toString();
//     }
    // End of Approach 1
    
    
    // Approach 2
    // Notes: count shift first
    
    public String stringShift(String s, int[][] shift) {
        //Edge
        if(s.length() == 1){
            return s;
        }
        
        List<Character> li = new ArrayList<>();
        for(char x : s.toCharArray()){
            li.add(x);
        }
        int left = 0;
        int right = 0;
        for(int i = 0; i < shift.length; i++){
            if(shift[i][0] == 0){
                left += shift[i][1];
            }else{
                right += shift[i][1];
            }
        }
        int move = (left - right) % s.length();
        
        if(move > 0){
            for(int k = 0; k < move; k++){
                char temp = li.get(0);
                li.remove(0);
                li.add(temp);
            }
        }else if(move < 0){
            for(int k = 0; k > move; k--){
                char temp = li.get(li.size() - 1);
                li.remove(li.size() - 1);
                li.add(0, temp);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char x : li){
            sb.append(x);
        }
        
        return sb.toString();
    }
    // End of Appraoch 2

}