package ch03_op;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		System.out.println("����� �ʸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int h = 12345 / 3600 ;
		int m = (12345 % 3600) / 60;
		int s = (12345 % 3600) % 60;

		System.out.print(h + "�� ");
		System.out.print(m + "�� ");
		System.out.print(s + "�� ");
	}
}
