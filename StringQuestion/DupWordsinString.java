package StringQuestion;

public class DupWordsinString {

	public static void main(String[] args) {

		String str = "black is bull bull is black";
		str = str.toLowerCase();
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
					System.out.println(count);
				}

				if (count > 1 && words[j] != "0") {
					System.out.println(count);
				}
				System.out.println(count);
			}
		}
	}
}
