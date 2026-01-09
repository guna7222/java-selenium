package interview;

// reverse a string
public class ReverseString {

	public static void main(String[] args) {

		String name = "Name";
		// convert this to char array
		// create one empty string to store reversed string
		// loop from the string end and store it in empty string

		String reversedString = "";

		char[] names = name.toCharArray();

		for (int i = names.length-1; i >= 0; i--) {
			reversedString = reversedString + names[i];
		}
		System.out.println(name);
		
		System.out.println(reversedString);
	}

}
