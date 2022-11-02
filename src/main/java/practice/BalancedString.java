package practice;

import java.util.Stack;

public class BalancedString {
	public static void main(String[] args) {
		
		System.out.println(balancedString("{{]"));
		System.out.println(balancedString("[{()}]"));
		System.out.println(balancedString("[({(})]"));
		

	}

	static boolean balancedString(String input) {
		
		if(input.length() % 2 != 0) {
			return false;
		}

		// isBalanced("[{()}]") - true
		// isBalanced("[({(})]") - false
		// isBalanced("{[}") - false
		// isBalanced("({}{}([{}]))") - true
		// isBalanced("({") - false

		Stack<Character> stack = new Stack<Character>();

		for (Character c : input.toCharArray()) {

			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else
				return false;
		}

		return stack.isEmpty();
	}

}
