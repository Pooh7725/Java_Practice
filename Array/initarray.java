package Array;

public class initarray {

	public static void main(String[] args) {
		int[] data = { 1, 3, 7, 0, 9 };
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);

		}
		System.out.println();
		int data1[];
		data1 = new int[] { 1, 0, 8, 7 };
		for (int i = 0; i < data1.length; i++) {

			System.out.println(data1[i]);
		}
		System.out.println();
		int data2[] = new int[4];
		System.out.println(data2[0]);
		for (int i = 0; i < 4; i++) {
			data2[i] = (i + 1) * 5;
		}
		System.out.println();
		System.out.println(data2[3]);
	}
}