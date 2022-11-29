package Functions;

import java.util.HashMap;

public class DuplicateElementInArray {

	public static HashMap<Integer, Integer> MyduplicateArray(int[] A) {

		HashMap<Integer, Integer> Hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (Hash.containsKey(A[i])) {
				int val = Hash.get(A[i]);
				Hash.put(A[i], val + 1);
			} else {
				Hash.put(A[i], 1);
			}
		}
		return Hash;

	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 1, 2, 4 };
		HashMap<Integer, Integer> B = MyduplicateArray(A);
		System.out.println(B);
	}
}