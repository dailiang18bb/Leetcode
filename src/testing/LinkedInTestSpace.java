package testing;

import java.util.*;

class CoolClass{
	int add(int a, int b) {
		return a+b;
	}
}


public class LinkedInTestSpace {
	public static void main(String[] args) {
		int a= 010;
		int b = 07;
		System.out.println(a);
		System.out.println(b);
		short s = 9;
//		System.out.println(add(s,6));
		try {
			Float f1 = new Float("3.0");
			int i1 = f1.intValue();
			double d1 = f1.doubleValue();
			Byte b1 = f1.byteValue();
			System.out.println(f1+i1+d1);
		}catch(NumberFormatException e) {
			System.out.println("bad num");
		}
		
		
		int[] arr = null;
		int[] brr = {2};
		System.out.println(Arrays.equals(arr, brr));
		
		
	}

}
