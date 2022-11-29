package NumberProgrammesJava;

public class Arraybruteforece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A[] = { "apple", "mango", "banana", "lichi", "Mango", "apple", "lichi" };
		System.out.println("Brute force");
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if ((A[i]).equals(A[j])) {
					System.out.println(A[i]);

				}
			}
		}
	}
}
