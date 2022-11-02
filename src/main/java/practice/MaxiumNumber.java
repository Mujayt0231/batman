package practice;

public class MaxiumNumber {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 23, 4, 4, 15, 1, 21, 1 };
		System.out.println(maxiumNum(numbers));
		System.out.println(minNum(numbers));

	}

	static int maxiumNum(int[] numbers) {

		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	static int minNum(int[] numbers) {

		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		return min;
	}

}
