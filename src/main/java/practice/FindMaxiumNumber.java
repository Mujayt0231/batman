package practice;

public class FindMaxiumNumber {

	public static void main(String[] args) {

		int[] numbers = { 12, 33, 42, 11, 41, 1 };

		System.out.println(findSecondMax(numbers));

	}

	static int findMax(int[] numbers) {

		int max = 0;
		int secondMax = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			} else
				secondMax = numbers[i];
		}

		return max;
	}

	static int findSecondMax(int[] numbers) {

		int max = 0;
		int secondMax = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] > secondMax) {
				secondMax = numbers[i];
			}
		}

		return secondMax;
	}

}
