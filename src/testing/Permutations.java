package testing;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		String aString = "wrangler";
		List<String> result = new ArrayList<>();
		permuHelper(aString, "", result);
		System.out.println("Length of String" + aString + " is " + aString.length());
		int nums = 1;
		for(int i = 2; i < aString.length() + 1; i++) {nums*=i;}
		System.out.println("String " + aString + " should have " + aString.length() + "! = " + nums + " permutations" );
		System.out.println(result.size());
		System.out.println(result);
	}
	
	private static void permuHelper(String string, String path, List<String> result) {
		if(string.length() == 0) {
			result.add(path);
		}
		for(int i = 0; i < string.length(); i++) {
			permuHelper(string.substring(0, i) + string.substring(i+1), path + string.charAt(i), result);
		}
	}
}
