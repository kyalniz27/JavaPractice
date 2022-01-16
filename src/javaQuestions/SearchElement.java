package javaQuestions;

public class SearchElement {
	public static void main(String[] args) {
		
		int[] arr = {10,20,40,50,30};
		
		int ele = 60;
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(ele == arr[i]) {
				System.out.println("Element found at: " + i);
				flag = true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Element not found");
		}
		
		
	}

}
