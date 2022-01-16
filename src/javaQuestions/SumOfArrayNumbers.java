package javaQuestions;

public class SumOfArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,2,7,6,9};
		
		int sum = 0;
		
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
		
		// Enhanced for loop
		for (int i : arr) {
			sum += i;
		}
		
		System.out.println("Sum of the array: " + sum);

	}

}
