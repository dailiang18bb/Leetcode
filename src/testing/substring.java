package testing;

import java.util.ArrayList;
import java.util.List;

public class substring {
	
	
	public static void main(String[] args) {
		String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("String length = " + string.length());
		System.out.println("string.substring(0, 0) = " + string.substring(0, 0));
		System.out.println("string.substring(0, 1) = " + string.substring(0, 1));
		System.out.println("string.substring(0, 2) = " + string.substring(0, 2));
		System.out.println("string.substring(0, 26) = " + string.substring(0, 26));
		System.out.println("string.substring(0, 26) = " + string.substring(26));

		//
		System.out.println("string.substring(0) = " + string.substring(0));
		System.out.println("string.substring(3) = " + string.substring(3));
		
		String testString = "strawberries";
		System.out.println(testString.substring(2,5));
		// raw
		
		List list = new ArrayList<>();
		list.add("Hello");
		list.add(2);
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Integer);
		
	}

}
