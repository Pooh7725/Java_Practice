package Array;

public class Functiongreatestnum {

	public static void main(String[] args) {
		int[] A = { 1, 70, 54, 100, 102, 19 };
		int ans = greatestnum(A);
		System.out.println(ans);

	}

	public static int greatestnum(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;

	}
}
