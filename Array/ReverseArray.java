package Array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 6, 8 };
		int[] revdata = new int[data.length];

		for (int i = 0; i < data.length; i++) {
			int j = data.length - i - 1;

			revdata[i] = data[j];
//			System.out.println(revdata[i]);

		}
		System.out.println(Arrays.toString(revdata));

	}
}
