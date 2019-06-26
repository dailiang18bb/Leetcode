package algorithm.No_204_Count_Primes;

import java.io.*;
class Solution {
    public int countPrimes(int n) {
        
//         // Approach 1 
//         // Time Complexity: O(n^2)
//         // Space Complexity: O(1)
        
//         // Edge check
//         if(n<=2){return 0;}
//         int count = 0;
//         for(int i = 2; i < n; i++){
//             // isPrime
//             if(isPrime(i)){
//                 count++;
//             }
//         }
//         return count;
//         // End of Approach 1
        
        
        
        // Approach 2
        // Time Complexity: O(nloglogn)
        // Space Complexity: O(n)
        // Notes: Sieve of Eratosthenes
        
        // Edge check
        if(n<=2){return 0;}
        
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
        
        
        
    
    // // Approach 1 helper
    // public boolean isPrime(int n){
    //     for(int k = 2; k <= Math.sqrt(n); k++){
    //         if(n % k == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // // End of Approach 1 helper
    
    
    
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