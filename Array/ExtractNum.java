package Array;

import java.util.Arrays;

public class ExtractNum {

	public static void main(String[] args) {
//		String str = "page not found 404";
//		System.out.println("the number part is:" + str.replaceAll("[^ 0-9]", ""));
//
//	}
//sort array from index (1 to 4)
		int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

		// Sort subarray from index 1 to 4, i.e.,
		// only sort subarray {7, 6, 45, 21} and
		// keep other elements as it is.
		Arrays.sort(arr, 1, 5);

		// Printing the updated array which is
		// sorted after 2 index inclusive till 5th index
		System.out.println("Modified arr[] : " + Arrays.toString(arr));
	}
}