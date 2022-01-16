package javaQuestions;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number that you want to reverse: ");
		int num = input.nextInt();
		
		
		//1. Using algorithm
		/*int rev = 0;
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Your reverse number is " + rev);*/
		
		//2. Using StringBuffer class
		//StringBuffer sb = new StringBuffer(String.valueOf(num));
		//System.out.println("Reverse number is: "+sb.reverse());
		
		//3. Using StringBuilder class
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		System.out.println(sb.reverse());
		
		input.close();
		
		
	}

}
