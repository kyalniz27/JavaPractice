package javaQuestions;

public class NumberOfDigits {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Number of digits: " + numberDigits(789573));
		
	}
	
	public static int numberDigits(int num) {
		
		int count = 0;
		
		while(num>0) {
			num = num / 10;
			count++;
		}
		
		return count;
		
	}

}
