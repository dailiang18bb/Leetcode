package testing;

public class StringPool {
	
	
	public static void main(String[] args) {
		String aString = "Cool";
		String bString = "Cool";
		System.out.println(aString == bString);
		System.out.println(aString.hashCode());
		System.out.println(bString.hashCode());
		System.out.println();


		System.out.println(aString.equals(bString));

	}

}
