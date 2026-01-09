package learning;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		System.out.println(list);
		list.set(0, "Go");
		System.out.println(list);
		System.out.println(list.get(0));
		

		for(String str: list) {
			System.out.println(str + " arraylist");
		}
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i) + "  >>> <<<<");
		}
		
	}

}
