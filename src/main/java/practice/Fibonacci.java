package practice;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Hello");

		System.out.println(fib(2));
	}

	static int fib(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		int a = 0;
		int b = 1;
		int sum = 0;

		for (int i = 1; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}

		return sum;

	}

}
