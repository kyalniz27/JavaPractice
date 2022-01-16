package javaQuestions;

public class ReverseStringWithStringBuffer {

	public static void main(String[] args) {
		
		//1st Method with string buffer or string builder
		//You have to define the value in the method definition otherwise you'll get error if you want to assign a value to variable later
//		StringBuffer str = new StringBuffer("naC afatsuM");
//		System.out.println(str.reverse());
		
		
		//2nd Method using for loop
		String name = "naC afatsuM";
		String str = "";
		
		for(int i = name.length()-1; i >= 0; i--) {
			str += name.charAt(i);
		}
		
		System.out.println(str);
		
		
	

	}

}
