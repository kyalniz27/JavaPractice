package javaQuestions;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string to check: ");
		String str = input.nextLine();
		String orgStr = str;
		
		String rev = "";
		
		for(int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(orgStr.equals(rev)) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
		}
		
		input.close();
		
		
	}

}
