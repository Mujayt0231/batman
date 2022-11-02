package practice;

public class NumberPalindrome {

	public static void main(String[] args) {

		System.out.println(numberPalindrome(12221));

	}

	static boolean numberPalindrome(int number) {

		int original = number;
		int rev = 0;

		while (number > 0) {

			rev = rev * 10 + number % 10;
			number = number / 10;
		}

		if (rev == original) {
			return true;
		}

		return false;
	}

}
