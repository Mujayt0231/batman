package practice;

public class IsPrime {

	public static void main(String[] args) {
		
		//what is prime number ==> 1 is not, 0 is not, 
		
		
		System.out.println(isPrime(2));
		
		


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
