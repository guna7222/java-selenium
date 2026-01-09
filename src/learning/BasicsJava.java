package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicsJava {
	
	public static void main(String[] args) {
		
		// variables and primitive data types
		int a = 10;
		long l = 12;
		float f = 12.4f;
		double d = 124.23123;
		boolean bool = true;
		char c = 'c';
		short s = 121;
		byte b = 12;
		
		// non primitive data types
		String name = "Java";
		System.out.println("my name is: " + name + " and " + bool);
		System.out.println(c);
		System.out.println(bool);	
		
		// arrays : to store multiple values into a single variable
		int[] array = new int[5];
		array[0] = 2;
		array[1] = 5;
		System.out.println(array[0]);
		
		// another way of declaring array
		int[] array1 = {1,2,3};
		System.out.println(array1[0]);
		
		// for loops
		for (int i=0; i<=array1.length -1; i++){
			System.out.println(array1[i]);
			
		}
		
		String[] names = {"java", "python"};
		// enhanced for loop 
		for( String i: names) {
			System.out.println(i);
		}
		
		// if else control statements
		String username = "admin";
		String password = "admin1234";
		if(username.equals("admin") && password.equals("admin1234")) {
			System.out.println("Yes, valid user");
		}else {
			System.out.println("No, your not a user!");
		}
		
		// converting array to Arraylist
		
		List<String> list = Arrays.asList(names);
	}

}
