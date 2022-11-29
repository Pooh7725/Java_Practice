package Array;

import java.util.Scanner;

public class printint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value of a[" + i + "]");
			a[i] = sc.nextInt();

		}
		String str = "anuanu";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		for (int i = 0; i < a.length; i++) {
			System.out.println("value of a[" + i + "]: " + a[i]);
		}
	}

}
