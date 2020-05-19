package testing;


import java.util.*;
public class checkType {
	public static void main(String[] args) {
		
		//System.out.println("schwiffy".getType().equals("String"));
		System.out.println("schwiffy" instanceof String);
		System.out.println("schwiffy".getClass().getSimpleName().equals("String"));
		//System.out.println("schwiffy".getType() == String);
		//
		
		System.out.println(String.class);
		System.out.println("abs".getClass().getName());
		String aString = "";
		System.out.println("abs".getClass().getName().equals(String.class));
		
		
 
		
	}

}
