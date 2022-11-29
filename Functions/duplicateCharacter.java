package Functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class duplicateCharacter {

	public static void main(String[] args) {
		ArrayList<Character> Mydupcharacter = DupliacteCharacter("pookkaaa");
		ArrayList<Character> Anudupcharacter = DupliacteCharacter("anubhav");

		System.out.println(Mydupcharacter);
		System.out.println(Anudupcharacter);

	}

	public static ArrayList<Character> DupliacteCharacter(String str) {

		ArrayList<Character> list = new ArrayList<Character>();
		Map<Character, Integer> dup = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (dup.containsKey(str.charAt(i))) {
				int val = dup.get(str.charAt(i));
				dup.put(str.charAt(i), val + 1);
				System.out.println("found at index : " + i + "  dupchar map is :" + dup);
				list.add(str.charAt(i));
			} else {
				dup.put(str.charAt(i), 1);

			}
		}
		return list;
	}

}
