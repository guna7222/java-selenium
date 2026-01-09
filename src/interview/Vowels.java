package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vowels {

	public static void main(String[] args) {

		// count vowels in a string
		// first convert string to char array
		// store vowels in a char array
		// create one new list and add vowels into it by looping
		// loop through the name
		// convert char array to list so we can use contains method to check

		String name = "names";
		int count = 0;
		char[] checkingVowels = name.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		List<Character> list = new ArrayList<>();
		for(char c: vowels) {
			list.add(c);
		}
		
		for(char c: checkingVowels) {
			if(list.contains(c)) {
				count+=1;
			}
		}
		System.out.println(count);

	}

}
