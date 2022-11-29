package Array;

public class StoreArrayinreverse {

	public static void main(String[] args) {
		String arr[] = { "my", "name" };
//		System.out.println(arr);
		String rev[] = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int j = arr.length - i - 1;
			rev[i] = arr[j];
			System.out.println(rev[i]);
		}
		String a[] = new String[rev.length];
		System.out.println();
	}
}
