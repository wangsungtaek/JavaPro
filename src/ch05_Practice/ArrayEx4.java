package ch05_Practice;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] binary = new int[32];
		System.out.println("2���� ��ȯ�� 10������ �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;
		
		while(num != 0) {
			binary[count++] = num % 2;
			num /= 2;
		}
		System.out.println(count);
		for(int i=count-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
	}
}
