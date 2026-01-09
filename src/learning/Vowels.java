package learning;

public class Vowels {
	
	public static void main(String[] args) {
		
		char[] vowels = {'a', 'e', 'i', 'o','u'};
		String str = "Hello World";
		char[] charArray = str.toCharArray();
		int count = 0;
		
		for (int i = 0; i<charArray.length; i++) {
			for (int j = 0; j<vowels.length; j++) {
				if(charArray[i] == vowels[j]) {
					count = count + 1;
				}
			}
		}
		System.out.println(count);
	}

}
