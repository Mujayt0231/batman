package practice;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		int num = 100;
		
		
		for (int i = 1; i <= 100; i++) {
			
			if( i % 3 == 0 && i % 5 == 0) {
				System.out.println("number: " + i + " ==> FizzBuzz");
			}
			else if(i % 5 == 0) {
				System.out.println("number: " + i + " ==> Buzz");
			}
			else if(i % 3 == 0) {
				System.out.println("number: " + i + " ==> Fizz");
			}
			
			else System.out.println(i);
		}
		
		
		
	}
	
	
	
	

}
