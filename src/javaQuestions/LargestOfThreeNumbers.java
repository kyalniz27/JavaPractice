package javaQuestions;

public class LargestOfThreeNumbers {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 15;
		int c = 100;
		
		int largest = a > b ? a : b;
		largest = largest > c ? largest : c;
		System.out.println("Largest number is: " + largest);
		
	}

}
