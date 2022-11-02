package practice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 312, 3, 123, 1, 24, 12, 4, 5 };

		System.out.println(Arrays.toString(sortedArray(array)));
	}

	static int[] sortedArray(int[] array) {

		if (array.length == 0) {
			return array;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				int temp = 0;

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}

		return array;
	}

}
