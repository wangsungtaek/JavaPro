package ch02_val;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("======================");
		System.out.println("�Է³��� = " + input);
		System.out.printf("num = %d%n", num+22);
	}
}
