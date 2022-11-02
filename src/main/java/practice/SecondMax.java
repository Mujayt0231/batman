package practice;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {

		int arr[] = { 12, 35, 1, 10, 34, 1 , 34};
		System.out.println(secondMax(arr));

	}

	static int secondMax(int[] numbers) {

		Arrays.sort(numbers);

		int lastIndex = numbers.length - 1;

		for (int i = lastIndex - 1; i >= 0; i--) {

			if (numbers[i] != numbers[lastIndex]) {
				return numbers[i];
			}

		}

		return 0;

	}

}
