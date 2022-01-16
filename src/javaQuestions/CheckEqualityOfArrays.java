package javaQuestions;

import java.util.Arrays;

public class CheckEqualityOfArrays {
	
	public static void main(String[] args) {
		
		// Approach 1 - Arrays.equals(a,b); method from java.util.Arrays class 
		
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};
		
		boolean status = Arrays.equals(a, b);
		
		if(status == true) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays are NOT equal.");
		}
	}

}
