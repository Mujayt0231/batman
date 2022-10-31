package practice;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		
		System.out.println(EvenOrOdd(3));

	}

	static String EvenOrOdd(int num) {

		if (num % 2 != 0) {

			return "Odd";
		} else
			return "Even";

	}

}
