package Array;

public class Sumofarray {
	public static void main(String[] args) {
		int[] A = { 1, 7, 9, 0, 7 };
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			sum += A[i];

		}
		System.out.println(sum);
	}
}