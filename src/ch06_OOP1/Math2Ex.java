package ch06_OOP1;

/*
 * ��� �޼����� ����
 * Ŭ���� �޼���, �ν��Ͻ� �޼���
 */
class Math2 {
	int a, b;
	int x;
	
// �ν��Ͻ� �޼��� : ��üȭ�� �Ǿ�� �޼����� ȣ���� ������. ����������.�޼����() ȣ���ؾ���.
	int add1() {
		for (int i=0; i<5; i++) {
			int x = 7;
		}
		System.out.println(x);
		return a + b;
	}
// Ŭ���� �޼��� : Ŭ�������� �ε�ɶ� �޼����� ȣ���� ������. Ŭ������.�޼����() ȣ���� �� �ִ�.
	static int add2(int a, int b) {
		// x = 5;
		return a + b;
	}
}

public class Math2Ex {

	public static void main(String[] args) {
		
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(m.add2(100, 200));
		System.out.println(Math2.add2(100, 200));
	}

}
