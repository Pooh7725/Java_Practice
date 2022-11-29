package NumberProgrammesJava;

public class PowerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		int pow = 4;
		long result = 1;
		while (pow != 0) {
			result = result * base;
			--pow;

		}
		System.out.println(result);
	}

}
