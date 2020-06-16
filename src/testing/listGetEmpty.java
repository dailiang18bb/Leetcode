package testing;

import java.util.ArrayList;
import java.util.List;

public class listGetEmpty {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
//		try {
//			System.out.println(list.get(2));
//		}catch(RuntimeException e){
//			System.out.println("do it");
//		}
		System.out.println(list);
		list.add(2,5);
				
	}

}
