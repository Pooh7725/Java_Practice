package Array;

public class REVERSEARRAY1 {

	public static void main(String[] args) {
		int[] a = { 1, 6, 1, 4, 6, 1, 4, 7, 8 };
		int[] rev = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int j = a.length - i - 1;
//			
			rev[i] = a[j];
			System.out.println(rev[i]);
		}
	}

}
//int[] data = { 1, 2, 3, 6, 8 };
//int[] revdata = new int[data.length];
//
//for (int i = 0; i < data.length; i++) {
//	int j = data.length - i - 1;
//
//	revdata[i] = data[j];
//	System.out.println(revdata[i]);