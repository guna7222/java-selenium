package learning;

public class ReverseString {
	public static void main(String[] args) {
		
		String str = "I love java";
		String reverse = "";
		
		char[] reverseArray = str.toCharArray();
		for (int i = reverseArray.length -1; i>=0 ; i--) {
			reverse = reverse + reverseArray[i];
		}
		
		System.out.println(reverse);
 	}

}
