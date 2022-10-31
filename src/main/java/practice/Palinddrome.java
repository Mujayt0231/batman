package practice;

public class Palinddrome {
	
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2, 121, 2222, 22, 33, 21};
		
		for (int i : numbers) {
			
			if(isPalindrome(i)) {
				System.out.println("number ==> " + i + " ,is palindrome");
			}
			
			else {
				System.out.println("number ==> " + i + " ,is not palindrome");
			}
		}
		
		
	}
	
	
	
	
	static boolean isPalindrome(int num) {
		
		int origin = num;
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		if(rev!=origin) {
			return false;
		}
		
		
		return true;
		
	}
	

}
