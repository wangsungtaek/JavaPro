package ch03_val;

import java.util.Scanner;
//Scanner�� ����ϱ� ���� �߰�

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³��� :" + input);
		System.out.printf("num=%d%n", num+100);
		
		
		
		
		
	}

}
