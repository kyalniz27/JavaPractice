package javaQuestions;

public class RemoveJunkCharacters {
	
	public static void main(String[] args) {
		
		String str = "!@#$%Hello 12345 World%^&*()";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

}
