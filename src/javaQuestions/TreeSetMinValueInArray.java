package javaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMinValueInArray {
	
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(9,3,6,7,8,2,5,1,4));
		
		Set<Integer> number=new TreeSet();
		
		number.addAll(arr);
		
		Iterator<Integer> it=number.iterator();
		
		int min=it.next();
		
		System.out.println(min);
		
		
		
	}

}
