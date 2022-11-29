package StringQuestion;

public class CountVowelconso {

	public static void main(String[] args) {
		String str = "my name is anubhav";
		int vcount = 0;
		int cCount = 0;
		String Newstr = str.toLowerCase();
		for (int i = 0; i < Newstr.length(); i++) {
			if (Newstr.charAt(i) == 'a' || Newstr.charAt(i) == 'e' || Newstr.charAt(i) == 'i' || Newstr.charAt(i) == 'o'
					|| Newstr.charAt(i) == 'u') {
				vcount++;
			} else if (Newstr.charAt(i) >= 'a' && Newstr.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("vowel count :" + vcount);
		System.out.println("consonant count :" + cCount);

	}

}
