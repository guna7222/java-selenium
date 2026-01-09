package learning;

public class Methods {
	
	public void printName() {
		System.out.println("My name is Java");
	}
	
	public String getName() {
		return "returning string";
	}
	
	
	
	public static void main(String[] args) {
		Methods method = new Methods();
		method.printName();
		String name = method.getName();
		System.out.println(name);
	}

}
