package Array;

import java.util.ArrayList;

public class findalloccurance {

	public static void main(String[] args) {
		String[] names = { "pooja", "anubhav", "poo", "pooja ", "poo", "anu", "anu" };
		String str = "poo";
		ArrayList<Integer> indexs = new ArrayList<Integer>();
		for (int i = 0; i < names.length; i++) {
			if (names[i] == str) {
				indexs.add(i);
			}

		}
		System.out.println(indexs);
	}
}