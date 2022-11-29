package NumberProgrammesJava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner pooja = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = pooja.nextInt();
		if (num % 2 == 0) {
			System.out.println("number is even " + num);
		} else {
			System.out.println("number is odd " + num);
		}

	}
}
