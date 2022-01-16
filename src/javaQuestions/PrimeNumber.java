package javaQuestions;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num = 123;
		boolean isPrime = true;
		
		for(int i = 2; i < num; i++) {
			
			if(num % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(num + " is a Prime number.");
		} else {
			System.out.println(num + " is not a Prime number.");
		}
		
	}

}
