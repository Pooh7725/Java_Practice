package Array;

import java.util.Arrays;
import java.util.Collections;

//import com.google.common.collect.Comparators;

public class SortStringArray {

	public static void main(String[] args) {

		String arr[] = { "quiz.geeksforgeeks.org", "practice.geeksforgeeks.org", "code.geeksforgeeks.org",
				"zuiz.geeksforgeeks.org", "iz.geeksforgeeks.org" };

		Arrays.sort(arr, 1, 4);
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, 1, 4, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

//		String arr1[] = {"badi_string", "c_str", "med_string"};
//		Arrays.sort(arr, );
	}

}
