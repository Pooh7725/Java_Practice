package Array;

public class frequency {

	public static void main(String[] args) {
		int[] f = { 1, 6, 1, 4, 6, 1, 4, 7, 8 };
		int num2 = 1;
		System.out.println(freqCount(f, num2));

	}

	public static int freqCount(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				count++;
			}
		}
		return count;
	}
}