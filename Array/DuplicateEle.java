package Array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEle {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 2, 9, 1, 3, 5, 3, 1 };
		Map<Integer, Integer> occurance = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			if (occurance.containsKey(numbers[i])) {
				int value = occurance.get(numbers[i]);
				occurance.put(numbers[i], value + 1);
			} else {
				occurance.put(numbers[i], 1);
			}
		}
		System.out.println(occurance);
	}

}
