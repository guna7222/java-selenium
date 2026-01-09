package learning;

public class ExtractString {
	
	public static void main(String[] args) {
		// Please use temporary password 'rahulshettyacademy' to Login.
		
		String str = "Please use temporary password 'rahulshettyacademy' to Login.";
		
		String[] array1 = str.split("'");
		//System.out.println(array1);
		String password = array1[1];
		System.out.println(password);
		for(String s:array1) {
			System.out.println(s);
		}
	}

}
