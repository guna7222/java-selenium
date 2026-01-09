package interview;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesString {
	
	public static void main(String[] args) {
		
		// remove duplicates in a string 
		// convert string to array then convert that string to list
		// create one empty list 
		// loop through the empty list if element is not found then add to the list
		
		String name ="Java";
		
		char[] charArrayName = name.toCharArray(); //['j',]
		List<Character> list1 = new ArrayList<>();
		
		for(char c: charArrayName) {
			list1.add(c);
		}
		
		List<Character> unique = new ArrayList<>();
		
		for(Character cc: list1) {
			if(!unique.contains(cc)) {
				unique.add(cc);
			}
		}
		
		System.out.println(unique);
		
		StringBuilder builder = new StringBuilder();
		for(Character c : unique) {
			builder.append(c);
		}
		
		System.out.println(builder);
		
	}

}
