package Array;

public class Findeleinarray {

	public static void main(String[] args) {
		String[] countries = { "india", "pak", "japan", "indo" };
		// find indo & return index

		String str = " china";
		boolean isfound = false;
		int index = -1;
		for (int i = 0; i < countries.length; i++) {
			if (countries[i] == str) {
				isfound = true;
				index = i;
				break;

			}
		}
		if (isfound) {
			System.out.println(str + " found at " + index);
		}

		else {
			System.out.println(str + " not found  ");

		}
	}

}
