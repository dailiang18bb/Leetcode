package algorithm.No_658_Find_K_Closest_Elements;

import java.util.*;

public class MainClass {
	
	
	public static void main(String[] args) {
		Integer[] test = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		Arrays.stream(test).forEach((x) -> System.out.print(x));
		System.out.println(" ");
		
		int target = 7;
		
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1-target) > Math.abs(o2 - target)) return 1;
				return -1;
			}; 
		};
		
		Arrays.sort(test, comparator );
		Arrays.stream(test).forEach((x) -> System.out.print(x));
		
		System.out.println(" ");
		
//		Arrays.sort(test, new Comparator<Integer>()(a,b) -> return  {
//		});
		
		
		
	}

}
