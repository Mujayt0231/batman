package practice;

import java.util.Stack;

public class Swap {

	public static void main(String[] args) {

		String a = "{}";

		System.out.println(isBalancedPair(a));

	}

	private static boolean isBalancedPair(String a) {

		if (a.length() % 2 != 0) {
			return false;
		}

		Stack<Character> stack = new Stack<Character>();

		for (Character c : a.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else
				return false;
		}
		return stack.isEmpty();
	}

	public static boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false; // base case, all elements need to have a pair. So total count should be even
		}
		Stack<Character> stack = new Stack();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') { // push all opening braces to stack & compare them with closed ones
													// // later.
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') { // if top element in stack is ( and given
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false; // when cases like }}, )), ([}}]) this will return false
			} // stack.push(c)
		}
		return stack.isEmpty(); // when every pair is removed then stack becomes empty & it is true. else false
	}

}
