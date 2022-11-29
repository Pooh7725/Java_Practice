package Array;

import java.util.HashMap;

public class Duplicatecharacter {

	public static void main(String[] args) {
		String name = " anubhav";
		HashMap<Character, Integer> D = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			if (D.containsKey(name.charAt(i))) {
//				int val = D.get(name.charAt(i));
//				D.put(name.charAt(i), val + 1);
				System.out.println("dup char at :" + i + " index" + " dupchar is :" + name.charAt(i));
			} else {
				D.put(name.charAt(i), 1);
			}

		}

	}

}
