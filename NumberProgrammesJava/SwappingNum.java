package NumberProgrammesJava;

public class SwappingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 13;
		int b = 7;
		System.out.println("before swapping");
		System.out.println("a =" + a);
		System.out.println("b =" + b);

		System.out.println("after swapping");

		a = b - a;
		b = b - a;
		a = b + a;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
	}

}
