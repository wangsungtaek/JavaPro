package ch05_Array;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] binary = new int[32];
		System.out.println("2���� ��ȯ�� 10������ �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int divnum = num, index=0;

		while(divnum != 0) {
			binary[index++] = divnum % 2;
			divnum /= 2;
		}
		System.out.println(index);
		System.out.print(num + "�� 2���� : ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
	}
}
