package javaQuestions;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number to check: ");
		int num = input.nextInt();
		int orgNum = num;
		
		int rev = 0;
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(orgNum == rev) {
			System.out.println("It's a palindrome :)");
		}else {
			System.out.println("It's not a palindrome :(");
		}
		
		input.close();
	}

}
