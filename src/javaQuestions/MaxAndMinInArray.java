package javaQuestions;

public class MaxAndMinInArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int[] arr = {50,30,40,20,70,10};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}  
		}
		
		System.out.println("Max numbers: " + max);
		System.out.println("Min numbers: " + min);

	}

}
