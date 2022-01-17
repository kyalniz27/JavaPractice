package javaQuestions;

import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] str2 = str.split(" ");
		
		int count = 0;
		
		for(int i = 0; i < str2.length; i++) {
			count++;
		}
		
		System.out.println("Number of words in the string: "+count);
		
		
	}

}
