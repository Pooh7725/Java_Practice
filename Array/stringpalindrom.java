package Array;

public class stringpalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aman";
		boolean ispalindrom = true;

		for (int i = 0, j = s.size() - 1; i < s.size() / 2; i++, j--)
			;
		if (s.charAt(i) != s.charAt(j)) {
			ispalindrom = false;

		}
		if (ispalindrom = true) {
			System.out.println("is palindrom");
		} else {
			System.out.println("is not palindrom");
		}
	}

}
