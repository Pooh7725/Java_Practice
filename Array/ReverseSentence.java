package Array;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "Anubhav loves maggie";
		String[] words = reverse(str).split(" ");
		System.out.println(Arrays.toString(words));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(reverse(words[i]));
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}

	public static String reverse(String str) {

		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		return rev;

	}
}