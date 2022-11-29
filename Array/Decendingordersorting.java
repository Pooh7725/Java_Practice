package Array;

import java.util.Arrays;
import java.util.Collections;

public class Decendingordersorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		// Sorts arr[] in descending order using
		// reverseOrder() method of Collections class
		// in Array.sort() as an argument to it

		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("modified array is :" + Arrays.toString(arr));
	}

}
