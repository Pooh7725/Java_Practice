package Array;

public class Nonzero {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 0, 0, 3, 0, 9 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}