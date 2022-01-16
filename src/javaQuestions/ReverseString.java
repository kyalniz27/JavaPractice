package javaQuestions;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = input.nextLine();
		System.out.println("Length of string: " + str.length());
		
		//1. Method
		/*
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}*/
		
		//2. Method
		/*
		String rev = "";
		char[] arr = str.toCharArray();
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + arr[i];
			
		}
		System.out.println(rev);
		*/
		
		//3. Method 
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		input.close();
		
			
		
		
		
		
		
	}

}
