package practice;

import java.util.Arrays;

public class ArrayReversed {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(reverseArray(numbers)));

	}

	static int[] reverseArray(int[] array) {

		int j = array.length - 1;

		for (int i = 0; i < array.length / 2; i++) {

			int temp = array[i];
			array[i] = array[j - i];
			array[j - i] = temp;
		}

		return array;
	}

}
