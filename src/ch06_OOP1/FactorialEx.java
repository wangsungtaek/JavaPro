package ch06_OOP1;
/*
 * call stack ����
 * ��͸޼���(�Լ�) : �ڽ��� �ڽŸ޼��带 �ٽ� ȣ���ϴ� �޼���
 *  => ���� ������ �����ϹǷ� ������.
 */


public class FactorialEx {

	public static void main(String[] args) {
		System.out.println("4! =" + factorial(4));
		// 4 * 3 * 2 * 1
	}

	public static int factorial(int i) {
		System.out.println(" i"+ i );
		return (i==1)? 1 : i*factorial(i-1);
	}

}
