package javaQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		long fctorial = 1;
		
		for(int i = 1; i<= num; i++ ) {
			fctorial = fctorial * i;
		}
		
		System.out.println(fctorial);

	}

}
