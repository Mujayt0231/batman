package practice;

public class IsPrime {

	public static void main(String[] args) {
		
		System.out.println(isPrime(97));
		


	}

	
	static boolean isPrime(int num) {
		
		if(num < 2) {
			return false;
			
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}

}
