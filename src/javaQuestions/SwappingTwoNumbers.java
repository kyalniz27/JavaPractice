package javaQuestions;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b=20;
		
		System.out.println("Before swapping: " + a + " " + b);
		
		// Logic 1 ==> Third variable 
		/*int temp = a;
		a= b;
		b = temp;*/
		
		// Logic 2 ==> Using + and - operators
		/*a = a+b; //a=30
		b = a-b; //b=10
		a = a-b; //a=20*/
		
		// Logic 3 ==> Using * and / operators
		/*a = a*b; //10*20=200
		b = a/b; //200/20=10
		a = a/b; //200/10=20*/
		
		// Logic 4 ==> Single statement
		b = a + b - (a=b);
						
		System.out.println("After swapping: " + a + " " + b);

	}

}
