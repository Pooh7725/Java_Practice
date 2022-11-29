package Array;

public class Ispalindrom {

	public static void main(String[] args) {

		String str = "ana";
		boolean ispalindrom = true;
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {

			if (str.charAt(i) != str.charAt(j)) {
				ispalindrom = false;
				break;

			}

		}
		if (ispalindrom) {
			System.out.println("string is palindrom ");
		} else {
			System.out.println("string is not palindrom ");
		}
	}
}
