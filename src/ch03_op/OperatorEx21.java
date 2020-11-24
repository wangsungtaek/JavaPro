package ch03_op;

public class OperatorEx21 {

	public static void main(String[] args) {
		double a = 0.1;
		float b = 0.1f;
		
		System.out.printf("%19.17f\n", a);
		System.out.printf("%19.17f\n", b);
		
		
		System.out.printf("10 == 10.0f \t %b\n", 10 == 10.0f);
		System.out.printf("'0' == 0 \t %b\n", '0' == 0);
		System.out.printf("'\\0' == 0 \t %b\n", '\0' == 0);
		System.out.printf("'A' == 65 \t %b\n", 'A' == 65);
		System.out.printf("'A' > 'B' \t %b\n", 'A' > 'B');
		System.out.printf("'A'+1 != 'B' \t %b\n", 'A'+1 != 'B');
	}
}
