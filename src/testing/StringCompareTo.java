package testing;

import java.time.*;
import java.util.Arrays;

public class StringCompareTo {
	
	public static void main(String[] args) {
		String aString = "c"; // 97, ASCII
		String bString = "a"; // 98, ASCII
		System.out.println(aString.compareTo(bString));
		
		
		System.out.println(LocalDate.now());
		
		String[] a = {"a", "b", "c"};
		String[] b = {"a", "b", "c"};
		String[] c = a;
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		
		String teString = "Hello";
		for(int i = 0; i < teString.length(); i++) {
			System.out.print(teString.charAt(i+1));
		}

		
		
		
	}
	
	

}
