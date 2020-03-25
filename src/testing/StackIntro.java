package testing;

import java.util.Stack;

public class StackIntro {
	public static void main(String[] args) {
		Stack<Integer> test = new Stack<>();
		test.push(5);
		System.out.println(test.size());
		test.pop();
		System.out.println(test.size());
		System.out.println(test.isEmpty());

	}

}
