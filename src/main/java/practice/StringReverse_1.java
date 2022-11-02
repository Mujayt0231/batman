package practice;

public class StringReverse_1 {

	public static void main(String[] args) {

		String input = "John";
		System.out.println(reverseString(input));
		System.out.println(reverseStringForLoop(input));

	}

	static String reverseString(String input) {

		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb.reverse();

		String reversedString = sb.toString();

		return reversedString;
	}

	static String reverseStringForLoop(String input) {

		String rev = "";

		for (char c : input.toCharArray()) {
			rev = c + rev;
		}

		return rev;
	}

}
