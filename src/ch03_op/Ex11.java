package ch03_op;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		System.out.println("�Ǽ����� ������ �Է��ϼ��� ��(11.5, 20)");
		Scanner scan = new Scanner(System.in);
		double d = scan.nextDouble();
		int a = (int)d;
		
		if(d==a) {
			System.out.println(d + " : ����");
		} else {
			System.out.println(d + " : �Ǽ�");
		}
	}
}
