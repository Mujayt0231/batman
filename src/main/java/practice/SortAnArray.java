package practice;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {

		int[] numbers = { 21, 34, 211, 11, 20, 13, 10 };
		System.out.println("before sorting ==> " + Arrays.toString(numbers));

		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {

					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}
		}

		System.out.println("after sorting ==> " + Arrays.toString(numbers));

	}

}
