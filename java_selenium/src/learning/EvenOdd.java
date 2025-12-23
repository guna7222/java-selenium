package learning;

public class EvenOdd {

	public static void main(String[] args) {
		int[] num = { 10, 12, 2, 3, 10 };
		for (int j : num) {
			if (j % 2 == 0) {
				System.out.println("even:" + j);
			}else {
				System.out.println("odd:" + j);
			}
		}

	}
}
