package ch03_op;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		System.out.println("������ ������ ����� �Է� �ϼ��� ��(-10, 7)");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.printf("%d �� ���밪�� : %d", num, (num > 0) ? num : (num < 0) ? -num : 0);	
	}
}
