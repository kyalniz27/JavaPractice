package javaQuestions;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java programming Java OOPS";
		
		char ch = 'a';
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==ch) {
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}
