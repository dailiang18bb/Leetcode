package algorithm.No_7_Reverse_Integer;

public class Solution {

	public int reverse(int x) {
		int result = 0;
		char[] ch = String.valueOf(x).toCharArray();
		if (x >= 0) {
			for (int i = 0; i < ch.length; i++) {
				try {
					int y = Math.multiplyExact(Character.getNumericValue(ch[i]), (int) Math.pow(10, i));
					result = Math.addExact(result, y);
				} catch (ArithmeticException e) {
					return 0;
				}
			}
		} else {
			for (int i = 1; i < ch.length; i++) {
				try {
					int y = Math.multiplyExact(Character.getNumericValue(ch[i]), (int) Math.pow(10, i - 1));
					result = Math.subtractExact(result, y);
				} catch (ArithmeticException e) {
					return 0;
				}
			}
		}
		return result;
	}
	
	
	// Pop and Push idea
	public int reverse(int x) {
		int result = 0;
		while(x!=0) {
			//pop
			int y = x % 10;
			x = x/10;
			//check overflow
			if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE && y > 7)) {
				return 0;
			}
			if(result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE && y < -8)) {
				return 0;
			}
			//push
			int temp = result * 10 + y;
			result = temp;
		}
		return result;
	}
	//Time Complexity: O(log(x)), There are roughly log10(x) digits in x
	//Space Complexity: O(1)
	
	
	/**
	 * use reverse function to check overflow
	 * 

   public int reverse(int x) {
        int result = 0;
        while(x!=0){
            int tail = x % 10;
            int newResult=result*10+tail;
            
            if((newResult-tail)/10!=result) return 0;
            result = newResult;
            x = x/10;
        }
        return result;
    }



	 * 
	 * 
	 */
	
	
	// use long type and compare with Max and Min to check over flow
	/**
	 * 
	 * 

 public int reverse(int x) {
        long rev = 0;
        
        while(x != 0){
            rev = rev * 10 + x % 10;
            x /= 10;
            
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        
        return (int)rev;
    }
 
 
 
 
 
 
	 * 
	 * 
	 * 
	 * 
	 */

}
