package javaQuestions;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		
		// Array should not have duplicates
		// Array no need to be sorted order
		// Values should be in range
		
		int[] arr = {1,2,3,4,5,7,8,9};
		
		int sum1 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}
		
		System.out.println("Sum of elements in the array is " + sum1);
		
		int sum2 = 0;
		
		for (int i = 0; i <= arr.length+1; i++) {
			sum2 = sum2 + i;
		}
		
		System.out.println("Sum of range of elements in the array is " + sum2);
		
		System.out.println("Missing number is " + (sum2-sum1));
	}

}
