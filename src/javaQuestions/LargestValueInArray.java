package javaQuestions;


import java.util.Arrays;

public class LargestValueInArray {
	
	public static void main(String[] args) {
		
//		int max = arrayList(new int[] {1,2,3,4,5,6,7,8});
//		
//		System.out.println(max);
		
		int[] arr = {2,6,3,12,567,0,234,9};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);
		
		
		
	}
	
	static int arrayList(int[] arr) {
		
		int maxValue = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		
		return maxValue;
		
	}

}
