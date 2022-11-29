package NumberProgrammesJava;

public class Vowelorconsonenet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'a';
		String vowels = "aeiou";
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		} else {
			System.out.println(ch + " is consonant");
		}

		switch (ch) {
		case 'e':
			System.out.println(ch + " is vowel e");
		case 'a':
			System.out.println(ch + " is vowel a");
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");

			break;

		default:
			System.out.println(ch + " is consonant");
			break;
		}

	}
}
