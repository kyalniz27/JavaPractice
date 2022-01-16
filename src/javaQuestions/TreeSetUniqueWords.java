package javaQuestions;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetUniqueWords {

	public static void main(String[] args) {
		
		String phrase = "the quick brown fox the jumps over the lazy dog";
		String[] phraseList = phrase.split(" ");
		
//		int count = 0;
//		for(int i = 0; i < phraseList.length; i++) {
//			if (phraseList[i].contains("the")) {
//				count++;
//			}
//						
//		}
//		
//		System.out.println(count);
		
		Set<String> words = new TreeSet<>();
		//words.addAll(Arrays.asList(phraseList));
		
		for(String x: phraseList) {
			words.add(x);
		}
		
		System.out.println(words);
		

	}

}
