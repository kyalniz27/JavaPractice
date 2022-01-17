package javaQuestions;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		
		String str = "java   programming    selenium       automation";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
