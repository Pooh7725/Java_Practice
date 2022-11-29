package Array;

public class CountElementFrequency {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 9, 3, 5, 1, 4, 1, 3, 5, 1 };
		int count = 0;
		int num = 6;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
