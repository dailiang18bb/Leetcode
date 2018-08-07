package algorithm.No_190_Reverse_Bits;

public class Solution {
	
	// 1 Approche
	public static int reverseBits(int n) {
		String a = Integer.toBinaryString(n);
		String output = String.format("%32s", a).replace(' ', '0');
		char[] ch = output.toCharArray();
		String b = new String(arrayReverse(ch));
		long result = Long.parseLong(b, 2);
		return (int)result;
	}

	public static char[] arrayReverse(char[] arr) {
		if (arr == null) {
			return null;
		}

		char[] arrReverse = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrReverse[arr.length - 1 - i] = arr[i];
		}
		return arrReverse;
	}
	
	
	// great Solution
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 

    public int reverseBits (int n){
    	int res = 0;
    	for (int i = 0; i < 32; i++) {
        	res |= (n >>> i & 1) << (31 - i);
    	}
    return res;
	}



	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	//
	
	/**
	 * 
public int reverseBits(int n) {
    if (n == 0) return 0;
    
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result <<= 1;
        if ((n & 1) == 1) result++;
        n >>>= 1;
    }
    return result;
}


	 * 
	 * 
	 */
	

}
