package testing;

import java.util.*;


public class printArray {
	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		char startChar = 'A';
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		Map<String, Integer> hMap = new HashMap<>();
		Set<String> hSet = new HashSet<>();

		for(int i = 0; i < 10;i++,startChar++) {
			arr[i] = i;
			arrayList.add(i);
			linkedList.add(i);
			hMap.put(startChar + "", i);
			hSet.add(startChar + "");
		}
		
		// print array without loop
		System.out.println("Arrays:::" + Arrays.toString(arr));
		
		// print ListArray without loop
		System.out.println("arrayList:::" + arrayList);
		
		// print ListArray without loop
		System.out.println("linkedList:::" + linkedList);
		
		// print HashMap without loop
		System.out.println("HashMap:::"+hMap);
		
		// print HashMap without loop
		System.out.println("HashSet:::" + hSet);
		
	}
}
