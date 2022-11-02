package practice;


public class ReverseWords {

	// Reverse words. Write a method that will take a string as an argument.
	// The method will reverse the position of words and return it.

	public static void main(String[] args) {
		String input = "I want banana";

		System.out.println(reverseString(input));

	}

	static String reverseString(String input) {

		String[] array = input.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = array.length - 1; i >= 0; i--) {
			sb.append(" " + array[i]);
		}

		String reversed = sb.toString();

		return reversed.trim();
	}

}
