package javaQuestions;

import java.util.HashSet;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		
		char[] arr = {'M','u','s','t','a','f','a'};
		
//		boolean flag = false;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Found duplicate element: " + arr[i]);
//					flag = true;
//				}
//			}
//		}
//		
//		if(flag==false) {
//			System.out.println("Duplicate not found");
//		}
		
		// Approach 2 - Using HashSet because it doesn't allow duplicate value
		
		HashSet<Character> hs = new HashSet();
		
		boolean flag = false;
		
		for (Character x: arr) {
			if(hs.add(x)==false) {
				System.out.println("Duplicate element: " + x);
				flag = true;
			}
		}
		
		if(flag==false) {
			System.out.println("Not found duplicate");
		}
	}

}
