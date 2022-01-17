package javaQuestions;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		// Array should be sorted to use binary search
		
		int[] arr = {3,7,2,1,6,7,8,3,45,98,23,90};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.binarySearch(arr,45));
		
		// Reverse or descending order
		Integer[] arr2 = {1,2,3,4,5,6,7,9,0,8};
		Arrays.sort(arr2);
		System.out.println("Ascending order: "+Arrays.toString(arr2));
		Arrays.sort(arr2,Collections.reverseOrder());
		System.out.println("Descending order: "+Arrays.toString(arr2));
		

	}

}
