package practice;


public class StringPalindrome {

	public static void main(String[] args) {

		String input = "c";
		System.out.println(isPalindrome(input));

	}

	static boolean isPalindrome(String input) {

		int j = input.length() - 1;

		for (int i = 0; i < input.length() / 2; i++) {

			if (input.charAt(i) != input.charAt(j - i)) {
				return false;
			}

		}

		return true;

	}

}
