package learning;

import java.util.Arrays;
import java.util.List;

public class StringEx {
	
	public static void main(String[] args) {
		
		// creating string
		String str = "hello world"; // string literals
		String str1 = "hello"; // here str and str1 will point to the same memory location since they have same text
		
		String name = new String("welcome");
		
		// methods
		String[] array = str.split(" ");
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		
		// trim() removes spaces start and end 
		
		for (int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}

}
