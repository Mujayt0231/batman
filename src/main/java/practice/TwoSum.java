package practice;

public class TwoSum {

	public static void main(String[] args) {

		int[] numbers = { 1, 4, 6, 8, 9, 12, 17, 19, 21, 28, 45, 67 };
		int target = 22;
		twoSum(numbers, target);

	}

	public static void twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + i; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {

					System.out.println("position of i ==> " + i + " && position of j ==> " + j);
				}

			}
		}

	}

}
