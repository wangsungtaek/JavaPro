package ch02_val;

public class PrintEx2 {

	public static void main(String[] args) {
		String url  ="www.codechobo.com";	// 17
		//%f:float, %e : exponent, %g : value;
		float f1 = .10f; // 0.10. 1.0e-1
		float f2 = 1e1f;	// 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e4f;
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		System.out.println();
		System.out.printf("d = %f%n", d);
		System.out.printf("d = %14.10f%n", d);	// ��ü 14�ڸ� �� �Ҽ��� 10�ڸ�
		System.out.println();
		System.out.printf("[1234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);		// ������ ����
		System.out.printf("[%-20s]%n", url);	// ���� ����
		System.out.printf("[%.8s]%n", url);		// ���ʿ��� 8���ڸ� ���
	}
}